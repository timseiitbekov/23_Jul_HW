package com.example.googlemap

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.googlemap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.main)
        enableEdgeToEdge()

        Glide.with(this)
            .load("https://media1.tenor.com/m/c-S8cUwVVVEAAAAC/duck-dance.gif")
            .centerCrop()
            .into(binding.imageView)
    }
}