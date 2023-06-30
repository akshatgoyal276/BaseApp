package com.app.baseapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.app.baseapp.data.modals.dataModals.AppData

@Dao
interface AppDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(data: List<AppData>)

    @Query("SELECT * FROM AppData")
    fun get(assetIds: List<String>): List<AppData>
}