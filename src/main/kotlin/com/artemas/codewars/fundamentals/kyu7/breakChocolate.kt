package com.artemas.codewars.fundamentals.kyu7

fun breakChocolate(n: Int, m: Int): Int {
  if (n * m == 0) {
    return 0;
  }
  return (n * m) - 1
}