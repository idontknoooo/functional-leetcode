/**
 * Scala Version: 2.13.7
 */

/**
 * reduceLeft, foldLeft, pattern matching anonymous function
 */
object Solution {
  def twoCitySchedCost(costs: Array[Array[Int]]): Int = {
    return costs.sortBy(_.reduceLeft(_ - _)).foldLeft((0, 0)) { case ((ans, cnt), cost) => if (cnt < costs.length / 2) (ans + cost(0), cnt + 1) else (ans + cost(1), cnt + 1) }._1
  }
}

/**
 * range, map, sum
 */
object Solution {
  def twoCitySchedCost(costs: Array[Array[Int]]): Int = {
    val half = costs.length / 2
    val a = costs.sortBy(_.reduceLeft(_ - _))
    (0 until half).map(i => a(i)(0) + a(half + i)(1)).sum
  }
}