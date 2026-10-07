class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.offer(s);
        visited.add(s);

        boolean found = false;

        while(!q.isEmpty()) {
            String curr = q.poll();

            if(isValid(curr)) {
                result.add(curr);
                found = true;
            }
            if(found == true) continue;

            for(int i = 0; i < curr.length(); i++) {
                char ch = curr.charAt(i);
                if (ch != '(' && ch != ')') {
                    continue;
                }
                String next = curr.substring(0, i) + curr.substring(i+1);
                if(!visited.contains(next)) {
                    q.offer(next);
                    visited.add(next);
                }
            }
        }

        return result;

    }

    private boolean isValid(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                count++;
            }
            else if (ch == ')') {

                count--;

                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}