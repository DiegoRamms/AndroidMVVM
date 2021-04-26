package com.diego.nodefrontend.data.model.login

import com.diego.nodefrontend.data.model.user.UserDTO
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class LoginResponseDTO(
    @SerializedName("msg")
    @Expose
    var message: String? = null,

    @SerializedName("usuario")
    @Expose
    var user: UserDTO? = null,

    @SerializedName("token")
    @Expose
    var token: String? = null,
){
}