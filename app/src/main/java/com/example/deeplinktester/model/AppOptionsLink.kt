package com.example.deeplinktester.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AppOptionsLink(@field:Expose @field:SerializedName("backend-environment") val linkEnvironment: List<AppOptionsLinkEnvironment>?){
    fun getLinkEnv() : List<AppOptionsLinkEnvironment>?{
        return linkEnvironment
    }
}