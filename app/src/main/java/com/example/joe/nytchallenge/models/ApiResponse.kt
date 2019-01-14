package com.example.joe.nytchallenge.models

import com.google.gson.annotations.SerializedName

data class ApiResponse(@SerializedName("status")val status:String,
                       @SerializedName("copyright")val copyright:String,
                       @SerializedName("response")val response:Response)