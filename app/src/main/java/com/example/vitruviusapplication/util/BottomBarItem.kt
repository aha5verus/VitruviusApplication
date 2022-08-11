package com.example.vitruviusapplication.util


import com.example.vitruviusapplication.R

sealed class BottomBarItem(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Home : BottomBarItem(
        route = "HOME",
        title = "Главная",
        icon = R.drawable.ic_home
    )

    object Date : BottomBarItem(
        route = "DATE",
        title = "Даты",
        icon = R.drawable.ic_date
    )

    object Save : BottomBarItem(
        route = "SAVE",
        title = "Сохранения",
        icon = R.drawable.ic_save
    )

    object Converter : BottomBarItem(
        route = "CONVERTER",
        title = "Конвертеры",
        icon = R.drawable.ic_converter
    )
}