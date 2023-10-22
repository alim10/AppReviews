@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
//    alias(libs.plugins.kotlinKapt)
//    alias(libs.plugins.kotlinKapt)
//    kotlin("kapt")
}

android {
    namespace = "com.example.appreviews.core"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        buildConfig = true
    }


    buildTypes {
        release {
            isMinifyEnabled = true
            buildConfigField("String", "BASE_URL", "\"https://app.karwaty.com/\"")
            buildConfigField("String", "IMAGE_URL", "\"https://app.karwaty.com/\"")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        debug {
            isMinifyEnabled = false
            buildConfigField("String", "BASE_URL", "\"https://app.karwaty.com/\"")
            buildConfigField("String", "IMAGE_URL", "\"https://app.karwaty.com/\"")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
//    implementation(libs.compose)
    implementation(libs.activity.compose)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)


    /*  retrofit okhttp, json convertor */
    implementation(libs.gsonConverter)
    implementation(libs.retrofit)
    implementation(libs.retrofitConvertorScalor)
    implementation(libs.okhttp)
    implementation(libs.loggingInterceptor)


    /* google's Dependency */
//    implementation(libs.play-services-maps)
    implementation(libs.gson)
    implementation(libs.googleMap)
    implementation(libs.googleLocation)
    implementation(libs.firebaseMessage)
    implementation(libs.firebaseAnalytics)
    implementation(libs.firebaseCrashlytics)


    /*  Dependency Injection  Hilt and others */
//    implementation(libs.hiltCompose)
    implementation(libs.hilt)
    annotationProcessor (libs.hiltCompiler)
//    implementation(libs.hiltAndroidTest)
//    implementation(libs.hiltCompilerTest)


}
