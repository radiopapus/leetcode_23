package medium.`two-sum-ii-input-array-is-sorted`

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1

        while (left < right) {
            val lVal = numbers[left]
            val rVal = numbers[right]

            val sum = lVal + rVal
            if (sum == target) return intArrayOf(left + 1, right + 1)

            if (sum > target) {
                right -= 1
            } else {
                left += 1
            }
        }

        return intArrayOf()
    }
}