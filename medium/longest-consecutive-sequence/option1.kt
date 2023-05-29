package medium.`longest-consecutive-sequence`

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var map = hashSetOf<Int>()
        for (n in nums) map.add(n)

        var longest = 1
        for (k in nums) {
            var tmp = k
            var counter = 1
            val sequenceStarter = !map.contains(k - 1)
            if (sequenceStarter) {
                while (map.contains(tmp + 1)) {
                    counter += 1
                    tmp += 1
                }
                longest = maxOf(counter, longest)
            }
        }

        return longest
    }
}