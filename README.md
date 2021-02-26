## Projekt

Kotlin template project without extra gradle-wrapper files. For brevity, double-space formatting is
used. [`Clikt`](https://ajalt.github.io/clikt/whyclikt/) is included for parsing command line
arguments. [`Ktor`](https://ktor.io/) is included to mock Digital Ocean healthy checks.

### Usage
* Just click button `use this template` in GitHub UI.

### Deploy to cloud with [`Digital Ocean`](https://cloud.digitalocean.com/)

1. Select repository [`here`](https://cloud.digitalocean.com/apps) to start microservice.
1. Go to `components` tab and set environment variable `$BACKEND_OPTIONS` to `--digital-ocean` value.

### Run with [`Docker`](https://www.docker.com/products/docker-desktop)

* Execute command `docker-compose up` to start the application in a container.

### Build with [`Gradle`](https://gradle.org/)

* Execute command `gradle clean test shadowJar` to build self-executable jar.

Then you can start the application with the `java -jar *.jar` command.
