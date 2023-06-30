package com.app.baseapp.di

import android.content.Context
import androidx.room.Room
import com.app.baseapp.data.dao.AppDao
import com.app.baseapp.data.database.AppDatabase
import com.app.baseapp.utils.Database
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context, AppDatabase::class.java, Database.NAME
        ).fallbackToDestructiveMigration().allowMainThreadQueries().build()
    }

    @Provides
    fun provideAppDao(appDatabase: AppDatabase): AppDao {
        return appDatabase.appRepo()
    }
}