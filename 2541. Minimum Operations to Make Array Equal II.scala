/**
 * Scala Version: 2.13.7
 */

/**
 * pipe, abs, foldLeft, sameElements, zip
 */
import scala.util.chaining._
object Solution {
  def minOperations(nums1: Array[Int], nums2: Array[Int], k: Int): Long = 
    if (k == 0) 
        if (nums1 sameElements nums2) 0 else - 1
    else 
      nums1.zip(nums2).foldLeft(0L, 0) { 
        case ((ops, balance), (n1, n2)) => if ((n1 - n2) % k != 0) return -1; (ops + (n1 - n2).abs/k, balance + (n1-n2) / k)
      }.pipe {
        case (ops, balance) => if (balance == 0) ops / 2 else -1
      }
}