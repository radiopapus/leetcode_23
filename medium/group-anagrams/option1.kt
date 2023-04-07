class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length !== t.length) return false

        val letters = IntArray(26) {0}
        for (i in s.indices) {
            letters[s[i] - 'a']++
            letters[t[i] - 'a']--
        }
        return letters.all {it == 0}
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableListOf<MutableList<String>>()
        val shouldSkip = mutableListOf<String>()

        for (i in strs.indices) {
            val group = mutableListOf<String>()
            val one = strs[i]
            group.add(one)

            if (one in shouldSkip) continue

            for (k in i+1 until strs.size) {
                val another = strs[k]
                if (isAnagram(one, another)) {
                    group.add(another)
                    shouldSkip.add(another)
                }
            }

            if (!group.isEmpty()) {
                result.add(group)
            }
        }

        return result.map { it.toList() }.toList()
    }
}