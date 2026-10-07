class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i < s.length()) {
            if(s.charAt(i) == '(') {
                st.push(i);
            }
            else if(s.charAt(i) == ')') {
                if(st.isEmpty() || s.charAt(st.peek()) == ')') {
                    st.push(i);
                }else if(!st.isEmpty() || s.charAt(st.peek()) == '('){
                    st.pop();
                }
            }
            i++;
        }
        if(st.isEmpty()) return s;
        StringBuilder sb = new StringBuilder();

        for(int j = s.length() - 1; j >= 0; j--) {
            if(!st.isEmpty() && st.peek() == j) {
                st.pop();
                continue;
            }
            sb.insert(0, s.charAt(j));
        }

        return sb.toString();


    }
}