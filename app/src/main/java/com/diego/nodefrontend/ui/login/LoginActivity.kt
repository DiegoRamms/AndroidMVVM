package com.diego.nodefrontend.ui.login

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.diego.nodefrontend.R
import com.diego.nodefrontend.data.model.login.LoginRequest
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : ComponentActivity(){

    private val viewModel: LoginViewModel by viewModels()
    var p = 12
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initObserverResponse()

        viewModel.login(LoginRequest("test11@gmail.com","31332r323"))


        testLambda{

        }


       Log.e("Bool",lambda1(12,12).toString())
    }


    private fun initObserverResponse(){
        viewModel.response.observe(this){
            Log.i("Response",it.data.toString())
        }
    }


    private val lambda1: (num:Int,num2:Int) -> Int = {
       x, y -> x+y
    }

    private fun testLambda(result2: (num: Int) -> Unit){
        result2(12)
    }
}