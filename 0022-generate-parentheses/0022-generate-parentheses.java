class Solution {

    private void backtrack(String current, int open, int close, int n, List<String> result) {
        if(current.length() == 2*n) {
            result.add(current);
            return;
        }
        //add open
        if(open < n) {
            backtrack(current + "(", open+1, close, n, result);
        }
        //add close
        if(close < open) {
            backtrack(current + ")", open, close+1, n, result);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack("", 0, 0, n, list);
        return list;
    }
}