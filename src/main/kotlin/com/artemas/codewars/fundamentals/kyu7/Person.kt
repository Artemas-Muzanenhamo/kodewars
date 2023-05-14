package com.artemas.codewars.fundamentals.kyu7

data class Person(
    val name: String?, // name of the staff member
    val department: String? // department they work in


) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun toString(): String {
        return super.toString()
    }
}
