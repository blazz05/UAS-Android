package com.aldi.movieal.data.response

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.aldi.movieal.R
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseLogin (
    @field:SerializedName("username")
    var username: String? = null,

    @field:SerializedName("password")
    var password: String? = null
) : Parcelable
