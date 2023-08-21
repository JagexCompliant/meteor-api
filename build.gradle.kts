
plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version libs.versions.kotlin
    java
    `maven-publish`

}

group = "api"
version = "9.9.9"

repositories {
    mavenCentral()
    mavenLocal()
    maven(url = uri("https://repo.runelite.net"))
    maven(url = uri("https://jitpack.io"))
}

val sourcesJar by tasks.creating(Jar::class) {
    dependsOn(JavaPlugin.CLASSES_TASK_NAME)
    archiveClassifier.set("sources")
    from(sourceSets["main"].allSource)
}
allprojects{


    apply(plugin = "java")
    apply(plugin = "maven-publish")

    repositories {
        mavenLocal()
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
        kotlinOptions {
            apiVersion = "1.8"
            languageVersion = "1.8"
            jvmTarget = "17"
        }
    }

    publishing {
        repositories {
            mavenLocal()
            maven(url = "https://jitpack.io")
        }

        publications {
            create<MavenPublication>("maven") {
                groupId = "meteor"
                artifactId = project.name.toString()
                version = project.version.toString()
                from(components["java"])
                artifacts {
                    add("archives", sourcesJar)
                }
            }
        }
    }
}


tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions {
        languageVersion = "1.9"
        jvmTarget = "17"
        freeCompilerArgs = listOf(
            "-Xallow-any-scripts-in-source-roots",
            "-Xjvm-default=all",
            "-Xbackend-threads=4"
        )
    }
}

tasks.compileJava {
    sourceCompatibility = JavaVersion.VERSION_17.toString()
    targetCompatibility = JavaVersion.VERSION_17.toString()
}
