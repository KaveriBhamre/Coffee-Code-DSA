class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(String s : strs) {
            if(isInteger(s)) {
                max = Math.max(max, Integer.parseInt(s));
            }
            else{
                max = Math.max(max, s.length());
            }
        }
        return max;
    }
    private boolean isInteger(String s) {
        for(char ch : s.toCharArray()) {
            if(!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}