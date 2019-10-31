package com.example.clickbait

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.clickbait.viewmodel.MainViewModel
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainViewModel:MainViewModel=ViewModelProviders.of(this)[MainViewModel::class.java]


        val linearLayout:LinearLayout=findViewById(R.id.viewgroup)

        linearLayout.setOnClickListener {
            mainViewModel.clickBait()

        }

        mainViewModel._sSnackbar.observe(this, Observer { text->

            text?.let {

                Snackbar.make(linearLayout,text,Snackbar.LENGTH_SHORT).show()
            }
        })

    }
}
