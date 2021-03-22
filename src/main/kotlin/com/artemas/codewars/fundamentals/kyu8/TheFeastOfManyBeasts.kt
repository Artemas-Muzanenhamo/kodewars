package com.artemas.codewars.fundamentals.kyu8

class TheFeastOfManyBeasts {
    fun feast(beast: String, dish: String): Boolean {
        return dish.startsWith(beast.first(), ignoreCase = true) && dish.endsWith(beast.last(), ignoreCase = true)
    }
}