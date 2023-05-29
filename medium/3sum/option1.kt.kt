class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var result = mutableSetOf<List<Int>>()

        nums.sort()

        for (i in 0..nums.size - 2) {
            val target = nums[i]
            var left = i + 1
            var right = nums.lastIndex

            while (left < right) {
                val sum = nums[left] + nums[right] + target

                if (sum == 0) result.add(listOf(target, nums[left], nums[right]))
                if (sum  > 0) right -= 1 else left += 1
            }
        }

        return result.toList()
    }
}