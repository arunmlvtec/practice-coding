package main.leetcode;

import main.datastructures.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * 872. Leaf-Similar Trees
 * <p>
 * Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value
 * sequence.
 * <p>
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 * Example 1:
 * Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
 * Output: true
 * <p>
 * Example 2:
 * Input: root1 = [1,2,3], root2 = [1,3,2]
 * Output: false
 *<p>
 * Constraints:
 * The number of nodes in each tree will be in the range [1, 200].
 * Both of the given trees will have values in the range [0, 200].
 * */

public class LeafSimilarTrees {

    private List<Integer> getLeafNodes(TreeNode root) {
        List<Integer> leafNodes = new LinkedList<>();
        getLeafNodes(root, leafNodes);
        return leafNodes;
    }

    private void getLeafNodes(TreeNode node, List<Integer> leafNodes) {
        if (node == null) {
            return;
        }

        getLeafNodes(node.getLeft(), leafNodes);
        getLeafNodes(node.getRight(), leafNodes);

        if (node.getLeft() == null && node.getRight() == null) {
            leafNodes.add(node.getVal());
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafNodesForRoot1 = getLeafNodes(root1);
        List<Integer> leafNodesForRoot2 = getLeafNodes(root2);
        if (leafNodesForRoot1.size() != leafNodesForRoot2.size()) {
            return false;
        }
        for (int i = 0; i < leafNodesForRoot1.size(); i++) {
            if (!Objects.equals(leafNodesForRoot1.get(i), leafNodesForRoot2.get(i))) {
                return false;
            }
        }
        return true;
    }
}