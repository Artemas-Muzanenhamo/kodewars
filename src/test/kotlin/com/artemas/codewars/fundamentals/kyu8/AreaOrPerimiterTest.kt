package com.artemas.codewars.fundamentals.kyu8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AreaOrPerimiterTest {

    @Test
    fun `Should return the area if it is a square`() {
        val total = areaOrPerimeter(4, 4)

        assertEquals(16, total)
    }

    @Test
    fun `Should return the perimiter total it is a rectangle`() {
        val total = areaOrPerimeter(6, 4)

        assertEquals(20, total)
    }
}