/**
 * Scala Version: 2.13.7
 */

/**
 * one-liner recursion
 *
 * @tailrec is not applied here, you will get an error if @tailrec is added between line 9 & 10
 */
object Solution {
  def fib(n: Int): Int = {
    return if (n == 0) 0 else if (n == 1) 1 else fib(n - 2) + fib(n - 1)
  }
}

/**
 * tail recursion optimization with @tailrec
 */

import scala.annotation.tailrec

object Solution {
  def fib(n: Int): Int = {
    @tailrec
    def tailFib(n: Int, a: Int, b: Int): Int = {
      return if (n == 0) a else tailFib(n - 1, b, a + b)
    }

    return tailFib(n, 0, 1)
  }
}