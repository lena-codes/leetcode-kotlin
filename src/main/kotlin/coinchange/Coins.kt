package coinchange

object Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val sortedCoins: IntArray = coins.filter{it <= amount}.sorted().toIntArray()
        return findCoinAmountNeeded(0, amount, sortedCoins, sortedCoins.lastIndex)
    }

    private fun findCoinAmountNeeded(counter: Int, amount: Int, coins: IntArray, index: Int): Int {
        return when {
            amount == 0 -> counter
            amount > 0 && index >= 0 -> {
                val ggt = amount / coins[index]
                val leftAmount = amount % coins[index]
                for(i in ggt downTo 0) {
                    val result = findCoinAmountNeeded(counter + i, leftAmount, coins, index - 1)
                    if (result != -1) {
                        return result
                    }
                }
                -1
            }
            else -> -1
        }
    }
}