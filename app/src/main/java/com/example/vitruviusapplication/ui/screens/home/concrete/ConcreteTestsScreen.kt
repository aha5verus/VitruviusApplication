package com.example.vitruviusapplication.ui.screens.home.concrete

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.vitruviusapplication.components.TestAppBar
import com.example.vitruviusapplication.components.TestCard
import com.example.vitruviusapplication.ui.theme.LARGE_PADDING
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ConcreteTestsScreen(
    navController: NavController,
    onClickStrength: () -> Unit,
    onClickDensity: () -> Unit
) {
    Scaffold(
        backgroundColor = VitruviusTheme.colors.secondaryBackground,
        topBar = {
            TestAppBar(
                title = "Бетон - испытания",
                navController = navController
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(LARGE_PADDING)
            ) {
                TestCard(
                    onClick = { onClickStrength() },
                    title = "Прочность контрольных образцов",
                    description = "ГОСТ: 10180-2012",
                    tests = "Расчеты: Прочность."
                )
                TestCard(
                    onClick = { onClickDensity() },
                    title = "Плотность контрольных образцов",
                    description = "ГОСТ: 12730.1-78",
                    tests = "Расчеты: Плотность."
                )
            }
        }
    )
}

@Preview
@Composable
fun ConcreteTestsScreenPreview() {
    ConcreteTestsScreen(
        rememberNavController(),
        onClickStrength = {},
        onClickDensity = {}
    )
}
