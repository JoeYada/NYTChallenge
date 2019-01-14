package com.example.joe.nytchallenge.models

import com.google.gson.annotations.SerializedName

data class Meta(@SerializedName("hits")val hits:Int,
                @SerializedName("offset")val offset:Int,
                @SerializedName("time")val time:Int)