class Solution {
    public int smallestAbsent(int[] nums) {
        int n = nums.length;
        int avg = 0, ans = 0;
        for(int i = 0; i < n; i++){
            ans += nums[i];
        }
        avg = ans / n;
        int x = avg + 1;
        x = Math.max(1, x);
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                if(nums[i] == x){
                    x++;
                }
            }
        }

        return x;

    }
}