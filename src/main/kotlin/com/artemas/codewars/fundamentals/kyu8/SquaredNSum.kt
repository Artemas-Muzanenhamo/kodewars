package com.artemas.codewars.fundamentals.kyu8

import kotlin.math.*

class SquaredNSum {
    fun squareSum(n: Array<Int>): Int {
        return n.map { it.toDouble().pow(2.0) }
            .sum()
            .toInt()
    }
}