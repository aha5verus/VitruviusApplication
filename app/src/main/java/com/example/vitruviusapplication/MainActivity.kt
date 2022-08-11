package com.example.vitruviusapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import com.example.vitruviusapplication.domain.SettingsBundle
import com.example.vitruviusapplication.navigation.authNavGraph
import com.example.vitruviusapplication.ui.screens.home.HomeScreen
import com.example.vitruviusapplication.ui.theme.*
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.navigation.animation.composable

@ExperimentalAnimationApi
@ExperimentalComposeUiApi
@ExperimentalFoundationApi
@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val isDarkModeValue = true // isSystemInDarkTheme()

            val currentFontSize = remember { mutableStateOf(VitruviusSize.Medium) }
            val currentPaddingSize = remember { mutableStateOf(VitruviusSize.Medium) }
            val currentCornersStyle = remember { mutableStateOf(VitruviusCorners.Rounded) }
            val isDarkMode = remember { mutableStateOf(isDarkModeValue) }

            MainTheme(
                darkTheme = isDarkMode.value,
                textSize = currentFontSize.value,
                corners = currentCornersStyle.value,
                paddingSize = currentPaddingSize.value
            ) {
                val navController = rememberAnimatedNavController()
                val systemUiController = rememberSystemUiController()


                // Set status bar color
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = if (isDarkMode.value) baseDarkPalette.primaryBackground else baseLightPalette.primaryBackground,
                        darkIcons = !isDarkMode.value
                    )
                }
                AnimatedNavHost(
                    navController = navController,
                    route = Graph.ROOT,
                    startDestination = Graph.AUTHENTICATION
                ) {
                    authNavGraph(navController = navController)
                    composable(
                        route = Graph.HOME,
                        enterTransition = {
                            slideIntoContainer(
                                AnimatedContentScope.SlideDirection.Left,
                                animationSpec = tween(500)
                            )
                        },
                        exitTransition = {
                            slideOutOfContainer(
                                AnimatedContentScope.SlideDirection.Left,
                                animationSpec = tween(500)
                            )
                        },
                        popEnterTransition = {
                            slideIntoContainer(
                                AnimatedContentScope.SlideDirection.Right,
                                animationSpec = tween(500)
                            )
                        },
                        popExitTransition = {
                            slideOutOfContainer(
                                AnimatedContentScope.SlideDirection.Right,
                                animationSpec = tween(500)
                            )
                        }
                    ) {
                        val settings = SettingsBundle(
                            isDarkMode = isDarkMode.value,
                            textSize = currentFontSize.value,
                            cornerStyle = currentCornersStyle.value,
                            paddingSize = currentPaddingSize.value
                        )
                        HomeScreen(
                            settings = settings,
                            onSettingsChanged = {
                                isDarkMode.value = it.isDarkMode
                                currentFontSize.value = it.textSize
                                currentCornersStyle.value = it.cornerStyle
                                currentPaddingSize.value = it.paddingSize
                            }
                        )
                    }
                }
            }
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val HOME_SAND = "sand_graph"
    const val HOME_CONCRETE = "concrete_graph"
}
