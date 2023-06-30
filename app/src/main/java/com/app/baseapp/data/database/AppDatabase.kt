package com.app.baseapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.baseapp.data.dao.AppDao
import com.app.baseapp.data.modals.dataModals.AppData
import com.app.baseapp.utils.Database.VERSION

@Database(
    entities = [AppData::class], version = VERSION, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appRepo(): AppDao
}