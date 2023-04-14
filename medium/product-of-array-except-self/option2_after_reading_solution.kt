class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val a = IntArray(nums.size) { 1 }
        var p = 1

        for (i in 0 until nums.size) {
            a[i] = p
            p = p * nums[i]
        }

        p = 1
        for (k in nums.size - 1 downTo 0) {
            a[k] = a[k] * p
            p = p * nums[k]
        }

        return a
    }
}