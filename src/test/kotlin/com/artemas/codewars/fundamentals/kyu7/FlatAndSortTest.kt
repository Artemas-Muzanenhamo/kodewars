package com.artemas.codewars.fundamentals.kyu7

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import java.util.*
import java.util.stream.IntStream.generate
import kotlin.math.min


class FlatAndSortTest {
    @Test
    fun `Should return arrays flattened and sorted`() {
        assertArrayEquals(intArrayOf(), FlatAndSort.flattenAndSort(arrayOf(intArrayOf())))
        assertArrayEquals(intArrayOf(1), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(), intArrayOf(1))))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(3, 2, 1 ), intArrayOf(7, 9, 8), intArrayOf(6, 4, 5))))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 100 ), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(1, 3, 5) ,intArrayOf(100), intArrayOf(2, 4, 6))))
        assertArrayEquals(intArrayOf(111, 222, 333, 444, 555, 666, 777, 888, 999 ), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(111, 999), intArrayOf(222), intArrayOf(333), intArrayOf(444), intArrayOf(888), intArrayOf(777), intArrayOf(666), intArrayOf(555))))
    }

    @Test
    fun exampleTest() {
        assertArrayEquals(intArrayOf(), FlatAndSort.flattenAndSort(arrayOf<IntArray>()))
        assertArrayEquals(intArrayOf(1), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(), intArrayOf(1))))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(3, 2, 1), intArrayOf(7, 9, 8), intArrayOf(6, 4, 5))))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 100), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(1, 3, 5), intArrayOf(100), intArrayOf(2, 4, 6))))
        assertArrayEquals(intArrayOf(111, 222, 333, 444, 555, 666, 777, 888, 999), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(111, 999), intArrayOf(222), intArrayOf(333), intArrayOf(444), intArrayOf(888), intArrayOf(777), intArrayOf(666), intArrayOf(555))))
    }


    @Test
    fun basicTest() {
        assertArrayEquals(intArrayOf(0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(9, 7, 5, 3, 1), intArrayOf(8, 6, 4, 2, 0), intArrayOf(), intArrayOf(1))))
        assertArrayEquals(intArrayOf(-2, -1, -1, 0, 1, 1, 1, 2, 3), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(1), intArrayOf(), intArrayOf(1), intArrayOf(), intArrayOf(), intArrayOf(-1, -2, -1), intArrayOf(0, 3), intArrayOf(1), intArrayOf(2))))
        assertArrayEquals(intArrayOf(64, 100, 202, 303, 503, 504, 2500, 4096), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(), intArrayOf(), intArrayOf(64), intArrayOf(), intArrayOf(504, 503), intArrayOf(4096), intArrayOf(), intArrayOf(303), intArrayOf(202), intArrayOf(2500), intArrayOf(), intArrayOf(100))))
        assertArrayEquals(intArrayOf(0, 18, 27, 35, 46, 54, 63, 72, 81, 90), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(90, 81, 72), intArrayOf(63, 54, 35), intArrayOf(), intArrayOf(46), intArrayOf(27, 18, 0))))
        assertArrayEquals(intArrayOf(-1, -1, -1, 0, 0, 0, 1, 1, 1), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(1), intArrayOf(), intArrayOf(1), intArrayOf(1), intArrayOf(0), intArrayOf(-1), intArrayOf(), intArrayOf(0), intArrayOf(-1), intArrayOf(0), intArrayOf(-1))))
        assertArrayEquals(intArrayOf(-9, -8, -7, -6, -5, -4, -3, -2, -1), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(-9, -8, -7, -6, -5, -4, -3, -2, -1))))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), FlatAndSort.flattenAndSort(arrayOf(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1))))
    }

    private val rnd: Random = Random()
    @Test
    fun randomTests() {
        for (i in 0..63) {
            val array = generate { rnd.nextInt(20000) - 10000 }.limit(rnd.nextInt(256).toLong()).toArray()
            val chopped = chop(array)
            Arrays.sort(array)
            assertArrayEquals(array, FlatAndSort.flattenAndSort(chopped))
        }
    }

    private fun chop(array: IntArray): Array<IntArray> {
        val chops: MutableList<IntArray> = ArrayList()
        var b = 0
        var e: Int = rnd.nextInt(array.size + 1)
        while (b < array.size) {
            val part = array.copyOfRange(b, min(e, array.size))
            chops.add(part)
            b = e
            e += rnd.nextInt(array.size) + 1
        }
        return chops.toTypedArray()
    }
}