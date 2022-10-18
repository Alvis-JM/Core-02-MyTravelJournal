package com.example.core02_wishyouwerehere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val swinburne = Location("Swinburne University", "Swinburne", latitude = -37.821539f, longitude = 145.036473f, "22/09/2020", image = R.drawable.swinburne)
        val rmit = Location("RMIT University", "RMIT", latitude = -37.821539f, longitude = 145.036473f,"02/03/2019", image = R.drawable.rmit)
        val uom = Location("University of Melbourne", "UOM", latitude = -37.821539f, longitude = 145.036473f,"05/04/2021", image = R.drawable.uom)
        val monash = Location("Monash University", "Monash", latitude = -37.821539f, longitude = 145.036473f, "09/09/2022", image = R.drawable.monash)

        val vSwinburne = findViewById<ImageView>(R.id.swinburneView)
        vSwinburne.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("location", swinburne)
            startActivity(intent)
        }

        val vRmit = findViewById<ImageView>(R.id.imageView)
        vRmit.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("location", rmit)
            startActivity(intent)
        }

        val vUom = findViewById<ImageView>(R.id.uomView)
        vUom.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("location", uom)
            startActivity(intent)
        }


        val vMonash = findViewById<ImageView>(R.id.monashView)
        vMonash.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("location", monash)
            startActivity(intent)
        }

    }
}