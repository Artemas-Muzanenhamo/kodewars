package com.artemas.codewars.fundamentals.kyu8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TheFeastOfManyBeastsTest {
  @Test
  fun testFixed() {
    val theFeastOfManyBeasts = TheFeastOfManyBeasts()
    assertEquals(true, theFeastOfManyBeasts.feast("great blue heron", "garlic naan"))
    assertEquals(true, theFeastOfManyBeasts.feast("chickadee", "chocolate cake"))
    assertEquals(false, theFeastOfManyBeasts.feast("brown bear", "bear claw"))
    assertEquals(true, theFeastOfManyBeasts.feast("marmot", "mulberry tart"))
    assertEquals(true, theFeastOfManyBeasts.feast("porcupine", "pie"))
    assertEquals(false, theFeastOfManyBeasts.feast("electric eel", "lasagna"))
    assertEquals(true, theFeastOfManyBeasts.feast("slow loris", "salsas"))
    assertEquals(true, theFeastOfManyBeasts.feast("ox", "orange lox"))
    assertEquals(true, theFeastOfManyBeasts.feast("blue-footed booby", "blueberry"))
  }
}