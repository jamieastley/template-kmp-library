plugins {
  id("de.fayard.refreshVersions") version "0.50.2"
  id("com.gradle.enterprise") version "3.9"
}

rootProject.name = "template-kmp-library"

include(":test")

include(":lib:template-kmp-library-core", ":lib:template-kmp-library-dsl")
