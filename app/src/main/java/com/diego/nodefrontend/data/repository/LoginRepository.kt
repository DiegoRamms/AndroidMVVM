package com.diego.nodefrontend.data.repository

import com.diego.nodefrontend.data.model.login.LoginRequest
import com.diego.nodefrontend.data.model.login.LoginResponse

interface  LoginRepository {
   suspend fun login(loginRequest: LoginRequest): LoginResponse
}