package com.artemas.codewars.fundamentals.kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanNumeralsTest {
    @Test
    fun basic() {
        assertEquals(0, decode(""))
        assertEquals(1, decode("I"))
        assertEquals(21, decode("XXI"))
        assertEquals(2008, decode("MMVIII"))
        assertEquals(1666, decode("MDCLXVI"))
        assertEquals(4, decode("IV"))
        assertEquals(2947, decode("MMCMXLVII"))
    }
}
