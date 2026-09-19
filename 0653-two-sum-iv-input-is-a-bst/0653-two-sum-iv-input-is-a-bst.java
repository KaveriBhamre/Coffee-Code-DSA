/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return postOrder(root, k, set);
    }

    private boolean postOrder(TreeNode root, int k, Set<Integer> set) {
        if(root == null) return false;
        int need = k - root.val;
        if(set.contains(need)) return true;
        set.add(root.val);
        return postOrder(root.left, k, set) || postOrder(root.right, k, set);
    }
}