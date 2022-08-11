package com.example.vitruviusapplication.ui.screens.home.concrete.tests.strength

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
fun StrengthScreen(
    navController: NavController,
    strengthViewModel: StrengthViewModel
) {
    Scaffold(
        backgroundColor = VitruviusTheme.colors.secondaryBackground,
        topBar = {
            TestAppBar(
                title = "Прочность Бетона",
                navController = navController
            )
        },
        content = {

        }
    )
}


@ExperimentalMaterialApi
@Preview
@Composable
fun ConcreteStrengthScreenPreview(
) {
    StrengthScreen(
        rememberNavController(),
        strengthViewModel = StrengthViewModel()
    )
}