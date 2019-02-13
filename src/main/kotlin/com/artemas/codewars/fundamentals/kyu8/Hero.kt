package com.artemas.codewars.fundamentals.kyu8

class Hero {
    companion object {
        fun hero(bullets: Int, dragons: Int) : Boolean = (bullets / dragons > 1)
    }
}