class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        if (freshCount == 0) return 0;

        int minutes = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!q.isEmpty()) {
            int size = q.size();
            boolean isRotten = false;
            for(int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];

                for(int[] dir : directions) {
                    int nRow = row + dir[0];
                    int nCol = col + dir[1];
                    if (nRow >= 0 && nRow < rows && 
                        nCol >= 0 && nCol < cols && 
                        grid[nRow][nCol] == 1) {

                        grid[nRow][nCol] = 2; 
                        q.offer(new int[]{nRow, nCol}); 
                        freshCount--;
                        isRotten = true;
                    }
                }
            }
            if(isRotten) minutes++;
        }

        return freshCount == 0 ? minutes : -1;
    }
}