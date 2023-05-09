package easy.`happy-number`

class Solution {
    val mm = mutableMapOf<Int, Int>()

    fun isHappy(n: Int): Boolean {

        val asString = n.toString()
        var acc = 0

        for (c in asString) {
            val n = Integer.parseInt(c.toString())
            acc += n*n
        }

        mm[acc]?.let { return false } ?: mm.set(acc, acc)

        return if (acc == 1) true else isHappy(acc)
    }
}