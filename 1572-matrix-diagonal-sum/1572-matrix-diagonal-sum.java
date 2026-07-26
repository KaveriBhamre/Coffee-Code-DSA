class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j){
                    sum += mat[i][j];
                }
            }
        }

        for(int i = 0, j = n- 1; i < n && j >= 0; i++, j--) {
            sum += mat[i][j];
        }

        if(n % 2 != 0) {
            int mid = n / 2;
            sum -= mat[mid][mid];
        }

        return sum;
        

    }
}