package com.example.examen_brian_liquinchana_fuentes
import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    data class Planet(val name: String, val discovery: String, val satellites: String, val rings: String, val type: String, val imageResId: Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planets = arrayOf(
            Planet("Mercurio", "Descubierto en la antigüedad", "0 satélites", "No tiene anillos", "Terrestre", R.drawable.mercury),
            Planet("Venus", "Descubierto en la antigüedad", "0 satélites", "No tiene anillos", "Terrestre", R.drawable.venus),
            Planet("Tierra", "Descubierto en la antigüedad", "1 satélite", "No tiene anillos", "Terrestre", R.drawable.earth),
            Planet("Marte", "Descubierto en la antigüedad", "2 satélites", "No tiene anillos", "Terrestre", R.drawable.mars),
            Planet("Júpiter", "Descubierto en la antigüedad", "79 satélites", "Tiene anillos", "Gigante Gaseoso", R.drawable.jupiter),
            Planet("Saturno", "Descubierto en la antigüedad", "82 satélites", "Tiene anillos", "Gigante Gaseoso", R.drawable.saturn),
            Planet("Urano", "Descubierto por William Herschel en 1781", "27 satélites", "Tiene anillos", "Gigante Helado", R.drawable.uranus),
            Planet("Neptuno", "Descubierto por Urbain Le Verrier y Johann Galle en 1846", "14 satélites", "Tiene anillos", "Gigante Helado", R.drawable.neptune)
        )
        val adapter = PlanetAdapter(this, planets)

        val listView: ListView = findViewById(R.id.planets_list)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val planet = planets[position]
            val intent = Intent(this, PlanetDetailsActivity::class.java)
            intent.putExtra("planet_name", planet.name)
            intent.putExtra("planet_discovery", planet.discovery)
            intent.putExtra("planet_satellites", planet.satellites)
            intent.putExtra("planet_rings", planet.rings)
            intent.putExtra("planet_type", planet.type)
            intent.putExtra("planet_image_res_id", planet.imageResId)
            startActivity(intent)
        }
    }
}





