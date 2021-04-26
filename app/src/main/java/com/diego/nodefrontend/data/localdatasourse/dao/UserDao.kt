package com.diego.nodefrontend.data.localdatasourse.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.diego.nodefrontend.data.model.user.UserCache


@Dao
interface UserDao {

    @Insert()
    fun insertUser(userCache: UserCache)

    @Query("Select * from user limit 1")
    fun getUser(): UserCache

}