class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int left = 0, right = 0;
        int maxLength = 0;
        while(right < n){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                if(map.get(c) >= left){
                    left = map.get(c) + 1;
                    map.replace(c, right);
                }
            }
            int len = right - left + 1;
            maxLength = Math.max(maxLength, len);
            map.put(c, right);
            right++;
        }
        return maxLength;
    }
}