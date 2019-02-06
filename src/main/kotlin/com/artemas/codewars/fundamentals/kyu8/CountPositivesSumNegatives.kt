package com.artemas.codewars.fundamentals.kyu8

class CountPositivesSumNegatives {
    companion object {
        fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int?> {
            val positiveCount = input?.filter { it > 0 }?.count()
            val negativeSum = input?.filter { it < 0 }?.sum()
            return if (input != null) {
                arrayOf(positiveCount, negativeSum)
            } else {
                arrayOf()
            }
        }
    }
}