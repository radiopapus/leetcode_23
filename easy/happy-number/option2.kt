package easy.`happy-number`

class Solution {
    val mm = HashSet<Int>()

    fun getDigits(n: Int): List<Int> {
        val l = mutableListOf<Int>()
        var nn = n
        while (nn != 0) {
            l.add(nn % 10)
            nn = nn / 10
        }
        return l.toList()
    }

    fun isHappy(n: Int): Boolean {
        var acc = 0
        val digits = getDigits(n)

        for (d in digits) {
            acc += d*d
        }

        if (acc == 1) return true

        if (mm.contains(acc)) return false else mm.add(acc)

        return isHappy(acc)
    }
}