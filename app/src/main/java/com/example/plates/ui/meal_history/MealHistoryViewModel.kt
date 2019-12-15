package com.example.plates.ui.meal_history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MealHistoryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is meal history Fragment"
    }
    val text: LiveData<String> = _text
}