package com.artemas.codewars.fundamentals.functional

import com.artemas.codewars.fundamentals.functional.Mapping.Companion.addNumbersSquared
import com.artemas.codewars.fundamentals.functional.Mapping.Companion.mapToPerson
import com.artemas.codewars.fundamentals.functional.Mapping.Companion.squaredNumbers
import org.junit.jupiter.api.Test
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

    // TODO: Make this pass...
//    @Test
//    fun should_map_string_array_to_person_object() {
//        val personString = arrayOf("Artemas", "Muzanenhamo", 1, "28/03/1990")
//        val person: Person = Person("Artemas", "Muzanenhamo", 1, "28/03/1990")
//        assertEquals(person, mapToPerson(personString))
//    }
}