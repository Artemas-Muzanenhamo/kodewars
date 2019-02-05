package com.artemas.codewars.fundamentals.kyu8

import com.artemas.codewars.fundamentals.kyu8.Opposite.Companion.opposite
import org.junit.Test
import kotlin.test.assertEquals

class OppositeTests {

  /*Very simple, given a number, find its opposite.*/

  @Test
  fun testFixed() {
    assertEquals(-1, opposite(1))
    assertEquals(0, opposite(0))
    assertEquals(25, opposite(-25))
  }
}