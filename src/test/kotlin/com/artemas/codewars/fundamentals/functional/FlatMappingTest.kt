package com.artemas.codewars.fundamentals.functional

import com.artemas.codewars.fundamentals.functional.FlatMapping.Companion.sumSubLists
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FlatMappingTest{

    private val sublist1: List<Int> = listOf(10, 20, 30)
    private val sublist2: List<Int> = listOf(40, 50, 60)
    private val listOfNumbers: List<List<Int>> = listOf(sublist1, sublist2)

    @Test
    fun should_return_sum_of_all_values_in_sublists() {
        assertEquals(210, sumSubLists(listOfNumbers))
    }
}