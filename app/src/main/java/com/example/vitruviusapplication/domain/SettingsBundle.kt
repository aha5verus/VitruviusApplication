package com.example.vitruviusapplication.domain

import com.example.vitruviusapplication.ui.theme.VitruviusCorners
import com.example.vitruviusapplication.ui.theme.VitruviusSize

data class SettingsBundle(
    val isDarkMode: Boolean,
    val textSize: VitruviusSize,
    val paddingSize: VitruviusSize,
    val cornerStyle: VitruviusCorners
)