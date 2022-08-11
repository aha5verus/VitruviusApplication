package com.example.vitruviusapplication.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.example.vitruviusapplication.Graph
import com.example.vitruviusapplication.ui.screens.home.concrete.ConcreteTestsScreen
import com.example.vitruviusapplication.ui.screens.home.concrete.tests.density.DensityScreen
import com.example.vitruviusapplication.ui.screens.home.concrete.tests.strength.StrengthScreen
import com.example.vitruviusapplication.ui.screens.home.concrete.tests.strength.StrengthViewModel
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.navigation.animation.composable


@ExperimentalAnimationApi
@ExperimentalMaterialApi
fun NavGraphBuilder.concreteNavGraph(
    navController: NavHostController,
    strengthViewModel: StrengthViewModel
) {
    navigation(
        route = Graph.HOME_CONCRETE,
        startDestination = ConcreteScreen.ConcreteTests.route
    ) {
        composable(
            route = ConcreteScreen.ConcreteTests.route,
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
            ConcreteTestsScreen(
                navController = navController,
                onClickStrength = {
                    navController.navigate(ConcreteScreen.ConcreteStrength.route)
                },
                onClickDensity = {
                    navController.navigate(ConcreteScreen.ConcreteDensity.route)
                }
            )
        }
        composable(
            route = ConcreteScreen.ConcreteStrength.route,
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
            StrengthScreen(
                strengthViewModel = strengthViewModel,
                navController = navController
            )
        }
        composable(
            route = ConcreteScreen.ConcreteDensity.route,
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
            DensityScreen(navController = navController)
        }
    }
}

sealed class ConcreteScreen(val route: String) {
    object ConcreteTests: ConcreteScreen(route = "CONCRETE_TESTS_SCREEN")
    object ConcreteStrength: ConcreteScreen(route = "CONCRETE_STRENGTH_SCREEN")
    object ConcreteDensity: ConcreteScreen(route = "CONCRETE_DENSITY_SCREEN")
}