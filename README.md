## Service

Kotlin service project template produces self-executable jar application. For brevity, double-space
formatting is used. [`Clikt`](https://ajalt.github.io/clikt/whyclikt/) is included for parsing
command line arguments. [`Ktor`](https://ktor.io/) is included to mock Digital Ocean healthy checks.

### Template usage

* Just click [`here`](https://github.com/demidko/service/generate) to use template.

### Build application

* Execute command `./gradlew clean test shadowJar` to build self-executable jar.

Then you can start the application with the `java -jar *.jar` command.

### Or, run with [`Docker`](https://www.docker.com/products/docker-desktop)

* Execute command `docker-compose up` to start the application in a container.

Also, you can customize application arguments via `ARGS` Environment
Variable,`ARGS=... docker-compose up` for example.

### Or, deploy to cloud with [`Digital Ocean`](https://cloud.digitalocean.com/)

* Select repository [`here`](https://cloud.digitalocean.com/apps) to start microservice.

Then you can customize application arguments via `ARGS` Environment Variable.


