package com.artemas.codewars.fundamentals.kyu7

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HighAndLowTest {
  @Test
  fun testFixed() {
    assertEquals("42 -9", highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
  }
}