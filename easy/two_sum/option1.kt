// https://leetcode.com/problems/two-sum/
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)

        for (idx1 in nums.indices) {
            for (idx2 in nums.indices) {
                if (idx1 == idx2) continue
                if (target == nums[idx1] + nums[idx2]) {
                    return intArrayOf(idx1, idx2)
                }
            }
        }
        return result
    }
}
