# syntax = docker/dockerfile:experimental
FROM gradle:jdk17 as builder
WORKDIR /project
COPY src ./src
COPY build.gradle.kts ./build.gradle.kts
RUN --mount=type=cache,target=./.gradle gradle clean test shadowJar

FROM openjdk:17 as backend
WORKDIR /root
COPY --from=builder /project/build/*.jar ./app
ENTRYPOINT ["java", "-jar", "/root/app"]
