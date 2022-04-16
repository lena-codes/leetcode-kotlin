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
        var unique = 0
        val list = ArrayList<Int>()

        for(num in nums) {
            if(!list.contains(num)) {
                list.add(num)
                nums[unique] = num
                unique++
            }
        }
        return unique
    }
}
