package com.artemas.codewars.fundamentals.functional

import com.artemas.codewars.fundamentals.functional.Mapping.Companion.addNumbersSquared
import com.artemas.codewars.fundamentals.functional.Mapping.Companion.squaredNumbers
import kotlin.test.Test
import kotlin.test.assertEquals

class MappingTest {

    private val listOfNumbers: List<Int> = listOf(10, 2)
    private val anotherList: List<Int> = listOf(1, 2, 3, 4)

    @Test
    fun should_return_sum_of_numbers_squared() {
        assertEquals(104, addNumbersSquared(listOfNumbers))
    }

    @Test
    fun should_return_all_numbers_squared() {
        assertEquals(listOf(1, 4, 9, 16), squaredNumbers(anotherList))
    }
}