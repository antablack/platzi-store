package com.example.platzistore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lblWorld.text = "This is a text from kotlin"
        toastLong("This is a short toast")

        lblWorld.setOnClickListener {
            startActivity<DetailActivity>("text" to "Texto de text")
        }

    }
}
