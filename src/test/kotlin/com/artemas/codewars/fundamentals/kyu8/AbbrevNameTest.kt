package com.artemas.codewars.fundamentals.kyu8

import com.artemas.codewars.fundamentals.kyu8.AbbrevName.Companion.abbrevName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AbbrevNameTest {

    @Test
    fun testNames() {
        assertEquals(abbrevName("Sam Harris"), "S.H")
        assertEquals(abbrevName("Patrick Feenan"), "P.F")
        assertEquals(abbrevName("Evan Cole"), "E.C")
        assertEquals(abbrevName("P Favuzzi"), "P.F")
        assertEquals(abbrevName("David Mendieta"), "D.M")
        assertEquals(abbrevName("george clooney"), "G.C")
        assertEquals(abbrevName("lDueDtAcYgkPmRUzLJ RjusYVBZvsoCqhh"), "L.R")
    }
}
