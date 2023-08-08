package com.artemas.codewars.fundamentals.kyu8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReversedSequenceTests {
    @Test
    fun exampleTestCases() {
        assertEquals(listOf(5, 4, 3, 2, 1), reverseSeq(5))
    }
}