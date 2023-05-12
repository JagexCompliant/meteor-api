
rootProject.name = "meteor-api"

plugins {
    id("de.fayard.refreshVersions") version("0.51.0")
}

include("mixins")
include("api")
include("api-rs")
include("cache")

include("deobfuscator")
include("eventbus")
include("http")
include("injector")
include("logger")
include("osrs")
include("scripts")
include("annotations")
