class Solution {
    public int minMoves(int[] nums) {
        int moves  = 0;
        int mini = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < mini) {
                mini = nums[i];
            }
        }
        for(int ele : nums){
            moves += ele - mini;
        }
        return moves;



    }
}