package com.artemas.codewars.fundamentals.kyu6

fun decode(str: String): Int {
    if (str.isEmpty()) {
        return 0
    }

    val numeralNumbers = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var prevValue = 0

    for (i in str.length - 1 downTo 0) {
        val currentValue = numeralNumbers[str[i]] ?: 0

        if (currentValue >= prevValue) {
            result += currentValue
        } else {
            result -= currentValue
        }

        prevValue = currentValue
    }

    return result
}
