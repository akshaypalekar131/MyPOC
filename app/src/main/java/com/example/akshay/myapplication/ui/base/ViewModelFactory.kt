package com.example.akshay.myapplication.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.akshay.myapplication.repository.MainRepository
import com.example.akshay.myapplication.ui.main.viewmodel.MainViewModel
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class ViewModelFactory @Inject constructor (private val mainRepository: MainRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(mainRepository) as T
        }
        throw IllegalArgumentException("Unknown class name")
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}