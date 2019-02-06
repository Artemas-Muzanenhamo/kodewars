package com.artemas.codewars.fundamentals.kyu8

import com.artemas.codewars.fundamentals.kyu8.CountPositivesSumNegatives.Companion.countPositivesSumNegatives
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class CountPositivesSumNegativesTest {
  @Test
  fun testFixed() {
    assertArrayEquals(arrayOf(10, -65), countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
    assertArrayEquals(arrayOf(8, -50), countPositivesSumNegatives(arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)))
    assertArrayEquals(arrayOf<Int>(), countPositivesSumNegatives(null))
  }
}