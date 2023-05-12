plugins{
    java
    `maven-publish`
}

group = "meteor"
version = "1.0.0"

repositories{
    mavenCentral()
    maven { url = uri("https://raw.githubusercontent.com/MeteorLite/hosting/main/repo/") }
}

dependencies{
    compileOnly("org.projectlombok:lombok:_")
    annotationProcessor("org.projectlombok:lombok:_")

    implementation(project(":annotations"))
    implementation(project(":deobfuscator"))
    implementation(project(":api-rs"))
    implementation(project(":logger"))
    implementation(project(":cache"))
    implementation("javax.inject:javax.inject:1")
    implementation(libs.gson)

    implementation(libs.asm)
    implementation(libs.asm.util)
    implementation(libs.annotations)
    implementation(libs.guava)
    implementation(libs.jopt.simple)

}

tasks{
    test {
        useJUnitPlatform()
    }
    register<JavaExec>("inject"){
        classpath(sourceSets["main"].runtimeClasspath)
        mainClass.set("com.openosrs.injector.Injector")
        dependsOn(":mixins:jar")
    }
    findByName("build")!!.finalizedBy("inject")
}


