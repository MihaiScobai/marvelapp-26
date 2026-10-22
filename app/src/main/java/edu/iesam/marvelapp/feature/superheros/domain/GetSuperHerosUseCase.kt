package edu.iesam.marvelapp.feature.superheros.domain

class GetSuperheroesUseCase(private val superheroRepository: SuperheroRepository) {

    operator fun invoke(): List<Superhero> {
        return superheroRepository.obtainSuperheros()
    }
}