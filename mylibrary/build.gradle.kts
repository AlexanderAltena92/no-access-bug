plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.apollographql.apollo3") version "3.8.2"
}

android {
    namespace = "com.example.mylibrary"
    compileSdk = 33

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    implementation("com.apollographql.apollo3:apollo-runtime:3.8.2")

    apolloUsedCoordinates(project(mapOf("path" to ":mylibrary2")))
}

apollo {
    service("service") {
        packageName.set("com.example.mylibrary")
        generateApolloMetadata.set(true)
    }
}