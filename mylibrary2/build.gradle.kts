plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.apollographql.apollo3") version "3.8.2"
}

android {
    namespace = "com.example.mylibrary2"
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
    implementation(project(":mylibrary"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    implementation("com.apollographql.apollo3:apollo-runtime:3.8.2")

    apolloMetadata(project(":mylibrary"))
    apolloSchema(project(":mylibrary"))
}

apollo {
    service("service") {
        packageName.set("com.example.mylibrary2")
    }
}