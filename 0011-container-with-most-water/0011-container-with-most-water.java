class Solution {
    public int maxArea(int[] height) {
        int n = height.length; 
        int maxArea = 0;
        int left = 0, right = n - 1;

        while(left < right) {
            int a = Math.min(height[left], height[right]);
            int b = right - left;
            int area = a * b;
            maxArea = Math.max(area, maxArea);
            if(height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }


        return maxArea;
    }
}