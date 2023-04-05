// https://leetcode.com/problems/two-sum/
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)

        for (idx in 0 until nums.size) {
            for (idx2 in idx + 1 until nums.size) {
                if (target == nums[idx] + nums[idx2]) {
                    return intArrayOf(idx, idx2)
                }
            }
        }
        return result
    }
}
