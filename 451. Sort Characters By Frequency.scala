/**
 * Scala Version: 2.13.7
 */

/**
 * groupBy, mapValues, mkString
 */
object Solution {
  def frequencySort(s: String): String = {
    s.groupBy(identity).mapValues(_.length).toSeq.sortBy(e => (-e._2, e._1)).map(x => x._1.toString * x._2).mkString("")
  }
}