# Jeka Demo - Calculator

A very basic calculator application created using Java **Swing**.

## Run the application from anywhere
```shell
jeka -r https://github.com/djeang/Calculator-jeka.git -p
```

First run takes longer because JeKa clone the repo, download required JDK (if needed) and build the application 
behind the scene.

`-r` option indicates that JeKa should be launched from this repo root.

`-p` option indicates that we want to run the program, once built. 
It may be followed by arguments that will be passed as program arg to the application.

## Run the application from the repo 

You can also clone the repo on your local machine and launch the application 
from the repo root directory.

```shell
jeka -p
```

## Edit in Intellij

To enable editing the Java source code from IntelliJ, execute:

```shell
jeka intellij: iml initProject
```

## More info

```shell
jeka --help
```

## Screenshot

![Calculator - screenshot](screenshots/standard-light.png) 

