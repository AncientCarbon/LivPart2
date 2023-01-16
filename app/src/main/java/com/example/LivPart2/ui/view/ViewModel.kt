package com.example.LivPart2.ui.view

import androidx.lifecycle.ViewModel
import com.example.LivPart2.dataPack.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    init {
        resetApp()
    }

    fun resetApp() {
        _uiState.value = UiState()
    }
}