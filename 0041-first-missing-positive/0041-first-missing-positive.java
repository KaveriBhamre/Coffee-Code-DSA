class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        for(int ele : nums){
            if(ele > 0 && ele <= n){
                visited[ele - 1] = true;
            }
        }
        for(int i = 0; i < n; i++){
            if(visited[i] == false){
                return i+1;
            }
        }
        return n+1;
    }
}