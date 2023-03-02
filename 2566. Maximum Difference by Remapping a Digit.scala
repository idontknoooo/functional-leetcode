/**
 * Scala Version: 2.13.7
 */

/**
 * find, option.getOrElse, lambda, pipe, replace
 */
import scala.util.chaining._
object Solution {
    def minMaxDifference(num: Int): Int = {
        num.toString.pipe {a => a.replace(a.find(_ != '9').getOrElse('9'), '9').toInt - a.replace(a(0), '0').toInt }
    }
}