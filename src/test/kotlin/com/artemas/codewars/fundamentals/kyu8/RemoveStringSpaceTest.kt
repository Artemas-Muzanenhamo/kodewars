package com.artemas.codewars.fundamentals.kyu8

import com.artemas.codewars.fundamentals.kyu8.RemoveStringSpace.Companion.noSpace
import kotlin.test.assertEquals
import org.junit.Test

class RemoveStringSpaceTest {
  @Test
  fun testFixed() {
    assertEquals("8j8mBliB8gimjB8B8jlB", noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))
    assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"))
    assertEquals("8aaaaaddddr", noSpace("8aaaaa dddd r     "))
  }
}