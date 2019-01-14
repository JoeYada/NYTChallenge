package com.example.joe.nytchallenge.di

import android.app.Application
import dagger.Module

@Module(includes = [NetworkModule::class])
class ApplicationModule(val application: Application) {

}