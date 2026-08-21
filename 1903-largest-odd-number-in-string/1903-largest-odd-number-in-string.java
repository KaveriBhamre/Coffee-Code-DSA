class Solution {
    public String largestOddNumber(String s) {
        String copy = s;
        for(int i = copy.length() - 1; i >= 0; i--) {
            if((s.charAt(i) - '0') % 2 != 0) {
                return copy.substring(0, i+1);
            }
        }
        return "";
    }
}