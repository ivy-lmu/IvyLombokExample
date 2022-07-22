# IvyLombokExample
This sample shows how to integrate the Lombok library (https://projectlombok.org/) into an Axon Ivy project. Lombok 1.18.18 and Axon Ivy 9.3.4 is used.

## Setup
The [commit](https://github.com/ivy-lmu/IvyLombokExample/commit/1c96d3097c511c29b3c0b8c34c1a303507e1742a)
illustrates what changes are required in your Ivy Project to use Lombok.
In order to make Lombok work in Axon Ivy Designer and with Maven, the following settings must be made.

### Axon Ivy Designer
Append `-javaagent:/Use/your/path/.m2/repository/org/projectlombok/lombok/1.18.18/lombok-1.18.18.jar` to the AxonIvyDesigner.ini
which is located in your Axon Ivy Designer directory. Make sure you use your path to the Lombok Jar.

### Maven
Set `export MAVEN_OPTS=-javaagent:/Use/your/path/.m2/repository/org/projectlombok/lombok/1.18.18/lombok-1.18.18.jar` before running maven commands.
Our [ci.yaml](https://github.com/ivy-lmu/IvyLombokExample/blob/1c96d3097c511c29b3c0b8c34c1a303507e1742a/.github/workflows/ci.yml#L22)
also indicates how to use Maven and Lombok.
