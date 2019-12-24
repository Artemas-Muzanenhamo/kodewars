package com.artemas.codewars.fundamentals.kyu7

class FlatAndSort {
    companion object {
        fun flattenAndSort(array: Array<IntArray>): IntArray {
            return array
                    .flatMap { it.map { array -> array } }
                    .sorted()
                    .toIntArray()
        }
    }
}