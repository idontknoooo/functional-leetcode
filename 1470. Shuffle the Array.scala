/**
 * Scala Version: 2.13.7
 */

/**
 * flatMap, toArray
 */
object Solution {
    def shuffle(nums: Array[Int], n: Int): Array[Int] = {
        (0 until n).toArray.flatMap(i => Array[Int](nums(i), nums(i + n)))
    }
}