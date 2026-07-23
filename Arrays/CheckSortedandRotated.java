/* 
Count the number of places where the 
order decreases (nums[i] > nums[(i+1)%n]). 
If the count is more than one, 
the array cannot be sorted and rotated; 
otherwise, it can.
*/


class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i+1) % n]){
                count++;
            }
        }

        return count <= 1;
    }
}
