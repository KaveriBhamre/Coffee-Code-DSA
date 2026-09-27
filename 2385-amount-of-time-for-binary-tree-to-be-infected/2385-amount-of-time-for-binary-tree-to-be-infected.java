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

    private void buildParent(TreeNode root, TreeNode parent) {
        if(root == null) return;
        map.put(root, parent);
        buildParent(root.left, root);
        buildParent(root.right, root);
    }

    private TreeNode findNode(TreeNode root, int target){
        if(root == null) return null;
        if(root.val == target) return root;
        TreeNode left = findNode(root.left, target);
        TreeNode right = findNode(root.right, target);
        if(left != null) return left;
        return right;
    }

    public int amountOfTime(TreeNode root, int start) {

        buildParent(root, null);
        TreeNode target = findNode(root, start);

        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        int time = 0;
        
        q.offer(target);
        visited.add(target);

        while(!q.isEmpty()) {
            int size = q.size();
            boolean isBurned = false;
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll(); //🔥🔥
                if(curr.left != null && visited.contains(curr.left) != true) {
                    q.offer(curr.left);
                    visited.add(curr.left);
                    isBurned = true;
                }
                if(curr.right != null && visited.contains(curr.right) != true) {
                    q.offer(curr.right);
                    visited.add(curr.right);
                    isBurned = true;
                }
                TreeNode parent = map.get(curr);
                if(parent != null && visited.contains(parent) != true) {
                    q.offer(parent);
                    visited.add(parent);
                    isBurned = true;
                }
            }
            if(isBurned) time++;
        }
        return time;

    }
}