package com.artemas.codewars.fundamentals.kyu7

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BreakChocolateTest {
    @Test
    fun `Should break chocolate`() {
        assertEquals(breakChocolate(5, 5) , 24)
        assertEquals(breakChocolate(1, 1) , 0)
    }
}