package com.artemas.codewars.fundamentals.functional

import com.artemas.codewars.fundamentals.functional.FilterDemo.Companion.sumNegatives
import com.artemas.codewars.fundamentals.functional.FilterDemo.Companion.sumPositives
import com.artemas.codewars.fundamentals.functional.FilterDemo.Companion.sumPositivesSquared
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FilterDemoTest {
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
}