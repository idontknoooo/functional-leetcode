/**
 * Scala Version: 2.13.7
 */

/**
 * one liner, same calculation is conducted twice
 */
object Solution {
  def angleClock(hour: Int, minutes: Int): Double = {
    (hour * 30 - 5.5 * minutes).abs.min(360 - (hour * 30 - 5.5 * minutes).abs)
  }
}

/**
 * convert integer to Array[Int], then foldLeft to avoid calculation (kinda overkill & fun)
 */
object Solution {
  def angleClock(hour: Int, minutes: Int): Double = {
    Array[Double]((hour * 30 - 5.5 * minutes).abs).foldLeft(360d) {case (ini, value) => (ini - value).min(value)}
  }
}