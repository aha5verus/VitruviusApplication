package com.example.vitruviusapplication.ui.screens.home.sand

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.vitruviusapplication.components.TestAppBar
import com.example.vitruviusapplication.components.TestCard
import com.example.vitruviusapplication.ui.theme.VitruviusTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@ExperimentalMaterialApi
@Composable
fun SandTestsScreen(
    navController: NavController,
    onClickDVM: () -> Unit,
    onClickGCM: () -> Unit
) {
    Scaffold(
        backgroundColor = VitruviusTheme.colors.secondaryBackground,
        topBar = {
             TestAppBar(
                 title = "Песок - испытания",
                 navController = navController
             )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(VitruviusTheme.shapes.padding)
            ) {
                TestCard(
                    onClick = { onClickGCM() },
                    title = "Зерновой состав",
                    description = "ГОСТ: СТ РК 1217-2003",
                    tests = "Расчеты: Частный остаток, Полный остаток, Процент прохождения, Модуль крупности."
                )
                TestCard(
                    onClick = { onClickDVM() },
                    title = "Пустотность материала",
                    description = "ГОСТ: СТ РК 1217-2003",
                    tests = "Расчеты: Истинная плотность, Насыпная плотность."
                )
            }
        }
    )
}

@ExperimentalMaterialApi
@Preview
@Composable
fun SandTestsScreenPreview() {
    SandTestsScreen(
        rememberNavController(),
        onClickDVM = {},
        onClickGCM = {}
    )
}

