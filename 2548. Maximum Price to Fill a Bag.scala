/**
 * Scala Version: 2.13.7
 */

/**
 * sortBy, toDouble, division, foldLeft, pipe
 */
import scala.util.chaining._
object Solution {
    def maxPrice(items: Array[Array[Int]], capacity: Int): Double = {
        items.sortBy(x => x(0).toDouble / x(1)).reverse.foldLeft((capacity, 0d)) {case ((curCap, ans), item) => if (item(1) <= curCap) (curCap - item(1), ans + item(0)) else (0, ans + curCap.toDouble / item(1) * item(0))}.pipe {x => if (x._1 > 0) -1 else x._2}
        // Without using `pipe`
        // var ans = items.sortBy(x => x(0).toDouble / x(1)).reverse.foldLeft((capacity, 0d)) {case ((curCap, ans), item) => if (item(1) <= curCap) (curCap - item(1), ans + item(0)) else (0, ans + curCap.toDouble / item(1) * item(0))}
        // if (ans._1 > 0) -1 else ans._2 
    }
}