package easy.`min-cost-climbing-stairs`


inline fun min(a: Int, b: Int): Int = if (a >= b) b else a

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var dp = IntArray(cost.size + 2) { 0 }

        for (i in cost.size - 1 downTo 0) {
            dp[i] = cost[i] + min(dp[i + 1], dp[i + 2])
        }

        return min(dp[0], dp[1])
    }
}