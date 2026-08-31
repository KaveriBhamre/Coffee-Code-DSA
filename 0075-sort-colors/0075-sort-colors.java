class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        //Dutch National Flag Algo
        //3-pointers;
        int n = nums.length;
        int mid = 0, low = 0, high = n-1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++; mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, high);
                high--;
            }

        }
    }
}