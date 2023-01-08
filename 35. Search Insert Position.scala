/***
 * Scala Version: 2.13.7
 */

/**
 * linear search on index with `indexWhere`
 */
object Solution0 {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    return (nums :+ Int.MaxValue).indexWhere(_ >= target)
  }
}

/**
 * Binary searching
 */
object Solution1 {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    import scala.collection.Searching._
    nums.search(target).insertionPoint
  }
}
