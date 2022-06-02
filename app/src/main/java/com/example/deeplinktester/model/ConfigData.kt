package com.example.deeplinktester.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ConfigData(@field:Expose @field:SerializedName("config-data") val appOptions: List<AppOptions>){
    fun getConfig() : List<AppOptions>{
        return appOptions
    }

}