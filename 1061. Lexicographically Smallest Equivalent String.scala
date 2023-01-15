/**
 * Scala Version: 2.13.7
 */

/**
 * Range.toArray, class, Union Find, IndexedSeq.foreach,
 * ascii_offset(int) => char: 'a' + ascii_offset
 * char => ascii_offset(int): lowercase_char - 'a'
 * ascii(int) => char: 97.toChar
 * char => ascii(int): 'a'.toInt
 */
class UF(size: Int) {
  private var n = size
  private var p = (0 until n).toArray

  def union(a: Int, b: Int): Boolean = {
    var (pa, pb) = (find(a), find(b))
    if (pa != pb) {
      if (pa < pb) p(pb) = pa else p(pa) = pb;
      true
    } else false
  }

  def find(a: Int): Int = {
    p(a) = if (a != this.p(a)) this.find(this.p(a)) else this.p(a)
    p(a)
  }
}

object Solution {
  def smallestEquivalentString(s1: String, s2: String, baseStr: String): String = {
    var uf = new UF(26)
    s1.zip(s2).foreach(c => uf.union(c._1 - 'a', c._2 - 'a'))
    baseStr.map(c => ('a' + uf.find(c - 'a')).toChar)
  }
}