class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val hm = hashMapOf<Int, Int>()
        for (n in nums) {
            val count = hm.getOrDefault(n, 1)
            hm[n] = count + 1
        }

        return hm.toList().sortedByDescending{ (n, count) -> count }.take(k).map { (n, count) -> count }.toIntArray()
    }
}