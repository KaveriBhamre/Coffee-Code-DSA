class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int curr = q.poll();
            if(arr[curr] == 0) return true;
            int[] neighbors = {curr + arr[curr], curr - arr[curr]};

            for(int next : neighbors) {
                if(next >= 0 && next < n && visited[next] != true) {
                    q.offer(next);
                    visited[next] = true;
                }
            }
        }

        return false;

        
    }
}