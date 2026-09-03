class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;

        for(char c : word.toCharArray()) {
            if(Character.isLetterOrDigit(c) != true) {
                return false;
            }
        }

        int vowel = 0;
        int conso = 0;

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(Character.isLetter(c)) {
                if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||
                    c == 'A' || c == 'E' ||c == 'I' ||c == 'O' ||c == 'U' ) {
                    vowel++;
                }
                else {
                    conso++;
                }
            }
        }

        if(vowel > 0 && conso > 0) {
            return true;
        }
        return false;
    }
}