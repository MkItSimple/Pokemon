package com.example.pokemon.di.component

import com.example.pokemon.di.module.NetworkModule
import com.pokemon.di.scope.AppScope
import dagger.Component


@AppScope
@Component(
    modules = [
        NetworkModule::class
    ]
)
interface AppComponent {
}