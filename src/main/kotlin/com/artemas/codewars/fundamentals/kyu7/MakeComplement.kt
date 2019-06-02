package com.artemas.codewars.fundamentals.kyu7

fun makeComplement(dna : String) : String {
    // C -> G
    // T -> A
    dna.filter { letter -> letter == 'A' }
    return dna.replace("A", "T", true)
            .replace("T", "A", true)
            .replace("C", "G", true)
            .replace("G", "C", true)
}