class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val cnt = IntArray(26)

        for(i in s.indices) {
            cnt[s[i] - 'a']++
            cnt[t[i] - 'a']--
        }

        return cnt.all{ it == 0 }
    }
}
