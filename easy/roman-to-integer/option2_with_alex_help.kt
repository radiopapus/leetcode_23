class Solution {g
    fun romanToInt(s: String): Int {
        val map = mapOf(
            'M' to 1000,
            'D' to 500,
            'C' to 100,
            'L' to 50,
            'X' to 10,
            'V' to 5,
            'I' to 1
        )

        var ans = 0
        var prev = 0
        for (i in s.length - 1 downTo 0) {
            val current = map[s[i]]!!

            if (current >= prev) {
                ans += current
            } else {
                ans -= current
            }
            prev = current
        }

        return ans
    }
}


var s = String