package com.example.core02_wishyouwerehere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val location = intent.getParcelableExtra<Location>("location")

        location?.let{
        val vName = findViewById<TextView>(R.id.name)
        vName.text = it.name

        val vAuthor = findViewById<TextView>(R.id.university)
        vAuthor.text = it.author

        val vVisited = findViewById<TextView>(R.id.date)
        vVisited.text = it.visited

        val vImage = findViewById<ImageView>(R.id.imageView)
        vImage.setImageDrawable(resources.getDrawable(it.image, theme))
        }
    }
}