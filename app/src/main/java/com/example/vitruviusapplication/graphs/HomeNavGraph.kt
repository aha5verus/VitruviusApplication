package com.example.vitruviusapplication.graphs

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.vitruviusapplication.BottomBarScreen
import com.example.vitruviusapplication.screens.ScreenContent
import com.example.vitruviusapplication.screens.home.HomeContent
import com.example.vitruviusapplication.screens.home.sand.SandCalcScreen

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeContent(
                onClick = {
                    navController.navigate(Graph.HOME_SAND)
                }
            )
        }
        composable(route = BottomBarScreen.Save.route) {
            ScreenContent(
                name = BottomBarScreen.Save.route,
                onClick = { }
            )
        }
        composable(route = BottomBarScreen.Send.route) {
            ScreenContent(
                name = BottomBarScreen.Send.route,
                onClick = { }
            )
        }
        detailsNavGraph(navController = navController)
    }
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.HOME_SAND,
        startDestination = SandScreen.SandCalcList.route
    ) {
        composable(route = SandScreen.SandCalcList.route) {
//            ScreenContent(name = SandScreen.SandCalcList.route) {
//                navController.navigate(SandScreen.SandCalc.route)
//            }
            SandCalcScreen(name = SandScreen.SandCalcList.route) {
                navController.navigate(SandScreen.SandCalc.route)
            }
        }
        composable(route = SandScreen.SandCalc.route) {
            ScreenContent(name = SandScreen.SandCalc.route) {
                navController.popBackStack(
                    route = SandScreen.SandCalcList.route,
                    inclusive = false
                )
            }
        }
    }
}

sealed class SandScreen(val route: String) {
    object SandCalcList : SandScreen(route = "INFORMATION")
    object SandCalc : SandScreen(route = "OVERVIEW")
}