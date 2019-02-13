package com.artemas.codewars.fundamentals.kyu8

import com.artemas.codewars.fundamentals.kyu8.Multiply.Companion.multiply
import org.junit.Test

import org.junit.Assert.assertEquals
import kotlin.test.assertEquals

internal class MultiplyTest {
	@Test
	@Throws(Exception::class)
	fun test_Associativity_Of_Multiplication() {
		for (i in 0..99) {
			val a = Math.random()
			val b = Math.random()
			val c = Math.random()
			val message = String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c)
			assertEquals(message,
					multiply(multiply(a, b), c),
					multiply(a, multiply(b, c)),
					1E-14)
		}
	}
}