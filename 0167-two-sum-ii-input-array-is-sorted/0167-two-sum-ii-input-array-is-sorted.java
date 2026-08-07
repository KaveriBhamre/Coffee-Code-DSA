class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0, j = n-1;
        while(i < j) {
            int currSum = nums[i] + nums[j];
            if(currSum > target){
                j--;
            }else if(currSum < target){
                i++;
            }else if(currSum == target){
                return new int[]{i+1, j+1};
            }
        }
        return new int[]{-1, -1};
    }
}

