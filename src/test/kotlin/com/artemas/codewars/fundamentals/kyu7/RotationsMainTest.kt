package com.artemas.codewars.fundamentals.kyu7

import com.artemas.codewars.fundamentals.kyu7.RotationsMain.Companion.containAllRots
import org.junit.Assert.*
import org.junit.Test

class RotationsMainTest {
  private fun testing(actual:Boolean, expected:Boolean) {
    assertEquals(expected, actual)
  }
  @Test
  fun test() {
    println("Fixed Tests containAllRots")
    var a = arrayListOf("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
    testing(containAllRots("bsjq", a), true)
    a = arrayListOf("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
    testing(containAllRots("XjYABhR", a), false)
    
  }
}
