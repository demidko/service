# syntax = docker/dockerfile:experimental
FROM gradle:jdk15 as builder
WORKDIR /application
COPY src ./src
COPY build.gradle.kts ./build.gradle.kts
RUN --mount=type=cache,target=./.gradle gradle clean test shadowJar

FROM openjdk:15-alpine as backend
WORKDIR /root
COPY --from=builder /application/*.jar ./application
