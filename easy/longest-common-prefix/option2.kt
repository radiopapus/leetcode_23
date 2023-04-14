class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var ans = mutableListOf<String>()

        if (strs.isEmpty()) return ""
        if (strs.size == 1) return strs[0]

        val shortest = strs.minBy { it.length } ?: ""
        if (strs.all { it == shortest}) return shortest

        var c = 0

        var min = 9999999;
        for (str in strs) {
            c = 0
            for (idx in shortest.indices) {
                if (str[idx] != shortest[idx]) break
                c++
            }
            if (c < min) min = c
        }

        return shortest.substring(0 until min)
    }
}

