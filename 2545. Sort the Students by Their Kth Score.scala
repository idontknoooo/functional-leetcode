/**
 * Scala Version: 2.13.7
 */

/**
 * sortBy, sortWith
 */
object Solution {
    def sortTheStudents(score: Array[Array[Int]], k: Int): Array[Array[Int]] = {
        score.sortWith((a, b) => a(k) > b(k))
        // score.sortBy(a => a(k)).reverse
    }
}