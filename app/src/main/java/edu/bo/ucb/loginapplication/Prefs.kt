package edu.bo.ucb.loginapplication

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson

class Prefs(context:Context) {
    val PREFS_FILENAME = "edu.bo.ucb.pref"
    val KEY_USER ="user"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)
    var user: Usuario
        get(){
            val gson = Gson()
            return gson.fromJson(prefs.getString(KEY_USER,null),Usuario::class.java)
        }
        set(value){
            val gson = Gson()
            val userJson = gson.toJson(value)
            prefs.edit().putString(KEY_USER,userJson).apply()
        }
}