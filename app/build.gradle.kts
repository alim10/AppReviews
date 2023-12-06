@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
//    alias(libs.plugins.ksp)
    alias(libs.plugins.dagger.hilt)
//    alias(libs.plugins.googlePlayServices)
//    alias(libs.plugins.firebaseCrashlytics)

}

android {
    namespace = "com.alim.letsconnect"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.alim.letsconnect"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    buildFeatures {
        buildConfig  = true
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            buildConfigField("String", "IMAGE_URL", "\"https://app.karwaty.com/\"")
            buildConfigField("String", "BASE_URL", "\"https://app.karwaty.com/\"")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        debug {
            isMinifyEnabled = false
            isDebuggable = true
            buildConfigField("String", "BASE_URL", "\"https://app.karwaty.com/\"")
            buildConfigField("String", "IMAGE_URL", "\"https://app.karwaty.com/\"")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }

    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.1"
        kotlinCompilerExtensionVersion = "1.4.3"
//        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation ("androidx.core:core-splashscreen:1.0.0-beta02")
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.constraintlayoutCore)
//    implementation(libs.constraintCompose)
    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    implementation(platform(libs.compose.bom))
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)

//    implementation(platform(libs.firebaseBom))
//    implementation(libs.firebaseAnalytics)
    implementation(libs.viewModel)
    implementation(libs.viewModelRuntime)
    implementation(libs.composeViewModel)
    implementation(libs.composeViewModelRuntime)

    implementation(libs.gsonConverter)
    implementation(libs.retrofit)
    implementation(libs.retrofitConvertorScalor)
    implementation(libs.okhttp)
    implementation(libs.loggingInterceptor)

    implementation(libs.coil)
    implementation(libs.coilCompose)

    implementation(libs.hilt)
    kapt(libs.hiltCompiler)

    implementation(project(":core"))
    implementation(project(":auth"))
    implementation(project(":profile"))
}