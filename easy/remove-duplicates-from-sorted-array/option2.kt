class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var index = 1
        var value = nums[0]

        for (i in nums.indices) {
            if (nums[i] != value) {
                value = nums[i]
                nums[index] = nums[i]
                index++
            }
        }
        return index
    }
}