
// 1) Definir dependências / Android dolphin ja cria com compose
// 2) adicionar dependencias
// 3) enxergar o beneficio da centralização das dependências


/** PLAYSTORE VERSIONS */
object Playstore {
    const val applicationId = "com.ipsoft.kmmskeleton.android" // can't change once defined
    const val compileSdk = 33
    const val minSdk = 23
    const val targetSdk = 33
    const val versionCode = 1       // must be increased by every playstore upload
    const val versionName = "1.0.0" // you should increase too. Suggested approach (https://semver.org/)
}

object Namespaces {
    const val android = "com.ipsoft.kmmskeleton.android"
    const val shared = "com.ipsoft.kmmskeleton"
}

object Plugins {
    const val android = "android"
    const val androidLibrary = "com.android.library"
    const val androidApplication = "com.android.application"
    const val kotlin = "kotlin"
    const val multiplatform = "multiplatform"
}

/** DEPENDENCY VERSIONS */
object Versions {
    const val compose = "1.1.1"
    const val composeActivity = "1.4.0"
    const val composeCompiler = "1.3.1"
    const val composeThemeAdapter = "1.1.5"
    const val androidxCore = "1.9.0"
    const val lifecycleRuntime = "2.5.1"
    const val junit = "4.13.2"
    const val extJunit = "1.1.3"
    const val testManifest = "1.1.0-beta01"
    const val espressoCore = "3.4.0"
    const val uiUnitTest = "1.1.0-beta01"
    const val kotlin = "1.7.10"
    const val pluginAndroidLib = "7.3.0"
    const val pluginAndroidApp = "7.3.0"
}

/**
 * APP DEPENDENCIES
 * How to add to build.gradle(:app)?
 * Ex: Inside dependencies{...} add: implementation Androidx.core
 */
object Androidx {
    const val core = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}"
}
object Compose {
    const val activity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val layout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val materialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.compose}"
    const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val themeAdapter = "com.google.android.material:compose-theme-adapter:${Versions.composeThemeAdapter}"
    const val tooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
}

/**
 * UNIT TEST
 * How to add to build.gradle(:app)?
 * Ex: Inside dependencies{...} add: testImplementation Test.junit
 */
object Test {
    const val junit = "junit:junit:${Versions.junit}"
}

/**
 * ANDROID UI TESTS
 * How to add to build.gradle(:app)?
 * Ex: Inside dependencies{...} add: androidTestImplementation TestUi.espressoCore
 */
object TestUi {
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val uiUnitTest = "androidx.compose.ui:ui-test-junit4:${Versions.uiUnitTest}"
}

/**
 * DEBUG TESTS
 * How to add to build.gradle(:app)?
 * Ex: Inside dependencies{...} add: debugImplementation Debug.testManifest
 */
object Debug {
    const val testManifest = "androidx.compose.ui:ui-test-manifest:${Versions.testManifest}"
}