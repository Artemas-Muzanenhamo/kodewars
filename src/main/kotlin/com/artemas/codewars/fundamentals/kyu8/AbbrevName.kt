package com.artemas.codewars.fundamentals.kyu8

class AbbrevName {
    companion object {
        fun abbrevName(name: String): String = name.split(" ").map { it.take(1) }.joinToString(".").toUpperCase()
    }
}
