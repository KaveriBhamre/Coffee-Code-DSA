class Solution {
    private void solve(int[] nums, int i, List<Integer> temp, List<List<Integer>> res) {
        res.add(new ArrayList<>(temp));
        for(int j = i; j < nums.length; j++) {
            temp.add(nums[j]);
            solve(nums, j+1, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), result);
        return result;
    }
}