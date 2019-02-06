package com.artemas.codewars.fundamentals.kyu8

import org.junit.Assert.assertEquals
import org.junit.Test

class GrasshopperSummationTest {
  @Test
  fun test1() {
    assertEquals(1, GrasshopperSummation.summation(1))
  }
  @Test
  fun test2() {
    assertEquals(36, GrasshopperSummation.summation(8))
  }
}