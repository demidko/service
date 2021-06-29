repositories {
  mavenCentral()
  maven("https://jitpack.io")
}
plugins {
  kotlin("jvm") version "1.5.20"
  id("com.github.johnrengelman.shadow") version "6.1.0"
}
dependencies {
  implementation("io.ktor:ktor-server-netty:1.6.0")
  implementation("io.ktor:ktor-client-cio:1.6.0")
  implementation("com.github.demidko:redis-utils:2021.07.02")
  implementation("ch.qos.logback:logback-classic:1.3.0-alpha5")
  testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
  testImplementation("com.natpryce:hamkrest:1.8.0.1")
  testImplementation("io.mockk:mockk:1.11.0")
}
tasks.compileKotlin {
  kotlinOptions.jvmTarget = "16"
  kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.time.ExperimentalTime"
}
tasks.compileTestKotlin {
  kotlinOptions.jvmTarget = "16"
  kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.time.ExperimentalTime"
}
tasks.test {
  useJUnitPlatform()
}
tasks.jar {
  isZip64 = true
  manifest.attributes("Main-Class" to "AppKt")
}
tasks.shadowJar {
  minimize()
}
tasks.build {
  dependsOn(tasks.shadowJar)
}