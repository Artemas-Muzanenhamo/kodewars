package com.artemas.codewars.fundamentals.kyu8

fun areaOrPerimeter(l: Int, w: Int): Int {
    if (l == w) {
        return l * w
    }

    return (l + w) * 2
}