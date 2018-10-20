package co.ghostnotes.sample.font

import android.app.Application
import co.ghostnotes.sample.font.BuildConfig
import timber.log.Timber

class FontSampleApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}