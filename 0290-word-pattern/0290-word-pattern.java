class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = arr[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(str)){
                    return false;
                }
            }else if(map.containsValue(str)){
                return false;
            }else {
                map.put(c, str);
            }

        }
        return true;
    }
}