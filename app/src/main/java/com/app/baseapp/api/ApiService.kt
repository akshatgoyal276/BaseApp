package com.app.baseapp.api

import com.app.baseapp.data.modals.dataModals.AppData
import com.app.baseapp.data.modals.requestModals.GetAppListRequestModal
import com.app.baseapp.data.modals.responseModals.CustomListResponseModal
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET

interface ApiService {
    @GET("appList")
    fun getAppList(
        @Body data: GetAppListRequestModal
    ): Call<CustomListResponseModal<AppData>>
}

fun <T> Call<T>.enqueue(onFailure: () -> Unit = { }, onSuccess: (T) -> Unit) {
    this.enqueue(object : Callback<T> {
        override fun onResponse(call: Call<T>, response: Response<T>) {
            response.body()?.let {
                onSuccess(it)
            }
        }

        override fun onFailure(call: Call<T>, t: Throwable) {
            onFailure()
        }
    })
}