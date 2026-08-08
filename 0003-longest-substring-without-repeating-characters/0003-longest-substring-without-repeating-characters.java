class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++) {
            int[] freq = new int[256];
            for(int j = i; j < s.length(); j++) {
                if(freq[s.charAt(j)] == 1) break;
                freq[s.charAt(j)]=1;
                maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }
}