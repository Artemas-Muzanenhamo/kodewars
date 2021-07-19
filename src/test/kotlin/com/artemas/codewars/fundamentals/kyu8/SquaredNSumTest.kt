package com.artemas.codewars.fundamentals.kyu8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SquaredNSumTest {
    private val kata = SquaredNSum()

    @Test
    fun `Sum of Squared Inputs`() {
        assertEquals(9, kata.squareSum(arrayOf(1,2,2)))
        assertEquals(5, kata.squareSum(arrayOf(1,2)))
        assertEquals(50, kata.squareSum(arrayOf(5,-3,4)))
    }
}