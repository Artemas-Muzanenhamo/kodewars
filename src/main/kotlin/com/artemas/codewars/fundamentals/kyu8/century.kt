package com.artemas.codewars.fundamentals.kyu8

fun century(year: Int): Int {
    val century = 100
    if (year % century == 0) {
        return year / century
    }

    return (year / century) + 1
}