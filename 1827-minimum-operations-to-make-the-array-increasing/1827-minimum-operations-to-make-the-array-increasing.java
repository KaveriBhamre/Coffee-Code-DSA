class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;

        for(int i = 1; i < n; i++) {
            while(nums[i] <= nums[i-1]) {
                nums[i] += 1;
                operations++;
            }
        }

        return operations;
    }
}