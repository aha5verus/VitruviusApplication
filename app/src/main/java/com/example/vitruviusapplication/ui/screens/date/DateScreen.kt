package com.example.vitruviusapplication.ui.screens.date

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.vitruviusapplication.components.MainTopBar
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DatesScreen() {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        backgroundColor = VitruviusTheme.colors.secondaryBackground,
        scaffoldState = scaffoldState,
        topBar = {
            MainTopBar(title = "Даты")
        },
        content = {}
    )
}


@Preview(showBackground = true)
@Composable
fun DatesScreenPreview() {
    DatesScreen()
}