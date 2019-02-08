package com.artemas.codewars.fundamentals.functional

import com.artemas.codewars.fundamentals.functional.Mapping.Companion.addNumbers
import com.artemas.codewars.fundamentals.functional.Mapping.Companion.subtractNumbers
import kotlin.test.Test
import kotlin.test.assertEquals

class MappingTest {

    val listOfNumbers: List<Int> = listOf(10, 2)

    @Test
    fun testAddNumbers() {
        assertEquals(12, addNumbers(listOfNumbers))
    }

    // TODO : Complete
    fun testSubtractNumber() {
        assertEquals(8, subtractNumbers(listOfNumbers))
    }
}