# JeKa Demo - Calculator

A basic calculator desktop application written in Java (**Swing**) and built with JeKa.
It shows how to run a GUI application directly from its Git repository, and how to install it as a
self-contained desktop application (`bundle` KBean, based on *jpackage*).

## Prerequisites

- [JeKa installed](https://jeka-dev.github.io/jeka/installation/), for the `jeka` commands.
  Commands starting with `./jeka`, run from a clone of this repository, don't need it.
- Git and network access. JeKa downloads the JDK it needs.

## Run the application from anywhere

```shell
jeka -r https://github.com/djeang/Calculator-jeka.git#0.0.3 -p
```

On the first run, JeKa asks you to confirm that you trust this repository. The first run also takes longer
because JeKa clones the repo, downloads the JDK (if needed) and builds the application.

- `-r` followed by a URL makes JeKa use the Git repository as the project root. `#0.0.3` selects a tag.
- `-p` runs the program once built. Arguments after `-p` are passed to the application.

## Or run the application from a clone

```shell
git clone https://github.com/djeang/Calculator-jeka.git
cd Calculator-jeka
./jeka -p
```

Run the tests and create the jar in `jeka-output/`:
```shell
./jeka project: test pack
```

## Or install the application locally

```shell
jeka app: install repo=calculator@djeang runtime=BUNDLE
```

`calculator@djeang` refers to this repository in the *djeang* catalog. This installs a standalone desktop
application that runs without JeKa.

To create the bundle (a `.dmg` on macOS) in `jeka-output/` from a clone, run:
```shell
./jeka bundle: pack
```

## Edit in IntelliJ

To enable editing the Java source code from IntelliJ, execute:

```shell
./jeka intellij: sync
```

## How it works

- [jeka.properties](jeka.properties): JeKa and Java versions, and the icons used by *jpackage* per platform.
- [jeka.project.deps](jeka.project.deps): compile and test dependencies.
- `jeka` and `jeka.ps1`: scripts that run JeKa without installing it.

## More info

```shell
./jeka --help
```

- [Source-runnable applications](https://jeka-dev.github.io/jeka/tutorials/source-runnable-apps/)
- [app KBean](https://jeka-dev.github.io/jeka/reference/kbeans-app/) and
  [bundle KBean](https://jeka-dev.github.io/jeka/reference/kbeans-bundle/)

## Screenshots

![Calculator - Standard Light](screenshots/standard-light.png)
![Calculator - Scientific Dark](screenshots/scientific-dark.png)
