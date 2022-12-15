package com.mahesaiqbal.jetheroes.data

import com.mahesaiqbal.jetheroes.model.Hero
import com.mahesaiqbal.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero> {
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}