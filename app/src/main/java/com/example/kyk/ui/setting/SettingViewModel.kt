package com.example.kyk.ui.setting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Dark Mode"
    }
    val text: LiveData<String> = _text
}