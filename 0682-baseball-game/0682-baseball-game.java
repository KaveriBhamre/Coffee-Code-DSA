class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if(op.equals("C")) { 
                st.pop(); 
            }
            else if(op.equals("D")) { 
               int b = st.peek();
               st.push(2*b);
            }
            else if(op.equals("+")) {
                int top = st.pop();
                int prev = st.peek();
                st.push(top);
                st.push(top + prev);
            }
            else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        while(!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}