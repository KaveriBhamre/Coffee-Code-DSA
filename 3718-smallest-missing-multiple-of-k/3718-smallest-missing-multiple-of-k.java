class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
        }

        int ans = k;

        while(set.contains(ans)) {
            ans += k;
        }

        return ans;

    }
}