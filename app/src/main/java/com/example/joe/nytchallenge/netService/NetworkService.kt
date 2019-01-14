package com.example.joe.nytchallenge.netService

import com.example.joe.nytchallenge.common.RELATIVE_URL
import com.example.joe.nytchallenge.models.ApiResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {
    @GET(RELATIVE_URL)
    fun getSearch(@Query("q")search:String):Single<ApiResponse>
}