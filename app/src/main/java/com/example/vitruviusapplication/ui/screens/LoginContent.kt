package com.example.vitruviusapplication.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@Composable
fun LoginContent(
    onClick: () -> Unit,
    onSignUpClick: () -> Unit,
    onForgotClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(VitruviusTheme.colors.primaryBackground),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable { onClick() },
            text = "LOGIN",
            fontSize = VitruviusTheme.typography.heading.fontSize,
            fontWeight = FontWeight.Bold,
            color = VitruviusTheme.colors.primaryText
        )
        Text(
            modifier = Modifier.clickable { onSignUpClick() },
            text = "Sign Up",
            fontSize = VitruviusTheme.typography.body.fontSize,
            fontWeight = FontWeight.Medium,
            color = VitruviusTheme.colors.primaryText
        )
        Text(
            modifier = Modifier.clickable { onForgotClick() },
            text = "Forgot Password",
            fontSize = VitruviusTheme.typography.body.fontSize,
            fontWeight = FontWeight.Medium,
            color = VitruviusTheme.colors.primaryText
        )
    }
}