package com.example.vitruviusapplication.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@Composable
fun TestCard(
    onClick: () -> Unit,
    title: String,
    description: String,
    tests: String
) {
    Card(
        modifier = Modifier
            .padding(VitruviusTheme.shapes.padding)
            .fillMaxWidth()
            .wrapContentHeight(),
        border = BorderStroke(1.dp, VitruviusTheme.colors.controlColor),
        shape = VitruviusTheme.shapes.cornersStyle
    ) {
        Column(
            modifier = Modifier.background(VitruviusTheme.colors.controlColor)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                text = title,
                fontSize = VitruviusTheme.typography.heading.fontSize,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold,
                color = VitruviusTheme.colors.primaryText
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                text = description,
                fontSize = VitruviusTheme.typography.caption.fontSize,
                color = VitruviusTheme.colors.primaryText,
                maxLines = 5
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                text = tests,
                fontSize = VitruviusTheme.typography.caption.fontSize,
                color = VitruviusTheme.colors.primaryText,
                maxLines = 3
            )
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            ) {
                Button(
                    modifier = Modifier
                        .padding(8.dp)
                        .wrapContentWidth()
                        .wrapContentHeight(),
                    onClick = { onClick() },
                    shape = VitruviusTheme.shapes.cornersStyle,
                    colors = ButtonDefaults.buttonColors(VitruviusTheme.colors.secondaryBackground)
                ) {
                    Text(
                        text = "Перейти к испытанию",
                        fontSize = VitruviusTheme.typography.caption.fontSize,
                        color = VitruviusTheme.colors.primaryText
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TestCardPreview() {
    TestCard(
        onClick = {},
        title = "Зерновой состав",
        description = "Относительное содержание в почве, " +
                "горной породы или искусственной смеси частиц различных размеров " +
                "(независимо от их химического или минералогического состава).",
        tests = "Испытания: Частный остаток, Полный остаток, Процент прохождения."
    )
}