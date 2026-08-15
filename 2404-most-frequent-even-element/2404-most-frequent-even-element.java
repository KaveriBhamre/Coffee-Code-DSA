class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int ans = -1, count = 0;
        for(int ele : nums){
            if(map.get(ele) > count && ele % 2 == 0){
                count = map.get(ele);
                ans = ele;
            }else if(map.get(ele) == count && ele % 2 == 0){
                ans = Math.min(ele, ans);
            }
        }
        return ans;
    }
}