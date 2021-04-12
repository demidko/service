## Service

Kotlin microservice template produces self-executable jar application. For brevity, double-space
formatting is used. [`Ktor`](https://ktor.io/) is included to mock Digital Ocean healthy checks.

### Usage

Make sure you are signed in to your GitHub account, then just
click [`here`](https://github.com/demidko/service/generate) to use template.

### Build

Execute `./gradlew clean test shadowJar`. Your jar will be located at `./build/libs`.

### Deploy

[![Deploy to DO](https://www.deploytodo.com/do-btn-blue-ghost.svg)](https://cloud.digitalocean.com/apps/new?repo=https://github.com/demidko/service/tree/main)

