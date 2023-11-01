plugins {
    id("telematics.android.application")
    id("telematics.android.hilt")
    id("telematics.android.room")
    id("telematics.android.retrofit")
    id("telematics.android.application.firebase")
}

android {

    compileSdkVersion(AppConfig.compileSdk)

    defaultConfig {
        applicationId = AppConfig.applicationId
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        applicationVariants.all {
            val variant = this
            variant.outputs
                .map { it as com.android.build.gradle.internal.api.BaseVariantOutputImpl }
                .forEach { output ->
                    val outputFileName = "Telematics-${variant.baseName}-${variant.versionName}(${variant.versionCode}).apk"
                    output.outputFileName = outputFileName
                }
         }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            manifestPlaceholders["crashlyticsCollectionEnabled"] = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
            manifestPlaceholders["crashlyticsCollectionEnabled"] = false
        }
    }


    signingConfigs {
        getByName("debug") {
            keyAlias = "commerin"
            keyPassword = "commerin23"
            storeFile = file("/home/tappi/Desktop/rath_tech/commerin.jks")
            storePassword = "commerin23"
        }
        create("release") {
            keyAlias = "commerin"
            keyPassword = "commerin23"
            storeFile = file("/home/tappi/Desktop/rath_tech/commerin.jks")
            storePassword = "commerin23"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }

    //dynamicFeatures = DynamicModules.modules
}

dependencies {

    implementation(project(":data"))
    implementation(project(":domain"))
    implementation(project(":content"))
    implementation(project(":authentication"))
    implementation(project(":features:feed"))
    implementation(project(":features:dashboard"))
    implementation(project(":features:account"))
    implementation(project(":features:leaderboard"))
    implementation(project(":features:reward"))
    implementation(project(":features:obd"))

    // telematics sdk
    implementation(libs.trackingApi)

    // lifecycle
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)

    // ui
    implementation(libs.countryCodePicker)
    implementation(libs.circleIndicatorView)

    // navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
}