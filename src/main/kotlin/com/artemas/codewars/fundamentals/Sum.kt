package com.artemas.codewars.fundamentals

fun sum(numbers: IntArray): Int = numbers.fold(0){ a, b -> a + (if (b < 0) 0 else b)}