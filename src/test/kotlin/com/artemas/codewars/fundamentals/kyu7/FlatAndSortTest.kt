package com.artemas.codewars.fundamentals.kyu7

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test


class FlatAndSortTest {
    @Test
    fun `Should return arrays flattened and sorted`() {
        assertArrayEquals(intArrayOf(), FlatAndSort.flattenAndSort(arrayOf(intArrayOf())))
        assertArrayEquals(intArrayOf(1), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(), intArrayOf(1))))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(3, 2, 1 ), intArrayOf(7, 9, 8), intArrayOf(6, 4, 5))))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 100 ), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(1, 3, 5) ,intArrayOf(100), intArrayOf(2, 4, 6))))
        assertArrayEquals(intArrayOf(111, 222, 333, 444, 555, 666, 777, 888, 999 ), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(111, 999), intArrayOf(222), intArrayOf(333), intArrayOf(444), intArrayOf(888), intArrayOf(777), intArrayOf(666), intArrayOf(555))))
    }
}