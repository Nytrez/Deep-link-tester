package com.example.deeplinktester.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AppOptionsLinkEnvironment(@SerializedName("name") val envName : String?,
                 @SerializedName("static-path") val envStaticPath : String?,
                 @field:Expose @field:SerializedName("insurance") val envInsuranceList:
                                List<AppOptionsLinkEnvironmentInsurance>?){


    fun getEnvironmentName() : String?{
        return envName
    }
    fun getEnvironmentStaticPath() : String?{
        return envStaticPath
    }
    fun getEnvironmentInsuranceList() : List<AppOptionsLinkEnvironmentInsurance>?{
        return envInsuranceList
    }
}