package main.leetcode;

import main.datastructures.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest
 * leaf node.
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * <p>
 *
 * Example 2:
 * Input: root = [1,null,2]
 * Output: 2
 * <p>
 * Constraints:
 * The number of nodes in the tree is in the range [0, 104].
 * -100 <= Node.val <= 100
 * */

public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }
    private int maxDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        return Math.max(
                depth,
                Math.max(
                        maxDepth(node.getLeft(), depth + 1),
                        maxDepth(node.getRight(), depth + 1))
        );
    }
}