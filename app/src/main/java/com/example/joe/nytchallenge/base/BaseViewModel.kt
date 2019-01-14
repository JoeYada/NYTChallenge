package com.example.joe.nytchallenge.base

import android.arch.lifecycle.ViewModel
import com.example.joe.nytchallenge.di.DaggerViewModelInjector
import com.example.joe.nytchallenge.di.NetworkModule
import com.example.joe.nytchallenge.di.ViewModelInjector
import com.example.joe.nytchallenge.ui.home.ItemListViewModel

abstract class BaseViewModel:ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .netModule(NetworkModule())
        .build()

    init {
        inject()
    }

    private fun inject(){
        when(this){
            is ItemListViewModel -> injector.inject(this)
        }
    }
}