package com.artemas.codewars.fundamentals.functional

import com.artemas.codewars.fundamentals.functional.Flatmapping.Companion.sumSubLists
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FlatMappingTest{

    val sublist1: List<Int> = listOf(10, 20, 30)
    val sublist2: List<Int> = listOf(40, 50, 60)
    val listOfNumbers: List<List<Int>> = listOf(sublist1, sublist2)

    @Test
    fun should_return_sum_of_all_values_in_sublists() {
        assertEquals(210, sumSubLists(listOfNumbers))
    }
}