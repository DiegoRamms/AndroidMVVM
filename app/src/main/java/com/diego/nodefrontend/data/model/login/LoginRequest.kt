package com.diego.nodefrontend.data.model.login

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("correo")
    @Expose
    val email: String,
    @SerializedName("password")
    @Expose
    val password: String
)