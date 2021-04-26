package com.diego.nodefrontend.di

import android.content.Context
import androidx.room.Room
import com.diego.nodefrontend.data.localdatasourse.AppDatabase
import com.diego.nodefrontend.data.localdatasourse.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) : AppDatabase{
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "node.db"
        ).build()
    }


    @Provides
    @Singleton
    fun provideUserDao(appDatabase: AppDatabase) = appDatabase.getUserDao()

}