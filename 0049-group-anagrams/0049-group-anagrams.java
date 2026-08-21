class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            List<String> list = map.get(key);
            if(list == null) {
                list = new ArrayList<>();
                map.put(key, list);
            }
            list.add(s);
        }
        return new ArrayList<>(map.values());
    }
}