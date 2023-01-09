/**
 * Scala Version: 2.13.7
 */

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 * var value: Int = _value
 * var left: TreeNode = _left
 * var right: TreeNode = _right
 * }
 */

/**
 * one liner if..else if..else
 */
object Solution {
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    return if (p == null && q == null) true else if (p == null || q == null) false else isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && p.value == q.value
  }
}