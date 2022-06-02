package com.example.deeplinktester.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AppOptions(@SerializedName("application-id") val appOptionsId : String?,
                 @SerializedName("application-name") val appOptionsName : String?,
                 @field:Expose @field:SerializedName("universal-link") val appOptionsLink: AppOptionsLink?)
{
    fun getOptionsId() : String?{
        return appOptionsId
    }

    fun getOptionsName() : String?{
        return  appOptionsName
    }

    fun getOptionsLink() : AppOptionsLink?{
        return  appOptionsLink
    }

    override fun toString(): String {
        return appOptionsName!!
    }
}