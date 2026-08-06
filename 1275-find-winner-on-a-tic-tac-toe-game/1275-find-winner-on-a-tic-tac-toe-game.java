class Solution {
    public char checkCols(char[][] board){
        for(int i = 0; i < board.length; i++) {
            if(board[0][i] == board[1][i] 
                && board[1][i] == board[2][i] 
                && board[0][i] != '\0'){
                return board[0][i];
            }
        }
        return '\0';
    }
    public char checkDiag(char[][] board){
        if(board[0][0] == board[1][1] 
                && board[1][1] == board[2][2] 
                && board[0][0] != '\0'){
                    return board[0][0];
                }
        return '\0';
    }
    public char checkAntiDiag(char[][] board){
        if(board[0][2] == board[1][1] 
                && board[1][1] == board[2][0] 
                && board[0][2] != '\0'){
                    return board[0][2];
                }
        return '\0';
    }


    public char checkRows(char[][] board){
        for(int i = 0; i < board.length; i++) {
            if(board[i][0] == board[i][1] 
                && board[i][1] == board[i][2] 
                && board[i][0] != '\0'){
                return board[i][0];
            }
        }
        return '\0';
    }
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        for(int i = 0; i < moves.length; i++){
            int r = moves[i][0];
            int c = moves[i][1];
            if(i % 2 == 0){
                board[r][c] = 'X';
            }else {
                board[r][c] = 'O';
            }
        }

        char[] results = {
            checkRows(board),
            checkCols(board),
            checkDiag(board),
            checkAntiDiag(board)
        };

    for (char winner : results) {
        if (winner == 'X') return "A";
        if (winner == 'O') return "B";
    }

    return moves.length == 9 ? "Draw" : "Pending";

    }
}