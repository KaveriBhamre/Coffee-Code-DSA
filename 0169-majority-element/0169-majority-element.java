class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int vote = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == vote) count++;
            else if(count == 0){
                count = 1;
                vote = nums[i];
            }else count--;
        }
        return vote;
    }
}