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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ansList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return ansList;

        q.offer(root);

        while(!q.isEmpty()) {
            int levelNum = q.size();
            List<Integer> sublist = new ArrayList<>();

            for(int i = 0; i < levelNum; i++) {
                if(q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if(q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                sublist.add(q.poll().val);
            }
            ansList.add(sublist);
        }

        return ansList;
    }
}