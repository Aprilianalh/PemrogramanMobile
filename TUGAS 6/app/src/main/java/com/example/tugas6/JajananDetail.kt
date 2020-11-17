package com.example.tugas6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_jajanan.*
class JajananDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_jajanan)
        val intentThatStartedThisActivity = intent
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            val imgF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_REFERRER, 0)
            val nameF =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            val deskF =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            val deskS =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            image_detail.setImageResource(imgF)
            name_detail.text = nameF
            desc_detail.text = deskF
            short_detail.text = deskS
        }
    }
}
