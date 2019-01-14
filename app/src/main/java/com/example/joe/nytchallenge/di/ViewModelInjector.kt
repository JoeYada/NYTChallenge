package com.example.joe.nytchallenge.di

import com.example.joe.nytchallenge.ui.home.ItemListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ViewModelInjector {

    fun inject(itemListViewModel: ItemListViewModel)

    @Component.Builder
    interface Builder{
        fun build():ViewModelInjector

        fun netModule(networkModule: NetworkModule):Builder
    }
}