plugins {
     java
}

group = "org.meteorlite"
version = "1.0-SNAPSHOT"

java {
    disableAutoTargetJvm()
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(gradleApi())
    compileOnly(libs.guava)
    compileOnly(libs.java.inject)
    compileOnly(libs.commons.io)
    compileOnly(project(":annotations"))
    compileOnly(project(":api-rs"))
    compileOnly(project(":osrs"))
    compileOnly(project(":api"))
    compileOnly(project(":logger"))
    compileOnly(project(":cache"))
}
tasks{
test {
    useJUnitPlatform()
}
}