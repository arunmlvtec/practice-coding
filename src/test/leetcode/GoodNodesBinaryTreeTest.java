package test.leetcode;

import main.datastructures.TreeNode;
import main.leetcode.GoodNodesBinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodNodesBinaryTreeTest {
    private final GoodNodesBinaryTree gnbt = new GoodNodesBinaryTree();

    @Test
    void goodNodesTest1() {
        TreeNode left2 = new TreeNode(3);
        TreeNode left1 = new TreeNode(1, left2, null);
        TreeNode r1r2 = new TreeNode(5);
        TreeNode r1l2 = new TreeNode(1);
        TreeNode right1 = new TreeNode(4, r1l2, r1r2);
        TreeNode root = new TreeNode(3, left1, right1);
        assertEquals(4 , gnbt.goodNodes(root));
    }

    @Test
    void goodNodesTest2() {
//        [2,null,4,10,8,null,null,4]
        TreeNode r1l2 = new TreeNode(10);
        TreeNode r2l2 = new TreeNode(4);
        TreeNode r1r2 = new TreeNode(8, r2l2, null);
        TreeNode r1 = new TreeNode(4, r1l2, r1r2);
        TreeNode root = new TreeNode(2, null, r1);
        assertEquals(4 , gnbt.goodNodes(root));
    }
}