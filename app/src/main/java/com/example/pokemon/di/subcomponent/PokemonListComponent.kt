package com.example.pokemon.di.subcomponent

import com.example.pokemon.di.module.PokemonListViewModelModule
import com.example.pokemon.di.module.ViewModelFactoryModule
import com.example.pokemon.ui.PokemonListFragment
import com.pokemon.di.scope.FragmentScope
import dagger.Subcomponent

@FragmentScope
@Subcomponent(
    modules = [
        ViewModelFactoryModule::class,
        PokemonListViewModelModule::class
    ]
)
interface PokemonListComponent {
    fun inject(pokemonListFragment: PokemonListFragment)
}