package com.example.vitruviusapplication.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp


data class VitruviusColors(
    val primaryText: Color,
    val primaryBackground: Color,
    val secondaryText: Color,
    val secondaryBackground: Color,
    val tintColor: Color,
    val controlColor: Color,
    val activeColor: Color,
    val disabledColor: Color,
    val errorColor: Color,
    val checkedColor: Color
)

data class VitruviusTypography(
    val heading: TextStyle,
    val body: TextStyle,
    val toolbar: TextStyle,
    val caption: TextStyle
)

data class VitruviusShape(
    val padding: Dp,
    val cornersStyle: Shape
)

object VitruviusTheme {
    val colors: VitruviusColors
        @Composable
        get() = LocalVitruviusColors.current

    val typography: VitruviusTypography
        @Composable
        get() = LocalVitruviusTypography.current

    val shapes: VitruviusShape
        @Composable
        get() = LocalVitruviusShape.current

}

enum class VitruviusSize {
    Small, Medium, Big
}

enum class VitruviusCorners {
    Flat, Rounded
}

val LocalVitruviusColors = staticCompositionLocalOf<VitruviusColors> {
    error("No colors provided")
}

val LocalVitruviusTypography = staticCompositionLocalOf<VitruviusTypography> {
    error("No font provided")
}

val LocalVitruviusShape = staticCompositionLocalOf<VitruviusShape> {
    error("No shapes provided")
}
