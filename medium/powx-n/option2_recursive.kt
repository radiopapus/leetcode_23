package medium.`powx-n`

class Solution {
    fun myPow(x: Double, n: Int): Double {

        if (n == 0 || x == 1.0) return 1.0
        if (x == -1.0) {
            return if (n % 2 == 0) 1.0 else -1.0
        }
        if (x == 0.0 || n == -Int.MIN_VALUE) return 0.0

        val nn = if (n < 0) n * (-1) else n // abs

        val ans = if (nn % 2 == 0) {
            val square = myPow(x, nn / 2)
            square * square
        } else {
            x * myPow(x, nn - 1)
        }

        return if (n > 0) ans else (1.0 / ans)
    }
}