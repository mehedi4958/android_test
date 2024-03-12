package com.example.androidtest.login.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidtest.login.domain.repository.UserRepository
import kotlinx.coroutines.launch

class ViewModel(val repository: UserRepository): ViewModel() {
    init {
        viewModelScope.launch { repository.getData() }

    }
}
