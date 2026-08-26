class Solution {
    public int largestPerimeter(int[] nums) {
        int maxPerimeter = 0;
        Arrays.sort(nums);

        for(int i = nums.length - 1; i >= 2; i--) {
            int c = nums[i];
            int b = nums[i-1];
            int a = nums[i-2];

            if(a + b > c) {
                int perimeter = a + b + c;
                maxPerimeter = Math.max(maxPerimeter, perimeter);
            }
        }

        return maxPerimeter;
    }
}