package com.artemas.codewars.fundamentals.kyu6

fun spinWords(sentence: String): String {
    return sentence.split(" ")
        .map { if (it.length >= 5) return@map it.reversed() else return@map it }.joinToString(" ")
}
