
rootProject.name = "meteor-api"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
plugins {
    id("de.fayard.refreshVersions") version("0.51.0")
}


include("api")
include("api-rs")
include("cache")
include("eventbus")
include("http")
include("logger")
include("annotations")
