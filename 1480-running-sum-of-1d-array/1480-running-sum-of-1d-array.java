class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(i == 0){
                ans[i] = nums[i];
            }
            if(i > 0) {
                ans[i] = ans[i-1] + nums[i];
            }
        }
        return ans;
    }
}