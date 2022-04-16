package solutions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Array {
    @Test
    fun `rotate array`() {
        val n = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val k = 3
        val expectedArray = intArrayOf(5, 6, 7, 1, 2, 3, 4)
        ArrayTasks.rotate(n, k)
        Assertions.assertArrayEquals(expectedArray, n)
    }

    @Test
    fun `rotate array 2`() {
        val n = intArrayOf(-1)
        val k = 2
        val expectedArray = intArrayOf(-1)
        ArrayTasks.rotate(n, k)
        Assertions.assertArrayEquals(expectedArray, n)
    }

    @Test
    fun `remove duplicates`() {
        val n = intArrayOf(1, 1, 2)
        val k = 2
        val expectedArray = intArrayOf(1, 2, 2)
        Assertions.assertEquals(k, ArrayTasks.removeDuplicates(n))
        Assertions.assertArrayEquals(expectedArray, n)
    }

    @Test
    fun `remove duplicates 2`() {
        val n = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val k = 5
        val expectedArray = intArrayOf(0, 1, 2, 3, 4, 2, 2, 3, 3, 4)
        Assertions.assertEquals(k, ArrayTasks.removeDuplicates(n))
        Assertions.assertArrayEquals(expectedArray, n)
    }

    @Test
    fun `contains duplicates`() {
        val n = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        Assertions.assertTrue(
            ArrayTasks.containsDuplicate(n)
        )
    }
}
