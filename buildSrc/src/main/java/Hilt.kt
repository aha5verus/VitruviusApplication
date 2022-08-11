object Hilt {
    const val hiltVersion = "2.42"
    const val hilt = "com.google.dagger:hilt-android:$hiltVersion"
    const val compiler = "com.google.dagger:hilt-compiler:$hiltVersion"
}

object HiltTest {
    const val hiltTesting = "com.google.dagger:hilt-android-testing:${Hilt.hiltVersion}"
}