package com.example.vitruviusapplication.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import com.example.vitruviusapplication.ui.theme.VitruviusTheme

@Composable
fun SubScriptText(
    normalText: String,
    subText: String,
    description: String
) {
    Text(
        buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = VitruviusTheme.typography.body.fontSize,
                    fontStyle = FontStyle.Italic,
                    color = VitruviusTheme.colors.primaryText
                )
            ) {
                append(normalText)
            }
            withStyle(
                style = SpanStyle(
                    fontSize = VitruviusTheme.typography.caption.fontSize,
                    fontWeight = FontWeight.Normal,
                    baselineShift = BaselineShift.Subscript,
                    color = VitruviusTheme.colors.primaryText
                )
            ) {
                append(subText)
            }
            withStyle(
                style = SpanStyle(
                    fontSize = VitruviusTheme.typography.body.fontSize,
                    color = VitruviusTheme.colors.primaryText
                )
            ) {
                append(description)
            }
        }
    )
}
