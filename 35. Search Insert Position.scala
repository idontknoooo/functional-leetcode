/**
 * Scala Version: 2.13.7
 */

/**
 * linear search on index with `indexWhere`
 */
object Solution {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    return (nums :+ Int.MaxValue).indexWhere(_ >= target)
  }
}

/**
 * binary searching
 */
object Solution {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    import scala.collection.Searching._
    nums.search(target).insertionPoint
  }
}
