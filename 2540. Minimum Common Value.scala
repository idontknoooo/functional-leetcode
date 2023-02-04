
/**
 * Scala Version: 2.13.7
 */

/**
 * foldLeft, toSet
 */
object Solution {
    def getCommon(nums1: Array[Int], nums2: Array[Int]): Int = {
        nums1.foldLeft((nums2.toSet, -1)){case ((st, mi), n1) => if (st.contains(n1) && (mi == -1 || n1 < mi)) (st, n1) else (st, mi)}._2
    }
}