package com.artemas.codewars.fundamentals.functional

class Mapping {
    companion object {
        fun addNumbersSquared(listOfNumbers: List<Int>): Int = listOfNumbers.map { it * it }.sum()
        fun squaredNumbers(listOfNumbers: List<Int>): List<Int> = listOfNumbers.map { it * it }
        // TODO: Fix this...
//        fun mapToPerson(personString: Array<Any>): Person {
//            return personString.toList().mapTo(Person, enumValueOf(name = ))
//        }
    }
}