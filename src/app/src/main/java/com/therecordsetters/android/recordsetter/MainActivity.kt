package com.therecordsetters.android.recordsetter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button press action
        take_pic.setOnClickListener{
            var i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(i, 123)
        }
    }

    //what happens after camera call is complete
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 123 && resultCode == RESULT_OK)
        {
            //makes picture from camera into bitmap format
            var bmp = data?.extras?.get("data") as Bitmap
            //below line only shows that the picture is in our program
            //imageView.setImageBitmap(bmp)
        }

    }
}
