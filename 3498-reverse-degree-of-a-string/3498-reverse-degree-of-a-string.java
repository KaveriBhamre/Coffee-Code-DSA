class Solution {
    public int reverseDegree(String s) {
        char ch[] = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < ch.length; i++) {
            int degree = 26 - (ch[i] - 'a');
            int index = i+1;
            sum += degree*index;
        }
        return sum;
    }
}