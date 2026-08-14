class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++) {
            int[] freq = new int[256];
            for(int j = i; j < s.length(); j++) {
                freq[s.charAt(j)]++;
                if(freq[s.charAt(j)] > 2) break;
                maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }
}


