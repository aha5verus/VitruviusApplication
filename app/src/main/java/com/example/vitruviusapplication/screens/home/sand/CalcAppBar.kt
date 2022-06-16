package com.example.vitruviusapplication.screens.home.sand

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable

@Composable
fun CalcAppBar() {
    TopAppBar(
        navigationIcon = {
            BackAction()
        },
        title = {
            Text(
                text = "Песок",
            )
        }
    )
}

@Composable
fun BackAction() {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = "Back Arrow"
        )

    }
}