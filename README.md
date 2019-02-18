# jmockit Demo

Since 1.42 JMockit requires a Javaagent set up to run tests. 

## Eclipse
With Eclipse a plugin can be installed (currently the update site has to be used):
https://marketplace.eclipse.org/content/jmockit-eclipse 

## Intellij

### Building with Maven
The javaagent is added automatically to the JVM Options.

### Building with Gradle
The javaagent has to be specified explicitly:
`-javaagent:<path>\jmockit-1.45.jar`
You can also try `-javaagent:"<path>\jmockit-1.45.jar"` or forward slashes.

 => Sometimes this either fails with Intellij just not picking up the javaagent but only using its own.
 
 => Sometimes this fails due to a missing Manifest file.


When just the tests fail try to add the following to the build.gradle:

    test {
        jvmArgs "-javaagent:${classpath.find { it.name.contains("jmockit") }.absolutePath}"
    }
