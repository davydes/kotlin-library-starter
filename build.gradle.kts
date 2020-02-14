buildscript {
  dependencies {
    if (!project.plugins.hasPlugin("org.jetbrains.kotlin.jvm"))
      classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
  }
}

repositories {
  mavenCentral()
  jcenter()
}

if (!project.plugins.hasPlugin("org.jetbrains.kotlin.jvm")) {
  apply(plugin = "org.jetbrains.kotlin.jvm")
}

plugins {
  `java-library`
}

version = "0.0.1"

java {
  sourceCompatibility = JavaVersion.VERSION_11
}

dependencies {
  implementation(kotlin("stdlib"))

  testImplementation("junit:junit:4.12")
  testImplementation("org.assertj:assertj-core:3.12.2")
  testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0")
}

sourceSets {
  main {
    java.srcDir("src")
    resources.srcDir("resources")
  }
  test { java.srcDir("test") }
}
