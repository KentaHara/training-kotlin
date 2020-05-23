# Demo Project

## Setup Logs

### Install gradle

```bash
$ brew install gradle
$ gradle --version

------------------------------------------------------------
Gradle 6.4.1
------------------------------------------------------------

Build time:   2020-05-15 19:43:40 UTC
Revision:     1a04183c502614b5c80e33d603074e0b4a2777c5

Kotlin:       1.3.71
Groovy:       2.5.10
Ant:          Apache Ant(TM) version 1.10.7 compiled on September 1 2019
JVM:          13.0.2 (Oracle Corporation 13.0.2+8)
OS:           Mac OS X 10.15.4 x86_64
```

### Create project

```bash
$ gradle init --type=kotlin-application
Starting a Gradle Daemon (subsequent builds will be faster)

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Kotlin) [1..2] 2

Project name (default: training-kotlin): demoproject

Source package (default: demoproject): com.charaken.demoproject


BUILD SUCCESSFUL in 42s
2 actionable tasks: 2 executed
```