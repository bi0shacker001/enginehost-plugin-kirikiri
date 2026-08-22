plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "dev.enginehost.plugin.kirikiri"
    compileSdk = 36

    defaultConfig {
        applicationId = "dev.enginehost.plugin.kirikiri"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "0.1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

// Real native engine build (the vendored vendor/kirikiroid2 fork's own
// cocos2d-x/CMake toolchain) isn't wired into this Gradle build yet --
// see README's Status section. This module currently builds and installs
// as a real, working plugin shell (manifest contract + RunActivity), but
// RunActivity itself doesn't yet start the native engine.
