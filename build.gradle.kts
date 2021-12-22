buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        gradlePluginPortal()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("io.johnsonlee:sonatype-publish-plugin:1.2.0")
    }
}

group = "io.johnsonlee.template"
version = "1.0.0-SNAPSHOT"
