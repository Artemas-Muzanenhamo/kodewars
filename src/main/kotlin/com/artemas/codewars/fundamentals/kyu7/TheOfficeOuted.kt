package com.artemas.codewars.fundamentals.kyu7

class TheOfficeOuted {
    companion object {
        fun outed(meet: Map<String, Int>, boss: String): String {
            val totalScore = meet.values.sum()
            val totalPeopleInTheRoom = meet.entries.count()
            val happinessRating = totalScore / totalPeopleInTheRoom

            return if (happinessRating <= 5) "Get Out Now!" else "Nice Work Champ!"
        }
    }
}
