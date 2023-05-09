package hard.trapping_rain_water

import kotlin.math.max
import java.util.LinkedList;

class Solution {
    fun trap(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex;
        var res = 0
        var lmax = 0
        var rmax = 0

        while (left <= right) {
            if (lmax <= rmax) {
                res += if (lmax - height[left] > 0) lmax - height[left] else 0
                lmax = max(height[left], lmax)
                left += 1
            } else {
                res += if (rmax - height[right] > 0) rmax - height[right] else 0
                rmax = max(height[right], rmax)
                right -= 1
            }
        }

        return res
    }
}