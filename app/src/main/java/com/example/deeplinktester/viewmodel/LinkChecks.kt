package com.example.deeplinktester.viewmodel

import android.content.Context
import android.content.pm.PackageManager
import android.content.Intent
import android.content.pm.ResolveInfo
import android.net.Uri


object LinkChecks {
    fun startDeepLink(deepLink: String, mContext: Context): Boolean {
            val intent = createDeepLinkIntent(deepLink)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            val resolveInfo = getResolveInfo(mContext, intent)
        return if (resolveInfo != null) {
            mContext.startActivity(intent)
            true
        } else {
            false
        }
    }

    private fun createDeepLinkIntent(deepLinkURI: String): Intent {
        return Intent(Intent.ACTION_VIEW, Uri.parse(deepLinkURI))
    }

    public fun isProperUri(uriText: String): Boolean {
        val uri: Uri = Uri.parse(uriText)
        return if (uri.scheme == null || uri.scheme!!.length.equals("")) {
            false
        } else !(uriText.contains("\n") || uriText.contains(" "))
    }

    private fun getResolveInfo(mContext: Context, intent: Intent): ResolveInfo? {
        return mContext.packageManager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY)
    }
}