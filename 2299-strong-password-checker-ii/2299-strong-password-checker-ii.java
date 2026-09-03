class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password == null || password.length() < 8 ) return false;

        Set<Character> set = new HashSet<>(Arrays.asList(
            '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'
        ));

        boolean lc = false;
        boolean uc = false;
        boolean digit = false;
        boolean sp = false;
        boolean ad = false;

        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                return false; 
            }
        }

        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isLowerCase(ch)) lc= true;
            else if(Character.isUpperCase(ch)) uc = true;
            else if(Character.isDigit(ch)) digit = true;
            else if(set.contains(ch)) sp = true;
        }

        if(lc && uc && digit && sp) return true;

        return false;

    }
}