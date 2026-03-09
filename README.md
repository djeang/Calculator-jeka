# JeKa Demo - Calculator

A very basic calculator application created using Java 21 (**Swing**) and built with JeKa.



## Run the application from anywhere
```shell
jeka -r https://github.com/djeang/Calculator-jeka.git#0.0.3 -p
```

First run takes longer because JeKa clones the repo, downloads required JDK (if needed) and builds the application 
behind the scenes.

`-r` option followed by a URL indicates the remote repository to use as the project root.

`-p` option indicates that we want to run the program, once built. 
It may be followed by arguments that will be passed as program arguments to the application.

## Or run the application from the repo 

You can also clone the repo on your local machine and launch the application 
from the repo root directory.

```shell
./jeka -p
```

## Or Install the application locally
```shell
jeka app: install repo=calculator@djeang runtime=BUNDLE
```
Installs a standalone desktop app that runs without JeKa.

## Edit in IntelliJ

To enable editing the Java source code from IntelliJ, execute:

```shell
./jeka intellij:sync
```

## More info

```shell
./jeka --help
```

## Screenshots

![Calculator - Standard Light](screenshots/standard-light.png)
![Calculator - Scientific Dark](screenshots/scientific-dark.png)

