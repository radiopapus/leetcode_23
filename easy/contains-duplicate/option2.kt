class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        for (i in 0 until nums.size) {
            val n = nums[i]
            for (k in i+1 until nums.size) {
                if (n == nums[k]) return true
            }
        }
        return false
    }
}