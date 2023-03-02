/**
 * Scala Version: 2.13.7
 */

/**
 * foldLeft, asDigit (not toInt | char.asDigit, string.toInt), main name doesn't matter (can be anything)
 */
object Solution {
    def alternateDigitSum(n: Int): Int = {
        n.toString.foldLeft((0, true)){case ((ans, pos), cur) => if (pos) (ans + cur.asDigit, !pos) else (ans - cur.asDigit, !pos)}._1
    }

    @main
    def thisIsMain(): Unit = {
        println(alternateDigitSum(521))
    }
}