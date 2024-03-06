import dev.jeka.core.api.java.JkJavaProcess;
import dev.jeka.core.api.project.JkProject;
import dev.jeka.core.api.project.JkProjectPackaging;
import dev.jeka.core.api.system.JkLog;
import dev.jeka.core.api.system.JkProcess;
import dev.jeka.core.api.testing.JkTestProcessor;
import dev.jeka.core.api.utils.JkUtilsString;
import dev.jeka.core.tool.JkDoc;
import dev.jeka.core.tool.KBean;
import dev.jeka.core.tool.builtins.project.ProjectKBean;

import java.nio.file.Path;
import java.nio.file.Paths;

class Build extends KBean {

    final JkProject project = load(ProjectKBean.class).project;

    /*
     * Configures KBean project
     * When this method is called, option fields have already been injected from command line.
     */
    @Override
    protected void init() {
        project.flatFacade().setMainClass("auto");

    }

    // does not work : java.lang.UnsatisfiedLinkError: No awt in java.library.path
    @JkDoc("Build a native Image")
    public void nativeImg() {
        Path javaHome = JkJavaProcess.CURRENT_JAVA_HOME;
        Path jar = project.artifactLocator.getMainArtifactPath();
        String relTarget = JkUtilsString.substringBeforeLast(jar.toString(), ".jar");
        Path target = Paths.get(relTarget).toAbsolutePath();
        Path nativeImageExe = javaHome.resolve("bin/native-image");
        JkProcess.of(nativeImageExe.toString(), "--no-fallback")
                .addParams("-H:+UnlockExperimentalVMOptions")
                .addParams("-H:IncludeResources=c.*\\.yaml$")
                .addParams("-H:IncludeResourceBundles=MessagesBundle")
                .addParams("-jar", jar.toString())
                .addParams("-H:Name=" + target)
                .setLogCommand(true)
                .setLogWithJekaDecorator(true)
                .exec();
        JkLog.info("Generated in %s", target);
        JkLog.info("Run: %s -f dragon Hello Jeka", relTarget);
    }

}