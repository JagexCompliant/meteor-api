plugins {
    java
    `maven-publish`
}

group = "meteor"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":api"))
    implementation(project(":logger"))

    annotationProcessor(libs.lombok)
    compileOnly(libs.lombok)
    implementation(libs.gson)
    implementation(libs.guava)
    implementation(libs.okhttp)
    implementation(libs.commons.csv)
}

tasks.test {
    useJUnitPlatform()
}

tasks.compileJava {
    sourceCompatibility = JavaVersion.VERSION_17.toString()
    targetCompatibility = JavaVersion.VERSION_17.toString()
}