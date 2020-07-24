object Versions {
    const val appName = "mAuc"
    const val applicationId ="com.ym.myauc"
    const val versionCode = 1
    const val versionName = "1.0"

    const val gradleVersion = "3.5.0"
    const val buildToolsVersion = "28.0.3"
    const val compileSdkVersion = 28
    const val minSdkVersion = 21
    const val targetSdkVersion = 28
    const val supportVersion = "28.0.0"
    const val kotlinVersion = "1.3.72"
}

object Dependencies {

    // ------------- build script class path -------------
    const val gradleClzPath = "com.android.tools.build:gradle:${Versions.gradleVersion}"
    const val kotlinClzPath = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val newlensClzPath = "com.networkbench.newlens.agent.android:agent-gradle-plugin:2.13.5"

    // ------------- test -------------
    const val jUnit = "junit:junit:4.12"
    const val runner = "androidx.test:runner:1.2.0"
    const val androidxJunit = "androidx.test.ext:junit:1.1.1"
    const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"

    // ------------- Android -------------
    const val androidxMultidex = "androidx.multidex:multidex:2.0.0"
    const val appcompatX = "androidx.appcompat:appcompat:1.1.0"
    const val supportV4 = "androidx.legacy:legacy-support-v4:1.0.0"
    const val appcompatV7 = "androidx.appcompat:appcompat:1.0.0"
    const val recyclerviewV7 = "androidx.recyclerview:recyclerview:1.0.0"
    const val gridLayoutV7 = "androidx.gridlayout:gridlayout:1.0.0"
    const val design = "com.google.android.material:material:1.0.0-rc01"
    const val cardviewV7 = "androidx.cardview:cardview:1.0.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val flexboxLayout = "com.google.android:flexbox:0.3.2"

    // ------------- kotlin -------------
    const val kotlinCore = "androidx.core:core-ktx:1.1.0"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"

    // ------------- leakcanary -------------
    const val leakcanaryAndroid = "com.squareup.leakcanary:leakcanary-android:2.4"
    const val leakcanaryAndroid_no_op = "com.squareup.leakcanary:leakcanary-android-no-op:1.6.3"
    //const val support_fragment = "com.squareup.leakcanary:leakcanary-support-fragment:"

}