package com.example.vitruviusapplication.ui.screens.converter

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import com.example.vitruviusapplication.components.MainTopBar
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ConvertersScreen() {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        backgroundColor = VitruviusTheme.colors.secondaryBackground,
        scaffoldState = scaffoldState,
        topBar = {
            MainTopBar(title = "Конвертеры")
        },
        content = {

        }
    )
}