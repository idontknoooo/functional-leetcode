/**
 * Scala Version: 2.13.7
 */

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */

/**
 * dfs, recursion
 */
object Solution {
  def sumNumbers(root: TreeNode): Int = {
    def dfs(node: TreeNode, cur: Int): Int = {
      return if (node != null && node.left == null && node.right == null) cur * 10 + node.value else (if (node.left != null) dfs(node.left, cur * 10 + node.value) else 0) + (if (node.right != null) dfs(node.right, cur * 10 + node.value) else 0)
    }
    return dfs(root, cur = 0)
  }
}