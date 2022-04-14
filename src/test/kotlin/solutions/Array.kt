package solutions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Array {
    @Test
    fun `rotate array`() {
        val n = intArrayOf(1,2,3,4,5,6,7)
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
}
