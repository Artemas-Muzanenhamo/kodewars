package com.artemas.codewars.fundamentals.kyu7
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TheOfficeBoredomTest {
    @Test
    fun basic1() {
        assertEquals(
            "kill me now", boredom(
                arrayOf<Person>(
                    Person("tim", "change"),
                    Person("jim", "accounts"),
                    Person("randy", "canteen"),
                    Person("sandy", "change"),
                    Person("andy", "change"),
                    Person("katie", "IS"),
                    Person("laura", "change"),
                    Person("saajid", "IS"),
                    Person("alex", "trading"),
                    Person("john", "accounts"),
                    Person("mr", "finance")
                )
            )
        )
    }

    @Test
    fun basic2() {
        assertEquals(
            "i can handle this", boredom(
                arrayOf<Person>(
                    Person("tim", "IS"),
                    Person("jim", "finance"),
                    Person("randy", "pissing about"),
                    Person("sandy", "cleaning"),
                    Person("andy", "cleaning"),
                    Person("katie", "cleaning"),
                    Person("laura", "pissing about"),
                    Person("saajid", "regulation"),
                    Person("alex", "regulation"),
                    Person("john", "accounts"),
                    Person("mr", "canteen")
                )
            )
        )
    }

    @Test
    fun basic3() {
        assertEquals(
            "party time!!", boredom(
                arrayOf<Person>(
                    Person("tim", "accounts"),
                    Person("jim", "accounts"),
                    Person("randy", "pissing about"),
                    Person("sandy", "finance"),
                    Person("andy", "change"),
                    Person("katie", "IS"),
                    Person("laura", "IS"),
                    Person("saajid", "canteen"),
                    Person("alex", "pissing about"),
                    Person("john", "retail"),
                    Person("mr", "pissing about")
                )
            )
        )
    }
}
