class Solution {
    public int firstMissingPositive(int[] nums) {
        int x = 1;
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        while(set.contains(x)) x++;
        return x;
    }
}