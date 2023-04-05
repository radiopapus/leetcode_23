// https://leetcode.com/problems/palindrome-number
class Solution {
    fun isPalindrome(x: Int): Boolean {
        val orig = x.toString()
        return orig == orig.reversed()
    }
}