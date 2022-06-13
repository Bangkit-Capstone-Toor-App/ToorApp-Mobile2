package com.kamil.toorapp_mobile2.api

import com.kamil.toorapp_mobile2.api.response.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("api/listChoices")
    fun getDestination(): Call<ArrayList<ApiResponse>>
}