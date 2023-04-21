package com.khanappsnj.thinktank.di

import com.khanappsnj.thinktank.repository.AuthRepository
import com.khanappsnj.thinktank.repository.CollaborateRepository
import com.khanappsnj.thinktank.repository.CollaborateRepositoryImpl

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule: Module = module {
    single { HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY } }
    single { GsonConverterFactory.create() }
    single { OkHttpClient.Builder().addInterceptor(get<HttpLoggingInterceptor>()).build() }
    single { Retrofit.Builder().baseUrl("")
        .addConverterFactory(get<GsonConverterFactory>()).client(get<OkHttpClient>()).build() }
    single { get<Retrofit>().create(AuthApiService::class.java) }
    single { get<Retrofit>().create(CollaborateApiService::class.java) }
}

val repositoryModule: Module = module {
    single<AuthRepository> { AuthRepositoryImpl(get(), get()) }
    single<CollaborateRepository> { CollaborateRepositoryImpl(get(), get()) }
}

val viewModelModule: Module = module {
    viewModel { LoginViewModel(get()) }
    viewModel { SignupViewModel(get()) }
    viewModel { ProblemListViewModel(get()) }
    viewModel { ProblemDetailViewModel(get()) }
    viewModel { IterationDetailViewModel(get()) }
    viewModel { SolutionDetailViewModel(get()) }
}

val appModule: List<Module> = listOf(networkModule, repositoryModule, viewModelModule)