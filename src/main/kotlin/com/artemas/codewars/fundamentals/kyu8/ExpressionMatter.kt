package com.artemas.codewars.fundamentals.kyu8

import kotlin.math.max

class ExpressionMatter {
    companion object {
     
     fun expressionsMatter(a : Int, b : Int, c : Int) : Int {
         val firstCase = a * (b + c)
         val secondCase = a * b * c
         val thirdCase = a + b * c
         val fourthCase = (a + b) * c
         val fifthCase = (a * b) * c
         val sixthCase = a * (b * c)
         val seventhCase = a + b + c

         val numbers = listOf(firstCase, secondCase, thirdCase, fourthCase, fifthCase, sixthCase, seventhCase)
         return numbers.max()!!
     }
     
    }
}