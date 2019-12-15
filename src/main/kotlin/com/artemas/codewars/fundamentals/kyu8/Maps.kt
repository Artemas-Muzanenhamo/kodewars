package com.artemas.codewars.fundamentals.kyu8

fun maps(x: IntArray): IntArray {
    return x.map { number -> number * 2 }.toIntArray()
}