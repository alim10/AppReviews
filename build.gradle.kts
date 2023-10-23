@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false  // android kotlin
    alias(libs.plugins.kotlin.kapt) apply false  // android kotlin_kapt
    alias(libs.plugins.googlePlayServices) apply false
    alias(libs.plugins.firebaseCrashlytics) apply false
    alias(libs.plugins.com.android.library) apply false
    alias(libs.plugins.dagger.hilt) apply false
}
true // Needed to make the Suppress annotation work for the plugins block