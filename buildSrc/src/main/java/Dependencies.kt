object Vers {
  val compile_sdk = 28
  val min_sdk = 26
  val target_sdk = 28

  val kotlin = "1.3.0"
  val couroutine = "1.0.0"
}

object Libs {
  val android_plugin = "com.android.tools.build:gradle:3.2.1"
  val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}"
  val versions_plugin = "com.github.ben-manes:gradle-versions-plugin:0.20.0"

  val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
  val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Vers.couroutine}"
  val ui_coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Vers.couroutine}"

  val ktx = "androidx.core:core-ktx:1.0.0"

  val appcompat = "androidx.appcompat:appcompat:1.0.0"
  val recyclerview = "androidx.recyclerview:recyclerview:1.0.0"
  val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.0-alpha2"
  val cardview = "androidx.cardview:cardview:1.0.0"

  val material = "com.google.android.material:material:1.0.0"
  val coordinatorlayout = "androidx.coordinatorlayout:coordinatorlayout:1.0.0"
  val paging = "androidx.paging:paging-runtime:2.0.0-rc01"
  val navigation = "android.arch.navigation:navigation-fragment-ktx:1.0.0"
  val navigation_ui = "android.arch.navigation:navigation-ui-ktx:1.0.0"

  val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0"
  val livedata = "androidx.lifecycle:lifecycle-livedata:2.0.0"
  val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:2.0.0"
  val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:2.0.0"

  val emoji = "androidx.emoji:emoji:1.0.0"
  val emoji_compat = "androidx.emoji:emoji-appcompat:1.0.0"
  val emoji_bundled = "androidx.emoji:emoji-bundled:1.0.0"

  val rxjava = "io.reactivex.rxjava2:rxjava:2.2.0"
  val rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.0"
  val rxkotlin = "io.reactivex.rxjava2:rxkotlin:2.3.0"
  val rxbinding = "com.jakewharton.rxbinding2:rxbinding:2.2.0"

  val junit = "junit:junit:4.12"
  val truth = "com.google.truth:truth:0.42"
  val test_rules = "androidx.test:rules:1.1.0"
  val test_runner = "androidx.test:runner:1.1.0"
  val test_junit_rules = "androidx.test.ext:junit:1.0.0"
  val mockito_kotlin = "com.nhaarman:mockito-kotlin-kt1.1:1.5.0"
  val espresso = "androidx.test.espresso:espresso-core:3.1.0"
  val robolectric = "org.robolectric:robolectric:4.0"
}
