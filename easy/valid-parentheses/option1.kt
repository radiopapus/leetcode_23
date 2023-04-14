class Solution {

    fun isValid(s: String): Boolean {
        // if (s.length % 2 != 0) return false

        val map = mutableMapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )

        val stack = ArrayDeque<Char>()

        for (c in s) {
            if (map.containsKey(c)) {
                stack.add(c)
                continue
            }

            var openBracket: Char? = null
            try {
                openBracket = stack.removeLast() // pop open bracket
            } catch (e: Exception) {
                ;
            }
            if (c == map[openBracket]) {
                continue
            } else {
                return false
            }
        }

        return stack.isEmpty()
    }
}