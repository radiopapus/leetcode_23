class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val hm = hashMapOf<Int, Int>()
        for (n in nums) {
            hm[n]?.let {
                hm[n] = hm[n]!! + 1
            } ?: hm.set(n, 1)
        }

        return hm.toList().sortedByDescending{ it.second }.take(k).map {
            it.first
        }.toIntArray()
    }
}