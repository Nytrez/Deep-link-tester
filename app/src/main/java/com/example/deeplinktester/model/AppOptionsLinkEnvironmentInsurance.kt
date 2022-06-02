package com.example.deeplinktester.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AppOptionsLinkEnvironmentInsurance(@SerializedName("name") val insuranceName : String?,
                                @SerializedName("subdomain") val insuranceSubdomain : String?)
{
    fun getName() : String? {
        return insuranceName
    }

    fun getSubdomain() : String?{
        return insuranceSubdomain
    }
}