package com.artemas.codewars.fundamentals.kyu7

fun vowelCount(str : String) : Int {
  return str.count { it in "aeiou" }
}
