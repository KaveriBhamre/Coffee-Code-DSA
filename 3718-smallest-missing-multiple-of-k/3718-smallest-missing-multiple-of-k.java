class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int ele : nums) {
            if(ele % k == 0) {
                set.add(ele);
            }
        }

        for(int i = 1; i <=set.size() + 1; i++) {
            if(!set.contains(i*k)) {
                return i*k;
            }
        }

        return 0;
    }
}