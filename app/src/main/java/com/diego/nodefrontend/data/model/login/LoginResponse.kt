package com.diego.nodefrontend.data.model.login

import com.diego.nodefrontend.data.model.user.UserDTO


data class LoginResponse(
    var user: UserDTO? = null,
    var token: String? = null,
){
}