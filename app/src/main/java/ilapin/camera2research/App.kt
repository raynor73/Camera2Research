package ilapin.camera2research

import android.app.Application
import android.os.StrictMode
import timber.log.Timber

class App : Application() {

    companion object {

        const val TAG = "Camera2Research"
    }

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        StrictMode.setThreadPolicy(
            StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build()
        )
        StrictMode.setVmPolicy(
            StrictMode.VmPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build()
        )

    }
}