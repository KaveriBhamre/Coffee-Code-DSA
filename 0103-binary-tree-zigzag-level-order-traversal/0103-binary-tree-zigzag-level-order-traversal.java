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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        boolean flag = true;
        if(root == null) return list;
        q.offer(root);

        while(!q.isEmpty()) {
            int levelNum = q.size();
            List<Integer> subList = new ArrayList<>();
            
            for(int i = 0; i < levelNum; i++) {
                TreeNode current = q.poll();
                subList.add(current.val);
                if(current.left != null)
                    q.offer(current.left);
                if(current.right != null)
                    q.offer(current.right);
            }

            if(!flag) {
                Collections.reverse(subList);
            }

            list.add(subList);
            flag = !flag;
        }

        return list;
    }
}