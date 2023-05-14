package com.artemas.codewars.fundamentals.kyu7

fun boredom(staff: Array<Person>): String {
    val departmentBoredomValue = mapOf(
        "accounts" to 1,
        "finance" to 2,
        "canteen" to 10,
        "regulation" to 3,
        "trading" to 6,
        "change" to 6,
        "IS" to 8,
        "retail" to 5,
        "cleaning" to 4,
        "pissing about" to 25
    )

    val cumulativeScore = staff.map { departmentBoredomValue[it.department]!! }.sum()

    if (cumulativeScore <= 80) return "kill me now"
    if (cumulativeScore in 81..99) return "i can handle this" else return "party time!!"
}
