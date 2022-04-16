package solutions

object ArrayTasks {
    fun rotate(nums: IntArray, k: Int) {
        val shift = k % nums.size
        var right = nums.size - shift
        var left = 0
        val tempArray = nums.copyOf()

        for (index in nums.indices) {
            if (right < nums.size) {
                nums[index] = tempArray[right]
                right++
            } else {
                nums[index] = tempArray[left]
                left++
            }
        }
    }

    fun removeDuplicates(nums: IntArray): Int {
        var unique = 1
        var current = nums[0]

        for (index in nums.indices) {
            if (nums[index] > current) {
                current = nums[index]
                nums[unique] = nums[index]
                unique++
            }
        }
        return unique
    }

    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.distinct().size != nums.size
    }

    fun singleNumber(nums: IntArray): Int {
        val numMap = hashMapOf<Int, Int>()

        for (num in nums) {
            if (numMap[num] != null) {
                numMap[num] = numMap[num]!! + 1
            } else {
                numMap[num] = 1
            }
        }
        return numMap.filterValues { it == 1 }.map { (k) -> k }[0]
    }
}
