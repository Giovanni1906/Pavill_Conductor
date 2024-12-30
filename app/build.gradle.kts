plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.pavill_conductor"
    compileSdk = 34

    defaultConfig {
        applicationId = "radiotaxipavill.radiotaxipavillapp_conductor"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.playServicesMaps)  // Referencia correcta a Google Maps
    implementation(libs.playServicesLocation)
    implementation(libs.playServicesPlaces)
    implementation(libs.drawerlayout)  // Ubicación
    implementation(libs.android.maps.utils)
    implementation(libs.glide)
    implementation(libs.location.services)
    implementation(libs.cardview)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.playServicesPlaces)

}