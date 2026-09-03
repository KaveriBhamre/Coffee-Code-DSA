class Solution {
    public String convertToTitle(int c) {
        StringBuilder sb = new StringBuilder();

        while(c > 0) {
            c--;
            int mod = c % 26;
            char ch = (char) ('A' + mod);
            sb.append(ch);
            c = c / 26; 
        }

        return sb.reverse().toString();
    }
}