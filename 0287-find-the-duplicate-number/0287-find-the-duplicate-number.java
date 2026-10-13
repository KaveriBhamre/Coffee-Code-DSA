class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums) {
            if(map.containsKey(ele)) {
                return ele;
            }
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        return -1;
        
    }
}