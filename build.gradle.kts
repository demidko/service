repositories {
  mavenCentral()
  maven("https://jitpack.io")
}
plugins {
  kotlin("jvm") version "1.7.10"
  id("com.github.johnrengelman.shadow") version "7.1.2"
}
dependencies {
  implementation("io.ktor:ktor-server-core-jvm:2.0.3")
  implementation("io.ktor:ktor-server-netty-jvm:2.0.3")
  implementation("ch.qos.logback:logback-classic:1.2.11")
  testImplementation("io.ktor:ktor-client-cio:2.0.3")
  testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
  testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.25")
  testImplementation("io.mockk:mockk:1.12.4")
}
tasks.compileKotlin {
  kotlinOptions.jvmTarget = "17"
  kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.time.ExperimentalTime"
}
tasks.compileTestKotlin {
  kotlinOptions.jvmTarget = "17"
  kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.time.ExperimentalTime"
}
tasks.test {
  useJUnitPlatform()
}
tasks.jar {
  isZip64 = true
  manifest.attributes("Main-Class" to "AppKt")
}
tasks.shadowJar {
  minimize() // if build is unsuccessful, you can disable it
  // also, if build still unsuccessful, you can try to add mergeServiceFiles() call
}
tasks.build {
  dependsOn(tasks.shadowJar)
}
