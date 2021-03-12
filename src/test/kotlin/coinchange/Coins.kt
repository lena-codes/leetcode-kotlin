package coinchange

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Coins {
    @Test
    fun `Amount of 0 should return 0`() {
        val coins = intArrayOf(1)
        Assertions.assertEquals(0, Solution.coinChange(coins, 0))
    }

    @Test
    fun `Amount of 1 should return 1 for coin 1`() {
        val coins = intArrayOf(1)
        Assertions.assertEquals(1, Solution.coinChange(coins, 1))
    }

    @Test
    fun `Amount of 11 should return 3 for coins 1, 2 and 5`() {
        val coins = intArrayOf(1, 2, 5)
        Assertions.assertEquals(3, Solution.coinChange(coins, 11))
    }

    @Test
    fun `Amount of 6249 should return 20 for coins 186, 419, 83 and 408`() {
        val coins: IntArray = intArrayOf(186, 419, 83, 408)
        Assertions.assertEquals(20, Solution.coinChange(coins, 6249))
    }

    @Test
    fun `Amount of 100 should return 20 for coins 1, 2 and 5`() {
        val coins: IntArray = intArrayOf(1, 2, 5)
        Assertions.assertEquals(20, Solution.coinChange(coins, 100))
    }

}