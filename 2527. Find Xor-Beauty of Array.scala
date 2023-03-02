/**
 * Scala Version: 2.13.7
 */

/**
 * reduce
 */
object Solution {
    def xorBeauty(nums: Array[Int]): Int = {
      nums.reduce(_ ^ _)
    }
}