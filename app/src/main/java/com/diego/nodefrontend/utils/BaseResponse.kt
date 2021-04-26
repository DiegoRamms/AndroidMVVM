package com.diego.nodefrontend.utils


class BaseResponse <out T> (val message:String,val data: T?, val statusResponse: StatusResponse){


    companion object{
        fun <T> success(data: T) = BaseResponse("Respuesta Obtenida", data, StatusResponse.OK)
        fun loading() = BaseResponse("Cargando", null, StatusResponse.LOADING)
        fun error() = BaseResponse("Cargando", null, StatusResponse.BAD)
    }

}



enum class StatusResponse{
    OK,
    LOADING,
    BAD
}

