package com.diego.nodefrontend.data.model.user

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class UserDTO(
    @SerializedName("estado")
    @Expose
    val status: Boolean? = null,

    @SerializedName("google")
    @Expose
    val google: Boolean? = null,

    @SerializedName("nombre")
    @Expose
    val name: String? = null,

    @SerializedName("correo")
    @Expose
    val email: String? = null,

    @SerializedName("rol")
    @Expose
    val rol: String? = null,

    @SerializedName("uid")
    @Expose
    val uid: String? = null
) {


}
