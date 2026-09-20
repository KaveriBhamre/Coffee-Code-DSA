class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            int degree = 26 - (s.charAt(i) - 'a');
            int index = i+1;
            sum += degree*index;
        }
        return sum;
    }
}