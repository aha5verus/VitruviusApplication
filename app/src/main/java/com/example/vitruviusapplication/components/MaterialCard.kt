package com.example.vitruviusapplication.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@Composable
fun MaterialCard(
    onClick: () -> Unit,
    title: String
) {
    Button(
        modifier = Modifier
            .padding(VitruviusTheme.shapes.padding)
            .height(150.dp)
            .width(150.dp),
        shape = VitruviusTheme.shapes.cornersStyle,
        colors = ButtonDefaults.buttonColors(backgroundColor = VitruviusTheme.colors.controlColor),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 5.dp,
            pressedElevation = 5.dp,
            disabledElevation = 0.dp
        ),
        onClick = { onClick() }
    ) {
        Text(
            text = title,
            color = VitruviusTheme.colors.primaryText,
            fontSize = VitruviusTheme.typography.body.fontSize,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MaterialCardPreview() {
    MaterialCard(onClick = { /*TODO*/ }, title = "Песок")
}