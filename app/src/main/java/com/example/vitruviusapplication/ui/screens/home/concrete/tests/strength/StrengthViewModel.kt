package com.example.vitruviusapplication.ui.screens.home.concrete.tests.strength

import androidx.lifecycle.ViewModel
import com.example.vitruviusapplication.base.EventHandler
import com.example.vitruviusapplication.ui.screens.home.concrete.tests.strength.models.StrengthEvent
import com.example.vitruviusapplication.ui.screens.home.concrete.tests.strength.models.StrengthState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class StrengthViewModel @Inject constructor() : ViewModel(), EventHandler<StrengthEvent> {
    private val _strengthState = MutableStateFlow<StrengthState>(StrengthState.StrengthCalcState())
    val strengthState: StateFlow<StrengthState> = _strengthState

    override fun obtainEvent(event: StrengthEvent) {
        when (val currentState = _strengthState.value) {
            is StrengthState.StrengthCalcState -> reduce(event, currentState)
        }
    }

    private fun reduce(event: StrengthEvent, currentState: StrengthState.StrengthCalcState) {
        when (event) {
            is StrengthEvent.Calculate -> calculate(currentState)
        }
    }

    private fun calculate(state: StrengthState.StrengthCalcState) {
        val firstStrength = state.firstStrength.toDoubleOrNull()
        val secondStrength = state.secondStrength.toDoubleOrNull()
        if (firstStrength != null && secondStrength != null) {
            val result = (firstStrength + secondStrength)/2
        }
    }
}