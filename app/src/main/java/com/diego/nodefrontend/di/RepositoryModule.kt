package com.diego.nodefrontend.di

import com.diego.nodefrontend.data.repository.LoginRepository
import com.diego.nodefrontend.data.repository.LoginRepositoryImpl
import com.diego.nodefrontend.data.networkdatasource.service.AuthService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {


    @Singleton
    @Provides
    fun provideAuthRepository(authService: AuthService): LoginRepository {
        return LoginRepositoryImpl(authService)
    }

}