package com.example.core02_wishyouwerehere

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location( val name: String, val author: String,
                     val latitude: Float, val longitude: Float,
                     val visited: String, val image: Int = android.R.drawable.picture_frame):Parcelable {
}