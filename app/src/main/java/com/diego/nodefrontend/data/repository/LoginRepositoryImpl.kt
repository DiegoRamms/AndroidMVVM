package com.diego.nodefrontend.data.repository

import com.diego.nodefrontend.data.networkdatasource.service.AuthService
import com.diego.nodefrontend.data.model.login.LoginRequest
import com.diego.nodefrontend.data.model.login.LoginResponse
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(private val authService: AuthService) :
    LoginRepository {

    override suspend fun login(loginRequest: LoginRequest): LoginResponse {
        return authService.login(loginRequest)
    }
}