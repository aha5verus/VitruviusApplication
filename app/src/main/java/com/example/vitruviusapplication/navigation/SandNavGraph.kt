package com.example.vitruviusapplication.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.example.vitruviusapplication.Graph
import com.example.vitruviusapplication.ui.screens.home.sand.SandTestsScreen
import com.example.vitruviusapplication.ui.screens.home.sand.tests.DeterminationVoidnessScreen
import com.example.vitruviusapplication.ui.screens.home.sand.tests.GranulometricCompositionScreen
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.navigation.animation.composable


@ExperimentalAnimationApi
@ExperimentalMaterialApi
fun NavGraphBuilder.sandNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.HOME_SAND,
        startDestination = SandScreen.SandTests.route
    ) {
        composable(
            route = SandScreen.SandTests.route,
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
        ){
            SandTestsScreen(
                navController = navController,
                onClickDVM = {
                    navController.navigate(SandScreen.SandTestDVM.route)
                },
                onClickGCM = {
                    navController.navigate(SandScreen.SandTestGCM.route)
                }
            )
        }
        composable(
            route = SandScreen.SandTestDVM.route,
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
            DeterminationVoidnessScreen(navController = navController)
        }
        composable(
            route = SandScreen.SandTestGCM.route,
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
            GranulometricCompositionScreen(navController = navController)
        }
    }
}

sealed class SandScreen(val route: String) {
    object SandTests : SandScreen(route = "SAND_TESTS_SCREEN")
    object SandTestDVM : SandScreen(route = "DETERMINATION_VOIDNESS_SCREEN")
    object SandTestGCM : SandScreen(route = "GRANULOMETRIC_COMPOSITION_SCREEN")
}

