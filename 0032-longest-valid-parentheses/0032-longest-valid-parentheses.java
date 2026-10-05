class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        removeValid(s, st);
        if(st.isEmpty()) return s.length();

        ArrayList<Integer> arr = new ArrayList<>();
        formArray(arr, st, s);

        int max = 0;

        for(int i = 1; i < arr.size(); i++) {
            int prev = arr.get(i - 1);
            max = Math.max(max, arr.get(i) - prev - 1);
        }
        return max;
    }

    public void removeValid(String s, Stack<Integer> st) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                st.push(i);
            }else {
                if(st.isEmpty() || s.charAt(st.peek()) == ')' ){
                    st.push(i);
                }else {
                    st.pop();
                }
            }
        }
    }

    public void formArray(ArrayList<Integer> arr, Stack<Integer> st, String s) {
        arr.add(0, s.length());
        while(!st.isEmpty()) {
            arr.add(0, st.pop());
        }
        arr.add(0, -1);
    }
}