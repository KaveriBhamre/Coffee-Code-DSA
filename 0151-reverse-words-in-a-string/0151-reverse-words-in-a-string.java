class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int i = 0, j = words.length - 1;
        while(i < j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++; j--;
        }
        StringBuilder ans = new StringBuilder();
        for(int k = 0; k < words.length; k++){
            ans.append(words[k]);
            if(k != words.length - 1){
                ans.append(" ");
            }
        }
        return ans.toString();

    }
}