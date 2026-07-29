class Solution {
    public boolean checkIfPangram(String sentence) {
        //sentence contains every letter of english alphabet atleast once
        if(sentence.length() < 26) return false;

        for(int ch = 'a'; ch <= 'z'; ch++){
            if(sentence.indexOf(ch) == -1){
                return false;
            }
        }

        return true;

    }
}