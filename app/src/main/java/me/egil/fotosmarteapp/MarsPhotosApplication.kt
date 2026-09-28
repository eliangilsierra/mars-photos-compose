package me.egil.fotosmarteapp

import android.app.Application
import me.egil.fotosmarteapp.data.AppContainer
import me.egil.fotosmarteapp.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
