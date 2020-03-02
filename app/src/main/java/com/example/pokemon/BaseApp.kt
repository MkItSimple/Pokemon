package com.example.pokemon

import android.app.Application
import com.example.pokemon.di.component.AppComponent
import com.example.pokemon.di.component.DaggerAppComponent
import com.example.pokemon.di.module.NetworkModule

class BaseApp : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        this.appComponent = this.initDagger()
    }

    private fun initDagger() = DaggerAppComponent.builder()
        .networkModule(NetworkModule())
        .build()
}