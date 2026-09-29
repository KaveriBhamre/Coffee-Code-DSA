import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<>();

        for (String op : operations) {
            if (op.equals("C")) {
                st.pop();
            } else if (op.equals("D")) {
                st.push(2 * st.peek());
            } else if (op.equals("+")) {
                int top = st.pop();
                int prev = st.peek();
                st.push(top);
                st.push(top + prev);
            } else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : st) {
            sum += score;
        }

        return sum;
    }
}