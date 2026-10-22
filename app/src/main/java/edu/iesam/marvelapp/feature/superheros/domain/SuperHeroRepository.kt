package edu.iesam.marvelapp.feature.superheros.domain


interface SuperheroRepository {
    fun obtainSuperheros(): List<Superhero>
}