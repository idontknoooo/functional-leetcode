/**
 * Scala Version: 2.13.7
 */

/**
 * scanRight, dropWhile, slice, array concatenation, map
 */
object Solution {
  def plusOne(digits: Array[Int]): Array[Int] = {
    (Array[Int](0) ++ digits).scanRight((1, 0)) {case (digit, (carry, cur)) => (if (digit + carry > 9) (1, digit + carry - 10) else (0, digit + carry))}.map(i => i._2).slice(0, digits.length + 1).dropWhile(_ == 0)
  }
}
