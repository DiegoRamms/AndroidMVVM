package com.diego.nodefrontend.data.model.user

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
    val status: Boolean? = null,
    val google: Boolean? = null,
    val name: String? = null,
    val email: String? = null,
    val rol: String? = null,
    val uid: String? = null
)