package test.leetcode;

import main.datastructures.TreeNode;
import main.leetcode.LeafSimilarTrees;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarTreesTest {
    private final LeafSimilarTrees lst = new LeafSimilarTrees();

    @Test
    void leafSimilarMatchTest() {
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(200);
        TreeNode root1 = new TreeNode(1, left1, right1);
        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(200);
        TreeNode root2 = new TreeNode(1, left2, right2);
        assertTrue(lst.leafSimilar(root1, root2));
    }

    @Test
    void leafSimilarMismatchTest() {
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(20);
        TreeNode root1 = new TreeNode(1, left1, right1);
        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(200);
        TreeNode root2 = new TreeNode(1, left2, right2);
        assertFalse(lst.leafSimilar(root1, root2));
    }

    @Test
    void leafSimilarSwappedNodesTest() {
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(20);
        TreeNode root1 = new TreeNode(1, left1, right1);
        TreeNode left2 = new TreeNode(20);
        TreeNode right2 = new TreeNode(2);
        TreeNode root2 = new TreeNode(1, left2, right2);
        assertFalse(lst.leafSimilar(root1, root2));
    }
}