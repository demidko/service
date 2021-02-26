# syntax = docker/dockerfile:experimental
FROM gradle:jdk15 as builder
WORKDIR /root
COPY src ./src
COPY build.gradle.kts ./build.gradle.kts
RUN gradle clean test shadowJar

FROM openjdk:15-alpine as backend
WORKDIR /root
COPY --from=builder /root/*.jar ./application