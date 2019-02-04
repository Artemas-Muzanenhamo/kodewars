package com.artemas.codewars.fundamentals

class Sum {
    fun sumPositives(numbers: IntArray): Int = numbers.filter { (it > 0) }.sum()
//fun sum(numbers: IntArray): Int = numbers.fold(0){ a, b -> a + (if (b < 0) 0 else b)}
}