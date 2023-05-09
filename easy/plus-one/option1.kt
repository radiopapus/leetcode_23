package easy.`plus-one`

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val ans = mutableListOf<Int>()
        var sum = 0
        var r = 0
        var n = 1
        for (idx in digits.size- 1 downTo 0) {
            val d = digits[idx]
            sum = d + n + r
            if (sum >= 10) {
                ans.add(0, sum - 10)
                r = 1
            } else {
                ans.add(0,sum)
                r = 0
            }
            n = 0
        }

        if (r > 0) ans.add(0,r)

        return ans.toIntArray()
    }
}