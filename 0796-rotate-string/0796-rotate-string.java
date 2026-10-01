class Solution {
    public boolean rotateString(String s, String goal) {
        String s2 = s.concat(s);
        return s.length() == goal.length() && s2.contains(goal);
    }
}