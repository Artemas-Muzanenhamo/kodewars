package com.artemas.codewars.fundamentals.kyu7

fun evenNumbers(array: List<Int>, number: Int): List<Int> {
    return array
            .filter { value -> value % 2 == 0 }
            .takeLast(number)
}