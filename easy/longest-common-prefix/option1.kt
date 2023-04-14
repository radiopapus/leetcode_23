class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var res = ""
        var ans = mutableListOf<String>()
        var prev = 0
        var count = 0

        if (strs.isEmpty()) return ""
        if (strs.size == 1) return strs[0]

        val shortest = strs.minBy { it.length } ?: ""
        if (strs.all { it == shortest}) return shortest

        for (str in strs) {
            res = ""
            for (idx in shortest.indices) {
                if (str[idx] == shortest[idx]) {
                    res += str[idx]
                } else {
                    ans.add(res)
                    break
                }
            }
            if (!res.isEmpty()) ans.add(res)
        }

        return ans.minBy { it.length } ?: ""
    }
}