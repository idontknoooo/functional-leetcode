/***
 * Scala Version: 2.13.7
 */

/**
 * Binary search with `search`
 */
object Solution0 {
  def maxIceCream(costs: Array[Int], coins: Int): Int = {
    import scala.collection.Searching._
    costs.sorted.scanLeft(0L)(_ + _).search(1L+coins).insertionPoint - 1
  }
}
/**
 * `foldLeft` with anonymous function
 */
object Solution1 {
  def maxIceCream(costs: Array[Int], coins: Int): Int = {
    costs.sorted.foldLeft((0, 0))((res, cost) => if (res._1 + cost > coins) res else (res._1 + cost, res._2 + 1))._2
  }
}
/**
 * `foldLeft` with pattern matching anonymous function
 */
object Solution2 {
  def maxIceCream(costs: Array[Int], coins: Int): Int = {
    costs.sorted.foldLeft((0, 0)) {case (res, cost) => if (res._1 + cost > coins) res else (res._1 + cost, res._2 + 1)}._2
  }
}
