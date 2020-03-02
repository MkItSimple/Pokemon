package com.example.pokemon.di.module

import androidx.lifecycle.ViewModel
import com.example.pokemon.viewmodel.PokeMonListViewModel
import com.example.pokemon.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class PokemonListViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(PokeMonListViewModel::class)
    internal abstract fun bindPokemonListViewModel(viewModel: PokeMonListViewModel): ViewModel
}