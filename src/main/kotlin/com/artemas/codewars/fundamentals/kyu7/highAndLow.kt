package com.artemas.codewars.fundamentals.kyu7

fun highAndLow(numbers: String): String {
    val values = numbers.split(" ").map { it.toInt() }

    val max = values.max()
    val min = values.min()

    return "$max $min"
}