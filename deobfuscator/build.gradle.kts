plugins {
    java
}

group = "org.meteorlite"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://raw.githubusercontent.com/MeteorLite/hosting/main/repo/") }
}

dependencies {

    implementation(project(":annotations"))
    implementation(project(":api"))
    implementation(project(":api-rs"))
    implementation(project(":logger"))
    implementation(project(":cache"))
    annotationProcessor(libs.lombok)
    implementation(libs.annotations)
    implementation(libs.asm)
    implementation(libs.asm.util)
    implementation(libs.fernflower)
    implementation(libs.gson)
    implementation(libs.guava)
    compileOnly(libs.lombok)
}

tasks.test {
    useJUnitPlatform()
}