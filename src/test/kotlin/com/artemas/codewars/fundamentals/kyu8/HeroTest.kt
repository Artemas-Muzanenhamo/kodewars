package com.artemas.codewars.fundamentals.kyu8

import com.artemas.codewars.fundamentals.kyu8.Hero.Companion.hero
import kotlin.test.assertEquals
import org.junit.Test

class HeroTest {
  @Test
  fun testFixed() {
    assertEquals(true, hero(10, 5))
    assertEquals(false, hero(7, 4))
    assertEquals(false, hero(4, 5))
    assertEquals(true , hero(100, 40))
    assertEquals(false, hero(1500, 751))
    assertEquals(false, hero(0, 1))
  }
}