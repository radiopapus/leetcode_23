class Solution {
    fun romanToInt(s: String): Int {
        val map = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
            // 'CD' to 400,
            // 'CM' to 900
            // 'XL' to 40,
            // 'XC' to 90,
            // 'IV' to 4,
            // 'IX' to 9,
        )

        val available = arrayOf('M', 'D', 'C', 'L', 'X', 'V', 'I')
        var ans = 0
        val skip = mutableListOf<Int>()

        for (k in available) {
            for (c in 0 until s.length) {
                if (s[c] == k && c !in skip) {
                    ans += map[k]!!
                    skip.add(c)
                    if (c > 0 && (c-1) !in skip) {
                        ans -= map[s[c-1]]!!
                        skip.add(c-1)
                    }
                }
            }
        }

        return ans
    }
}
