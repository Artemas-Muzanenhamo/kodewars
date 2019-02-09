package com.artemas.codewars.fundamentals.functional

class Flatmapping {
    companion object {
        fun sumSubLists(listOfNumbers:List<List<Int>>): Int = listOfNumbers.flatten().sum()
    }
}