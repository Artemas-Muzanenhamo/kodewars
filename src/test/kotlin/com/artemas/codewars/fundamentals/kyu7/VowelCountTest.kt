package com.artemas.codewars.fundamentals.kyu7

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VowelCountTest {

  @Test
  fun testFixed() {
    assertEquals(5, vowelCount("abracadabra"))
    assertEquals(1, vowelCount("test"))
    assertEquals(3, vowelCount("example"))
  }
}