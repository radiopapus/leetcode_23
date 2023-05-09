package hard.trapping_rain_water

import kotlin.math.min

class Solution {
    fun trap(height: IntArray): Int {
        val left = IntArray(height.size) { 0 }
        val right = IntArray(height.size) { 0 }
        var res = 0

        left[0] = height[0]

        for (idx in 1 until height.size) {
            if (height[idx] > left[idx - 1]) {
                left[idx] = height[idx]
            } else {
                left[idx] = left[idx - 1]
            }
        }

        right[height.lastIndex] = height[height.lastIndex]

        for (idx in height.size - 2 downTo 0) {
            if (height[idx] > right[idx + 1]) {
                right[idx] = height[idx]
            } else {
                right[idx] = right[idx + 1]
            }
        }

        for (idx in 1 until height.size - 1) {
            val minOfMax = min(left[idx - 1], right[idx+1])
            if (minOfMax >= height[idx]) res += minOfMax - height[idx]
        }

        return res
    }
}