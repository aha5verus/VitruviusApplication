package com.example.vitruviusapplication.navigation

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.vitruviusapplication.Graph
import com.example.vitruviusapplication.domain.SettingsBundle
import com.example.vitruviusapplication.ui.screens.converter.ConvertersScreen
import com.example.vitruviusapplication.ui.screens.date.DatesScreen
import com.example.vitruviusapplication.ui.screens.home.HomeContent
import com.example.vitruviusapplication.ui.screens.home.concrete.tests.strength.StrengthViewModel
import com.example.vitruviusapplication.ui.screens.save.SaveScreen
import com.example.vitruviusapplication.ui.screens.settings.SettingsScreen
import com.example.vitruviusapplication.util.BottomBarItem
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.navigation.animation.composable


@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun HomeNavGraph(
    navController: NavHostController,
    settings: SettingsBundle,
    onSettingsChanged: (SettingsBundle) -> Unit
) {
    AnimatedNavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarItem.Home.route
    ) {
        composable(
            route = BottomBarItem.Home.route,
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
            HomeContent(
                onSandClick = {
                    navController.navigate(Graph.HOME_SAND)
                },
                onConcreteClick = {
                    navController.navigate(Graph.HOME_CONCRETE)
                },
                onSettingsClick = {
                    navController.navigate("settings")
                }
            )
        }
        composable(
            route = "settings",
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
            SettingsScreen(
                navController = navController,
                settings = settings,
                onSettingsChanged = onSettingsChanged
            )
        }
        composable(
            route = BottomBarItem.Date.route,
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
            DatesScreen()
        }
        composable(
            route = BottomBarItem.Save.route,
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
            SaveScreen()
        }
        composable(
            route = BottomBarItem.Converter.route,
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
            ConvertersScreen()
        }
        sandNavGraph(navController = navController)
        concreteNavGraph(navController = navController, strengthViewModel = StrengthViewModel())
    }
}
