package com.artemas.codewars.fundamentals.kyu7

class TheOfficeOuted {
    companion object {
        fun outed(meet: Map<String, Int>, boss: String): String {
            return if ((meet.values.sum() + meet.getOrDefault(boss, 0)) / meet.count() > 5) "Nice Work Champ!" else "Get Out Now!"
        }
    }
}
