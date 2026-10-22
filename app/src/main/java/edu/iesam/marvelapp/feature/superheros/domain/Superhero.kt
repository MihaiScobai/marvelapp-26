package edu.iesam.marvelapp.feature.superheros.domain

import java.net.URL

data class Superhero(
    val id: Int,
    val name: String,
    val slug: String,
    val urlImage: String){
}