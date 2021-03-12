#Coin Change
<https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3668/> 

You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.



##Example 1:
```bash
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
```

##Example 2:
```bash
Input: coins = [2], amount = 3
Output: -1
```

##Example 3:
```bash
Input: coins = [1], amount = 0
Output: 0
```

##Example 4:
```bash
Input: coins = [1], amount = 1
Output: 1
```

##Example 5:
```bash
Input: coins = [1], amount = 2
Output: 2
```


##Constraints:
```kotlin
1 <= coins.length <= 12
1 <= coins[i] <= 231 - 1
0 <= amount <= 104
```