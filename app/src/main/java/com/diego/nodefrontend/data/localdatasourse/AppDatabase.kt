package com.diego.nodefrontend.data.localdatasourse

import androidx.room.Database
import androidx.room.RoomDatabase
import com.diego.nodefrontend.data.localdatasourse.dao.UserDao
import com.diego.nodefrontend.data.model.user.UserCache

@Database(entities = [UserCache::class],version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun getUserDao(): UserDao
}