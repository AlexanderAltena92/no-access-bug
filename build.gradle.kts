plugins {
  id("org.jetbrains.kotlin.jvm").version("1.9.20")
  id("com.apollographql.apollo3").version("3.8.2")
}

dependencies {
  implementation("com.apollographql.apollo3:apollo-runtime:3.8.2")
  testImplementation(kotlin("test"))
}


apollo {
  service("service") {
    packageName.set("com.example")
  }
}