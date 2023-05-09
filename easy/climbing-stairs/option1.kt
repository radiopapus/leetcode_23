package easy.`climbing-stairs`

class Solution {
    fun climbStairs(n: Int): Int {
        if (n <= 2) return n

        var current = 1
        var next = 2
        var ways = 0
        var k = 3
        while (k <= n) {
            ways = current + next // 3, 5
            current = next //2, 3,
            next = ways // 3, 5
            k += 1
        }
        return ways
    }
}