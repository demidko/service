## Projekt-jar

Kotlin Microservice Project Template produces self-executable jar application. For brevity, double-space formatting is
used. [`Clikt`](https://ajalt.github.io/clikt/whyclikt/) is included for parsing command line
arguments. [`Ktor`](https://ktor.io/) is included to mock Digital Ocean healthy checks.

### Usage
* Just click [`this button`](https://github.com/demidko/Projekt/generate) to use template.

### Deploy to cloud with [`Digital Ocean`](https://cloud.digitalocean.com/)

* Select repository [`here`](https://cloud.digitalocean.com/apps) to start microservice.

### Run with [`Docker`](https://www.docker.com/products/docker-desktop)

* Execute command `docker-compose up` to start the application in a container.

### Build with [`Gradle`](https://gradle.org/)

* Execute command `gradle clean test shadow` to build self-executable jar.

Then you can start the application with the `java -jar *.jar` command.
