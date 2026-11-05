package edu.iesam.marvelapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.marvelapp.feature.superheros.domain.Superhero
import edu.iesam.marvelapp.features.superheroes.data.local.xml.SuperHeroXmlLocalDataSource
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*
        // crear un fichero SharedPreferences para verlo
        val xml = SuperHeroXmlLocalDataSource(this)
        xml.save(mutableListOf(
            Superhero("1", "Superman", "superman","image"),
            Superhero("2", "Supermano", "supermano","image2"),
            Superhero("3", "Supermani", "supermani","image3"),
            Superhero("4", "Supermanu", "supermanu","image4"),
            Superhero("5", "Supermana", "supermana","image5")))

        val superhero = xml.findById("1")
        Log.d(MainActivity::class.java.simpleName, superhero.toString())
         */


    }
}