class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        if(nums.length == 0) return null;

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
            set.add(n);
        }

        for(int i = min; i <= max; i++) {
            if(!set.contains(i)){
                list.add(i);
            }
        }

        Collections.sort(list);

        return list;
    }
}