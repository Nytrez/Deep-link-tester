package com.example.deeplinktester.viewmodel

import android.content.Context
import com.example.deeplinktester.model.ConfigData
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.io.IOException


object ConfigUtils {

    private fun getJsonDataFromAsset(context: Context, fileName: String): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

    public fun getConfig(context: Context) : ConfigData {
        val jsonFileString = getJsonDataFromAsset(context, "config.json")
        val gson = GsonBuilder().create()
        val configListType = object : TypeToken<ConfigData>() {}.type
        val config: ConfigData = gson.fromJson(jsonFileString, configListType)

        return config
    }
}