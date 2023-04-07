class Solution {
    fun count_chars(s: String): MutableMap<Char, Int> {
        val hm = mutableMapOf<Char, Int>()

        for (char in s) {
            hm[char]?.let { hm[char] = it + 1 } ?: hm.set(char, 1)
        }
        return hm
    }

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val hm_s = count_chars(s)
        val hm_t = count_chars(t)

        for (char in s) {
            if (hm_s[char] != hm_t[char]) return false
        }

        return true
    }
}