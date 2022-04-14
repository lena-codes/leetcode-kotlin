package solutions

object ArrayTasks {
    fun rotate(nums: IntArray, k: Int): Unit {
        val shift = k % nums.size
        var right = nums.size - shift
        var left = 0
        val tempArray = nums.copyOf()

        for(index in nums.indices) {
            if(right < nums.size) {
                nums[index] = tempArray[right];
                right++
            } else {
                nums[index] = tempArray[left]
                left++
            }
        }
    }
}
