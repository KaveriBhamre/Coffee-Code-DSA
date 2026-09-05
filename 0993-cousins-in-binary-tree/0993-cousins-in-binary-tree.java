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
    Map<TreeNode, TreeNode> map = new HashMap<>();

    private void buildParent(TreeNode node, TreeNode p) {
        if(node == null) return;
        map.put(node, p);
        buildParent(node.left, node);
        buildParent(node.right, node);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        buildParent(root, null);

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        TreeNode parentX = null;
        TreeNode parentY = null;

        int levelX = -1;
        int levelY = -1;

        while(!q.isEmpty()) {

            int size = q.size();

            for(int i = 0; i < size; i++) {

                TreeNode curr = q.poll();
                if(curr.val == x) {
                    parentX = map.get(curr);
                    levelX = level;
                }
                if(curr.val == y) {
                    parentY = map.get(curr);
                    levelY = level;
                }
                if(curr.left != null) {
                    q.offer(curr.left);
                }
                if(curr.right != null) {
                    q.offer(curr.right);
                }
            }
            level++;
        }

        return (levelX == levelY && parentX != parentY);


    }
}