class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        if(nums.length == 0) return null;

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        for(int n : nums) {
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