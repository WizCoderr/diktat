import com.saveourtool.diktat.plugin.gradle.DiktatExtension
import com.saveourtool.diktat.plugin.gradle.DiktatGradlePlugin

plugins {
    kotlin("jvm") version "1.9.22"
    id("com.saveourtool.diktat") version "2.0.0" apply false
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
    apply<DiktatGradlePlugin>()
    configure<DiktatExtension> {
        diktatConfigFile = rootProject.file("diktat-analysis.yml")
        inputs { include("src/**/*.kt") }
        debug = true
    }
}
