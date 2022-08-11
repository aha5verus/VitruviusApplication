package com.example.vitruviusapplication.ui.screens.home.concrete.tests.density

import android.annotation.SuppressLint
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.vitruviusapplication.components.TestAppBar
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@ExperimentalMaterialApi
@Composable
fun DensityScreen(
    navController: NavController
) {
    Scaffold(
        backgroundColor = VitruviusTheme.colors.secondaryBackground,
        topBar = {
            TestAppBar(
                title = "Плотность Бетона",
                navController = navController
            )
        },
        content = {}
    )
}

@ExperimentalMaterialApi
@Preview
@Composable
fun DensityScreenPreview() {
    DensityScreen(navController = rememberNavController())
}
