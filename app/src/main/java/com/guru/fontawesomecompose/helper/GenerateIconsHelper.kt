package com.guru.fontawesomecompose.helper

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import org.json.JSONException
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.URL

object GenerateIconsHelper {

    private const val faIconsPath = "https://raw.githubusercontent" +
    ".com/FortAwesome/Font-Awesome/master/metadata/icons.json"

    private val iconsJsonUrl = URL(faIconsPath)

    suspend fun readIconsJsonFromUrl() {
        withContext(Dispatchers.IO) {
            iconsJsonUrl?.readStream()?.let {
                withContext(Dispatchers.Default) {
                    parseJson(iconsContent = it)
                }
            }
        }
    }
}

internal fun URL.readStream(): String? {
    val stream = openStream()
    return try {
        val r = BufferedReader(InputStreamReader(stream))
        val result = StringBuilder()
        var line: String?
        while (r.readLine().also { line = it } != null) {
            result.append(line)
        }
        result.toString()
    } catch (e: IOException){
        e.toString()
    }
}

fun parseJson(iconsContent: String):List<Any>?{
    val list = mutableListOf<Any>()
    val iconUrlPrefix = "https://fontawesome.com/icons/"
    try {
        val icons = JSONObject(iconsContent)
        icons.keys().forEach { key ->
            val icon = icons.getJSONObject(key)
            val codePoint = icon["unicode"]
            if (icon.getJSONArray("styles").get(0) == "brands") {
                val name = modifyNameCasing(key)
                Log.d("json", "   ")
                Log.d("json", "// $iconUrlPrefix$key?style=brands")
                Log.d("json msg", "// Brands icon : $name")
                Log.d("json icons", "const val $name = 0x$codePoint")
            }

//            if (icon.getJSONArray("styles").get(0) == "solid") {
//                val name = modifyNameCasing(key)
//                Log.d("json", "   ")
//                Log.d("json", "// $iconUrlPrefix$key?style=solid")
//                Log.d("json msg", "// Solid icon : $name")
//                Log.d("json icons", "const val $name = 0x$codePoint")
//            }

//            if (icon.getJSONArray("styles").length() > 1
//                && (icon.getJSONArray("styles").get(1) == "regular")) {
//                val name = modifyNameCasing(key)
//                Log.d("json", "   ")
//                Log.d("json", "// $iconUrlPrefix$key?style=regular")
//                Log.d("json msg", "// Regular icon : $name")
//                Log.d("json icons", "const val ${name}Regular = 0x$codePoint")
//            }
        }
    } catch (e: JSONException){
        Log.d("Json parse exception", e.toString())
    }

    return list
}

// abc-def-xyz to AbcDefXyz
fun modifyNameCasing(name: String): String {
    if (name.contains("-")) {
        val subNames = name.split("-")
        val newName = StringBuilder()
        subNames.forEach {
            newName.append(it.capitalize())
        }

        return newName.toString()
    }

    return name.capitalize()
}