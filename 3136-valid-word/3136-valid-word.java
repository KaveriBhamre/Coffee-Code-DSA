class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;

       int vowelCount = 0;
       int conCount = 0;

        for(int i = 0; i < word.length(); i++){
            char c = Character.toLowerCase(word.charAt(i));
            if(!(Character.isLetterOrDigit(c))) {
                return false;
            }
            else if(Character.isLetter(c)){
                if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ){
                    vowelCount++;
                }else{
                    conCount++;
                }
            }
        }

        if(vowelCount > 0 && conCount > 0){
            return true;
        }

        return false;
    }
}