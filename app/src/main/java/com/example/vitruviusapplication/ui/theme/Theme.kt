package com.example.vitruviusapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainTheme(
    textSize: VitruviusSize = VitruviusSize.Medium,
    paddingSize: VitruviusSize = VitruviusSize.Medium,
    corners: VitruviusCorners = VitruviusCorners.Rounded,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = when (darkTheme) {
        true -> baseDarkPalette
        false -> baseLightPalette
    }

    val typography = VitruviusTypography(
        heading = TextStyle(
            fontSize = when (textSize) {
                VitruviusSize.Small -> 24.sp
                VitruviusSize.Medium -> 28.sp
                VitruviusSize.Big -> 32.sp
            },
            fontWeight = FontWeight.Bold
        ),
        body = TextStyle(
            fontSize = when (textSize) {
                VitruviusSize.Small -> 14.sp
                VitruviusSize.Medium -> 16.sp
                VitruviusSize.Big -> 18.sp
            },
            fontWeight = FontWeight.Normal
        ),
        toolbar = TextStyle(
            fontSize = when (textSize) {
                VitruviusSize.Small -> 14.sp
                VitruviusSize.Medium -> 16.sp
                VitruviusSize.Big -> 18.sp
            },
            fontWeight = FontWeight.Medium
        ),
        caption = TextStyle(
            fontSize = when (textSize) {
                VitruviusSize.Small -> 12.sp
                VitruviusSize.Medium -> 14.sp
                VitruviusSize.Big -> 16.sp
            }
        )
    )

    val shapes = VitruviusShape(
        padding = when (paddingSize) {
            VitruviusSize.Small -> 12.dp
            VitruviusSize.Medium -> 16.dp
            VitruviusSize.Big -> 20.dp
        },
        cornersStyle = when (corners) {
            VitruviusCorners.Flat -> RoundedCornerShape(0.dp)
            VitruviusCorners.Rounded -> RoundedCornerShape(16.dp)
        }
    )


    CompositionLocalProvider(
        LocalVitruviusColors provides colors,
        LocalVitruviusTypography provides typography,
        LocalVitruviusShape provides shapes,
        content = content
    )
}