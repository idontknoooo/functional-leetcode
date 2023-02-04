/**
 * Scala Version: 2.13.7
 */

/**
 * foldLeft, indexWhere, pattern match
 */
object Solution {
  def findJudge(n: Int, trust: Array[Array[Int]]): Int = {
    trust.foldLeft(new Array[Int](n)) {
      case (arr, pair) => arr(pair(1) - 1) += (if (pair(0) != pair(1)) 1 else 0); arr(pair(0) - 1) -= 2; arr
    }.indexWhere(x => x == n - 1) match {
      case -1 => -1
      case x => x + 1
    }
  }
}
