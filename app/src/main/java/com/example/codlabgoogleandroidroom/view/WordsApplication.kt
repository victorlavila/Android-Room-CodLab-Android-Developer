package com.example.codlabgoogleandroidroom.view

import android.app.Application
import com.example.codlabgoogleandroidroom.model.WordRepository
import com.example.codlabgoogleandroidroom.model.WordRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WordsApplication: Application() {
    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { WordRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { WordRepository(database.wordDao()) }
}