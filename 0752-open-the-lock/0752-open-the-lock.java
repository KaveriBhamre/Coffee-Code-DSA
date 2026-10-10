
import java.util.*;

class Solution {
    public int openLock(String[] deadends, String target) {

        HashSet<String> dead = new HashSet<>();

        for (int i = 0; i < deadends.length; i++) {
            dead.add(deadends[i]);
        }

        if (dead.contains("0000")) {
            return -1;
        }

        Queue<String> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        q.add("0000");
        visited.add("0000");

        int moves = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String curr = q.poll();
//String curr = q.poll();
System.out.println("Current: " + curr + ", moves: " + moves);
                if (curr.equals(target)) {
                    return moves;
                }

                for (int j = 0; j < 4; j++) {

                    char[] arr = curr.toCharArray();

                    arr[j] = (char)((arr[j] - '0' + 1) % 10 + '0');
                    String up = new String(arr);

                    if (!dead.contains(up) && !visited.contains(up)) {
                        q.add(up);
                        visited.add(up);
                    }

                    arr = curr.toCharArray();

                    arr[j] = (char)((arr[j] - '0' + 9) % 10 + '0');
                    String down = new String(arr);

                    if (!dead.contains(down) && !visited.contains(down)) {
                        q.add(down);
                        visited.add(down);
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}
