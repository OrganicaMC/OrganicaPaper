version = "1.0.0-SNAPSHOT"

dependencies {
    compileOnly(project(":paper-api"))
    compileOnly(project(":paper-mojangapi"))
    compileOnly(project(":paper-server"))
    compileOnly("com.mojang:datafixerupper:6.0.8")
}

tasks.processResources {
    val apiVersion = rootProject.providers.gradleProperty("mcVersion").get()
        .split(".", "-").take(2).joinToString(".")
    val props = mapOf(
        "version" to project.version,
        "apiversion" to "\"$apiVersion\"",
    )
    inputs.properties(props)
    filesMatching("paper-plugin.yml") {
        expand(props)
    }
}
