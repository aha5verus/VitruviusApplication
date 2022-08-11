package com.example.vitruviusapplication.ui.screens.home.concrete.tests.strength.models

sealed class StrengthState {
    data class StrengthCalcState(
        var firstStrength: String = "",
        var secondStrength: String = "",
        var result: String = ""
    ) : StrengthState()
}