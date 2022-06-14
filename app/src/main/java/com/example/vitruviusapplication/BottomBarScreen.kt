package com.example.vitruviusapplication


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "HOME",
        title = "Главная",
        icon = Icons.Default.Home
    )

    object Save : BottomBarScreen(
        route = "SAVE",
        title = "Сохранение",
        icon = Icons.Default.ShoppingCart
    )

    object Send : BottomBarScreen(
        route = "SEND",
        title = "Отправление",
        icon = Icons.Default.Send
    )
}