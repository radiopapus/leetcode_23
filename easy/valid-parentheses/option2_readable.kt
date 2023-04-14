class Solution {

    fun isValid(s: String): Boolean {
        val brackets = mutableMapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )

        val stack = Stack<Char>()

        for (c in s) {
            if (c in brackets.keys) {
                stack.push(c)
                continue
            }

            if (stack.isEmpty()) return false

            val openBracket = stack.pop() // pop open bracket
            if (c != brackets[openBracket]) return false
        }

        return stack.isEmpty()
    }
}