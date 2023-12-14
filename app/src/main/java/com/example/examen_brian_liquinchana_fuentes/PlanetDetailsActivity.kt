package com.example.examen_brian_liquinchana_fuentes

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class PlanetDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_details)

        val planetName = intent.getStringExtra("planet_name")
        val planetDiscovery = intent.getStringExtra("planet_discovery")
        val planetSatellites = intent.getStringExtra("planet_satellites")
        val planetRings = intent.getStringExtra("planet_rings")
        val planetType = intent.getStringExtra("planet_type")
        val planetImageResId = intent.getIntExtra("planet_image_res_id", 0)

        val imageView: ImageView = findViewById(R.id.planet_image)
        imageView.setImageDrawable(ContextCompat.getDrawable(this, planetImageResId))

        val nameTextView: TextView = findViewById(R.id.planet_name)
        nameTextView.text = planetName

        val discoveryTextView: TextView = findViewById(R.id.planet_discovery)
        discoveryTextView.text = planetDiscovery

        val satellitesTextView: TextView = findViewById(R.id.planet_satellites)
        satellitesTextView.text = planetSatellites

        val ringsTextView: TextView = findViewById(R.id.planet_rings)
        ringsTextView.text = planetRings

        val typeTextView: TextView = findViewById(R.id.planet_type)
        typeTextView.text = planetType

        val backButton: Button = findViewById(R.id.button_back)
        backButton.setOnClickListener {
            finish()
        }
    }
}



