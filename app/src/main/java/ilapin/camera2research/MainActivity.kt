package ilapin.camera2research

import android.content.Context
import android.hardware.camera2.CameraManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ilapin.common.android.log.L

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cameraManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager
        val cameraIds = cameraManager.cameraIdList
        if (cameraIds.isNotEmpty()) {
            val characteristics = cameraManager.getCameraCharacteristics(cameraIds[0])
            characteristics.keys.forEach { key ->
                L.d(App.TAG, "$key: ${characteristics.get(key)}")
            }
        }
    }
}
