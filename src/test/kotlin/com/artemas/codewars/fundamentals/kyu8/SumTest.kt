package com.artemas.codewars.fundamentals.kyu8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/*
* You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.

*/
class SumTest {
    @Test
    fun testSomething() {
        val sum = Sum()
        assertEquals(15, sum.sumPositives(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(13, sum.sumPositives(intArrayOf(1, -2, 3, 4, 5)))
        assertEquals(0, sum.sumPositives(intArrayOf()))
        assertEquals(0, sum.sumPositives(intArrayOf(-1, -2, -3, -4, -5)))
        assertEquals(9, sum.sumPositives(intArrayOf(-1, 2, 3, 4, -5)))
    }
}