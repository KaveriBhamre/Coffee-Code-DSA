class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] vis = new boolean[n];

        for(int num: nums){
            if(num > 0 && num <= n){
                vis[num-1] = true;
            }
        }

        for(int i =0 ;i < n; i++){
            if(vis[i] == false){
                return i+1;
            }
        }
        return n+1;
    }
}