package com.therecordsetters.android.recordsetter

import android.content.Intent
import android.provider.MediaStore.ACTION_IMAGE_CAPTURE
import androidx.appcompat.app.AppCompatActivity

class CameraInterface : AppCompatActivity() {

    val REQUEST_IMAGE_CAPTURE = 1

    fun dispatchTakePictureIntent2() {
        Intent(ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }
}