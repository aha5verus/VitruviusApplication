package com.example.vitruviusapplication.ui.screens.save

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.vitruviusapplication.components.MainTopBar
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SaveScreen() {
    Scaffold(
        backgroundColor = VitruviusTheme.colors.secondaryBackground,
        topBar = {
            MainTopBar(title = "Сохранения")
        },
        content = {

        }
    )
}