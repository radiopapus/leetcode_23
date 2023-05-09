package medium.`powx-n`

class Solution {
    fun myPow(x: Double, n: Int): Double {
        if (n == 0 || x == 1.0) return 1.0
        if (x == -1.0) {
            return if (n % 2 == 0) 1.0 else -1.0
        }
        if (x == 0.0 || n == -Int.MIN_VALUE) return 0.0

        var nn = if (n < 0) n * (-1) else n // abs

        var ans = 1.0
        var square = x

        while (nn != 0 ) {
            if (nn % 2 == 0) {
                square = square * square
                nn = nn / 2
            } else {
                ans = ans * square
                nn = nn - 1
            }
        }

        return if (n > 0) ans else (1.0 / ans)
    }
}