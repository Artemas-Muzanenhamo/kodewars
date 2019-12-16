package com.artemas.codewars.fundamentals.kyu8

class MixedSum {
    fun sum(mixed: List<Any>): Int {
        return mixed.map { it.toString() }
                .map { it.toInt() }
                .sum()
    }
}