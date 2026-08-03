class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while(columnNumber > 0) {
            columnNumber--;
            int mod = columnNumber % 26;
            char c = (char)('A' + mod);
            ans.append(c);
            columnNumber /= 26;
        }

        return ans.reverse().toString();
        
    }
}