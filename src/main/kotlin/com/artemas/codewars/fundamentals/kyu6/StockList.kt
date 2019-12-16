package com.artemas.codewars.fundamentals.kyu6

class StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
        if (lstOfArt.isEmpty()) return ""
        val counts = lstOfArt
                .groupingBy { it.take(1) }
                .fold(0) { acc, s -> acc + s.split(" ")[1].toInt() }
        return lstOfCat.joinToString(" - ") { "($it : ${counts.getOrDefault(it, 0)})" }
    }
}