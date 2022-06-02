package com.example.deeplinktester.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.*
import com.example.deeplinktester.R
import com.example.deeplinktester.viewmodel.LinkChecks
import com.example.deeplinktester.viewmodel.ConfigUtils
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var appOptionsSpinner : Spinner
    private lateinit var envOptionsSpinner : Spinner
    private lateinit var branchOptionsSpinner : Spinner
    private lateinit var useCaseOptionsSpinner : Spinner
    private lateinit var openDeepLinkButton : Button
    private lateinit var deepLinkEditTextPreview : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupFunctionality()

    }

    private fun setupFunctionality() {
        openDeepLinkButton = findViewById(R.id.deepLinkStart)
        deepLinkEditTextPreview = findViewById(R.id.deepLinkPreview)

        openDeepLinkButton.setOnClickListener {
            if (!TextUtils.isEmpty(deepLinkEditTextPreview.text) && LinkChecks.isProperUri(deepLinkEditTextPreview.text.toString())){
                LinkChecks.startDeepLink(deepLinkEditTextPreview.text.toString(), this)
        } else {
            Snackbar.make(deepLinkEditTextPreview, "Invalid link, please fix it", Snackbar.LENGTH_LONG).show()
            }
        }


        val cfg = ConfigUtils.getConfig(this)

        appOptionsSpinner = findViewById(R.id.app_options)
        ArrayAdapter.createFromResource(
            this,
            R.array.planets_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            appOptionsSpinner.adapter = adapter
        }

        envOptionsSpinner = findViewById(R.id.env_options)
        ArrayAdapter.createFromResource(
            this,
            R.array.planets_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            envOptionsSpinner.adapter = adapter
        }

        branchOptionsSpinner = findViewById(R.id.branch_options)
        ArrayAdapter.createFromResource(
            this,
            R.array.planets_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            branchOptionsSpinner.adapter = adapter
        }

        useCaseOptionsSpinner = findViewById(R.id.usecase_options)
        ArrayAdapter.createFromResource(
            this,
            R.array.planets_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            useCaseOptionsSpinner.adapter = adapter
        }

    }
}