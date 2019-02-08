package com.artemas.codewars.fundamentals.functional

import com.artemas.codewars.fundamentals.functional.Filtering.Companion.sumNegatives
import com.artemas.codewars.fundamentals.functional.Filtering.Companion.sumNegativesSquared
import com.artemas.codewars.fundamentals.functional.Filtering.Companion.sumPositives
import com.artemas.codewars.fundamentals.functional.Filtering.Companion.sumPositivesSquared
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FilteringTest {
    private val listOfNumbers: List<Int> = listOf(20, -10, 33, 44, -2, -94, 22)

    @Test
    fun testSumPositives() {
        assertEquals(119, sumPositives(listOfNumbers))
    }

    @Test
    fun testSumNegatives() {
        assertEquals(-106, sumNegatives(listOfNumbers))
    }

    @Test
    fun testPositiveSumSquared() {
        assertEquals(3909, sumPositivesSquared(listOfNumbers))
    }

    @Test
    fun testNegativesSumSquared() {
        assertEquals(8940, sumNegativesSquared(listOfNumbers))
    }
}