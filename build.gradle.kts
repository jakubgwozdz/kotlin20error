plugins {
    kotlin("jvm") version "2.0.0"
    application
}

repositories {
    mavenCentral()
}

kotlin.jvmToolchain(21)

application.mainClass = "test.TestKt"
