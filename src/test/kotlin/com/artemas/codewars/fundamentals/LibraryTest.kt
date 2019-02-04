package com.artemas.codewars.fundamentals

import org.junit.Test
import kotlin.test.assertTrue

class LibraryTest {
    @Test
    fun testSomeLibraryMethod() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }
}
