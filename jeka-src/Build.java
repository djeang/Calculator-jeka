import dev.jeka.core.api.project.JkProject;
import dev.jeka.core.api.project.JkProjectPackaging;
import dev.jeka.core.api.testing.JkTestProcessor;
import dev.jeka.core.tool.KBean;
import dev.jeka.core.tool.builtins.project.ProjectKBean;

class Build extends KBean {

    final JkProject project = load(ProjectKBean.class).project;

    /*
     * Configures KBean project
     * When this method is called, option fields have already been injected from command line.
     */
    @Override
    protected void init() {
        load(ProjectKBean.class).project.flatFacade()
                .setMainClass("auto");


    }

}