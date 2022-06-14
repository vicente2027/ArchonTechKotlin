package com.archontech.ui.home

import androidx.navigation.NavController
import android.widget.Spinner
import android.widget.ArrayAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import com.archontech.ui.home.HomeViewModel
import androidx.lifecycle.ViewModelProvider
import com.archontech.R
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData

class HomeViewModel : ViewModel() {
    private val mText: MutableLiveData<String>
    val text: LiveData<String>
        get() = mText

    init {
        mText = MutableLiveData()
        mText.value = "This is home fragment"
    }
}