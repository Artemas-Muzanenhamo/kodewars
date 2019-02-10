package com.artemas.codewars.fundamentals.kyu7

class RotationsMain {
    companion object {
        fun containAllRots(strng: String, arr: ArrayList<String>): Boolean {
            return arr.containsAll(List(strng.length) { (strng.drop(it) + strng.take(it)) })
        }
    }
}