package com.diego.nodefrontend.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diego.nodefrontend.data.repository.LoginRepositoryImpl
import com.diego.nodefrontend.data.model.login.LoginRequest
import com.diego.nodefrontend.data.model.login.LoginResponse
import com.diego.nodefrontend.utils.BaseResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(private val authRepositoryImpl: LoginRepositoryImpl): ViewModel(){

    private val _response = MutableLiveData<BaseResponse<LoginResponse>>()
    val response get() = _response


    fun login(loginRequest: LoginRequest){
        _response.value = BaseResponse.loading()
        viewModelScope.launch(Dispatchers.Main) {
            try {
                val res = withContext(Dispatchers.IO){
                    authRepositoryImpl.login(loginRequest)
                }
                _response.postValue(BaseResponse.success(res))
            }catch (e: Exception){
                _response.postValue(BaseResponse.error())
            }

        }
    }

}