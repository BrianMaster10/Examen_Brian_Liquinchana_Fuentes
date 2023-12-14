package com.example.examen_brian_liquinchana_fuentes
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class PlanetAdapter(context: Context, planets: Array<MainActivity.Planet>) : ArrayAdapter<MainActivity.Planet>(context, 0, planets) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item_planet, parent, false)

        val planet = getItem(position)

        val imageView: ImageView = view.findViewById(R.id.planet_image)
        if (planet != null) {
            imageView.setImageResource(planet.imageResId)
        }

        val nameTextView: TextView = view.findViewById(R.id.planet_name)
        if (planet != null) {
            nameTextView.text = planet.name
        }

        val typeTextView: TextView = view.findViewById(R.id.planet_type)
        if (planet != null) {
            typeTextView.text = planet.type
        }

        return view
    }
}
