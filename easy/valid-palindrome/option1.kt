package easy.`valid-palindrome`

class Solution {
    fun sanitize(s: String): String {
        val result = StringBuilder()
        val result2 = s.lowercase().filter{ it in 'a'..'z' || it in '0'..'9' }
        for (ch in s.lowercase()) {
            if (ch in 'a'..'z' || ch in '0'..'9') {
                result.append(ch)
            }
        }
        return result.toString()
    }

    fun isPalindrome(s: String): Boolean {
        val sanitizedString = sanitize(s)
        return sanitizedString == sanitizedString.reversed()
    }
}