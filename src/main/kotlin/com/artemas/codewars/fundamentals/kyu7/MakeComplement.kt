package com.artemas.codewars.fundamentals.kyu7

fun makeComplement(dna : String) : String {
    // C -> G
    // G -> C
    // T -> A
    // A -> T
    val escapeAsAndCs = Regex("([TC])+")
    val replacedDna = dna.replace(escapeAsAndCs, "T")
    print(replacedDna)
    return replacedDna
}