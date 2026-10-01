class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pairs = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        );
        for (char c : s.toCharArray()) {
            // Opening bracket
            if (pairs.containsValue(c)) {
                stack.push(c);
            }
            // Closing bracket
            else if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}