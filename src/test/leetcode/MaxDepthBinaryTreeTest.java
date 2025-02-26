package test.leetcode;

import main.datastructures.TreeNode;
import main.leetcode.MaxDepthBinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthBinaryTreeTest {
    private final MaxDepthBinaryTree mdbt = new MaxDepthBinaryTree();

    @Test
    void maxDepthTest() {
        TreeNode left1 = new TreeNode(9);
        TreeNode left2 = new TreeNode(15);
        TreeNode right2 = new TreeNode(7);
        TreeNode right1 = new TreeNode(20, left2, right2);
        TreeNode root = new TreeNode(3, left1, right1);

        assertEquals(3, mdbt.maxDepth(root));
    }

    @Test
    void maxDepthEmptyTreeTest() {
        TreeNode root = new TreeNode();

        assertEquals(1, mdbt.maxDepth(root));
    }

    @Test
    void maxDepthNullTreeTest() {
        TreeNode root = null;

        assertEquals(0, mdbt.maxDepth(root));
    }
}