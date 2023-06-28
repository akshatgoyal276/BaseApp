package com.app.baseapp.repository

import com.app.baseapp.api.ApiService
import com.app.baseapp.data.modals.requestModals.GetAppListRequestModal
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ApiRepository
@Inject constructor(
    private val apiServices: ApiService
) {
    fun getAppList(category: String) = apiServices.getAppList(GetAppListRequestModal(category))
}