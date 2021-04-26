package com.diego.nodefrontend.data.model.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "user")
data class UserCache(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_cache")
    val idUserCache: Int,

    val status: Boolean,

    val google: Boolean,

    val name: String,

    @SerializedName("correo")
    @Expose
    val email: String,

    @SerializedName("rol")
    @Expose
    val rol: String? = null,

    @SerializedName("uid")
    @Expose
    val uid: String
) {
}