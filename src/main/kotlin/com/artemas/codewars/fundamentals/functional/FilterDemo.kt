package com.artemas.codewars.fundamentals.functional

class FilterDemo {
    companion object {
        fun sumPositives(listOfNumber: List<Int>): Int = listOfNumber.filter { it > 0 }.sum()
        fun sumNegatives(listOfNumber: List<Int>): Int = listOfNumber.filter { it < 0 }.sum()
        fun sumPositivesSquared(listOfNumber: List<Int>) = listOfNumber.filter { it > 0 }.map { it * it }.sum()
        fun sumNegativesSquared(listOfNumber: List<Int>) = listOfNumber.filter { it < 0 }.map { it * it }.sum()
    }
}
