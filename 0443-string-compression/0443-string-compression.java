class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i = 0; i < chars.length; i++){
            int count = 0;
            char ch = chars[i];
            while(i < chars.length  && chars[i] == ch){
                i++;
                count++;
            }
            if(count == 1){
                chars[index++] = ch;
            }else{
                chars[index++] = ch;
                String strCount = String.valueOf(count);
                for(char c : strCount.toCharArray()){
                    chars[index++] = c;
                }
            }
            i--;
        }
        return index;
        
    }
}