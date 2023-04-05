class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val s = nums.toSet()
        for (idx in s.indices) {
            nums[idx] = s.elementAt(idx)
        }
        return s.size
    }
}