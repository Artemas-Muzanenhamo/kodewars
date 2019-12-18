package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CenturyTest {

  @Test
  fun testFixed() {
    assertEquals(18, century(1705));
    assertEquals(19, century(1900));
    assertEquals(17, century(1601));
    assertEquals(20, century(2000));
    assertEquals(1,  century(89));
  }
}