/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, TreeNode> parent = new HashMap<>();
    List<Integer> ans = new ArrayList<>();
    Set<TreeNode> visited = new HashSet<>();

    private void buildParent(TreeNode node, TreeNode p) {
        if (node == null) {
            return;
        }
        parent.put(node, p);
        buildParent(node.left, node);
        buildParent(node.right, node);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        buildParent(root, null);
        Queue<TreeNode> q = new LinkedList<>();
        int distance = 0;
        
        q.offer(target);
        visited.add(target);

        while(!q.isEmpty()) {

            if(distance == k) {
                while(!q.isEmpty()) {
                    ans.add(q.poll().val);
                }
                return ans;
            }

            int size = q.size();

            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    q.offer(curr.left);
                }
                if(curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    q.offer(curr.right);
                }
                TreeNode p = parent.get(curr);
                if(p != null && !visited.contains(p)) {
                    visited.add(p);
                    q.offer(p);
                }
            }

            distance++;
        }

        return ans;


    }
}