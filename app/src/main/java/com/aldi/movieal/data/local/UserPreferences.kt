package com.aldi.movieal.data.local

import android.content.Context
import com.aldi.movieal.data.response.ResponseLogin

class UserPreferences(context: Context) {
    companion object {
        private val PREF_NAME = "user_preferences"
        private  val USERNAME = "username"
        private  val PASSWORD = "password"
    }

    private val preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    // fungsi untuk menyimpan data
    fun setUser(responseLogin: ResponseLogin){
        val set = preferences.edit()
        set.putString(USERNAME, responseLogin.username)
        set.putString(PASSWORD, responseLogin.password)

        set.apply()
    }

    // fungsi untuk mengambil data
    fun getUser(): ResponseLogin {
        val data = ResponseLogin()
        data.username = preferences.getString(USERNAME, "")
        data.password = preferences.getString(PASSWORD, "")

        return data
    }

}