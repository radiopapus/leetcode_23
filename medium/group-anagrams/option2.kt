class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableListOf<MutableList<String>>()
        val map = mutableMapOf<String, MutableList<String>>()

        for (s in strs) {
            val charArray = s.toCharArray()
            charArray.sort()
            map[String(charArray)]?.add(s) ?: map.put(String(charArray), mutableListOf(s))
        }

        for (kv in map) {
            result.add(kv.value)
        }

        return result
    }
}