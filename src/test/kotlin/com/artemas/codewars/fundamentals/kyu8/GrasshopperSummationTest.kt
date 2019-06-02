package com.artemas.codewars.fundamentals.kyu8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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