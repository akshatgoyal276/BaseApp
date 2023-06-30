package com.app.baseapp.data.modals.dataModals

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
@Entity
data class AppData(
    @PrimaryKey @Json(name = "app_id") val id: String = "",
    @Json(name = "app_name") val name: String = "",
    @Json(name = "app_description") val description: String = "",
    @Json(name = "app_rating") val rating: Double = 0.0,
    @Json(name = "app_size") val size: Double = 0.0,
)