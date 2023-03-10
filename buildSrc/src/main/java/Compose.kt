object Compose {
    private const val activityComposeVersion = "1.5.1"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

    const val composeVersion = "1.2.0"
    const val ui = "androidx.compose.ui:ui:$composeVersion"
    const val material = "androidx.compose.material:material:$composeVersion"
    const val tooling = "androidx.compose.ui:ui-tooling:$composeVersion"
    const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
    const val foundation = "androidx.compose.foundation:foundation-layout:$composeVersion"

    const val dataStore = "androidx.datastore:datastore-preferences:1.0.0"

    private const val navigationVersion = "2.5.1"
    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    private const val hiltNavigationComposeVersion = "1.0.0"
    const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"
}

object ComposeTest {
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Compose.composeVersion}"
    const val  uiTestManifest = "androidx.compose.ui:ui-test-manifest:${Compose.composeVersion}"
}