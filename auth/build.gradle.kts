@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.dagger.hilt)
//    alias(libs.plugins.googlePlayServices)
//    alias(libs.plugins.firebaseCrashlytics)
}


android {
    namespace = "com.example.appreviews.auth"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.core.ktx)

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(platform(libs.compose.bom))
    implementation(libs.material3)
    implementation(libs.androidx.storage)
    implementation(libs.engage.core)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)

    implementation(platform(libs.firebaseBom))
    implementation(libs.firebaseAnalytics)
    implementation(libs.viewModel)
    implementation(libs.viewModelRuntime)
    implementation(libs.composeViewModel)
    implementation(libs.composeViewModelRuntime)


    androidTestImplementation(platform(libs.compose.bom))
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)

    implementation(libs.hilt)
    kapt(libs.hiltCompiler)

    implementation(libs.gsonConverter)
    implementation(libs.retrofit)
    implementation(libs.retrofitConvertorScalor)
    implementation(libs.okhttp)
    implementation(libs.loggingInterceptor)

    implementation(project(":core"))
}