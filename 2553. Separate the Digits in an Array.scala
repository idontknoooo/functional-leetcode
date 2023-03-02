/**
 * Scala Version: 2.13.7
 */

/**
 * flatMap, map, toString, split
 */
import scala.collection.mutable._
object Solution {
    def separateDigits(nums: Array[Int]): Array[Int] = {
        nums.flatMap(_.toString.split("").map{_.toInt})
        // nums.flatMap(num => {num.toString.split("").map{_.toInt}})
        // nums.flatMap(num => {num.toString.split("").map{c => c.toInt}})
    }
}