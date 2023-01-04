package com.example.livpart2.ui.theme

import androidx.lifecycle.ViewModel
import com.example.livpart2.dataPack.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class viewModel : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    init {
        resetApp()
    }

    //will hopefully log the user out when implemented
    fun resetApp() {
        _uiState.value = UiState()
    }
}