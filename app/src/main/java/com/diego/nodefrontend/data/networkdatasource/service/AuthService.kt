package com.diego.nodefrontend.data.networkdatasource.service

import com.diego.nodefrontend.data.model.login.LoginRequest
import com.diego.nodefrontend.data.model.login.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse
}