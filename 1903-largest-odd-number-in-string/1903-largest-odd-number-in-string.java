class Solution {
    public String largestOddNumber(String s) {
        String copy = s;
        for(int i = copy.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '1' || s.charAt(i) == '3' ||
            s.charAt(i) == '5' || s.charAt(i) == '7' || s.charAt(i) == '9') {
                return copy.substring(0, i+1);
            }
        }
        return "";
    }
}