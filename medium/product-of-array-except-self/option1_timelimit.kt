// timelimit exception case
// [1,1,1,1,-1,1,5,1,-1,-1,-1,1,-1,1,-3,1,1,1,1,1,1,1,-1,1,-1,1,1,5,-1,1,-1,1,1,3,-1,-5,-1,1,-1,1,-1,-3,1,2,-1,1,-1,1,-1,1,1,1,1,1,-1,-1,-1,-3,-1,-1,4,-1,1,-1,1,-1,-1,-1,-1,3,1,4,-5,-1,1,1,1,1,1,-4,1,1,-3,-1,-1,1,3,-1,1,-2,1,-1,1,1,1,-1,1,1,1,-1]

class Solution {

    fun productExceptSelf(nums: IntArray): IntArray {
        var product = 1

        var zeroCounter = 0
        var zeroCounterIdx = 0

        for (n in nums.indices) {
            if (nums[n] == 0) {
                zeroCounter++
                zeroCounterIdx = n
                continue
            }
            product = product * nums[n]
        }

        if (zeroCounter == 1) {
            var r =  IntArray(nums.size) { 0 }
            r[zeroCounterIdx] = product
            return r
        }

        if (zeroCounter > 1) {
            return IntArray(nums.size) { 0 }
        }

        var result = mutableListOf<Int>()

        for (n in nums.indices) {
            var k = product
            var except_product = 0

            while (k != 0) {
                if (nums[n] > 0 && product > 0) {
                    k = k - nums[n]
                } else if (nums[n] < 0 && product < 0) {
                    k = k + nums[n] * (-1)
                } else if (nums[n] < 0 && product > 0) {
                    k = k + nums[n]
                } else {
                    k = k + nums[n]
                }
                except_product++
            }
            if (product > 0 && nums[n] > 0) {
                result.add(except_product)
            } else if (product < 0 && nums[n] > 0) {
                result.add(except_product * -1 )
            } else if (product < 0 && nums[n] < 0) {
                result.add(except_product )
            } else {
                result.add(except_product * -1)
            }
        }

        return result.toIntArray()
    }
}