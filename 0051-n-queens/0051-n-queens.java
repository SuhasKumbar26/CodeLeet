class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        String[][] board = new String[n][n];

        for(String[] row: board){
            Arrays.fill(row, ".");
        }

        putQueensOnRow(board, 0, ans);

        return ans;
    }

    private void putQueensOnRow(String[][] board, int row, List<List<String>> ans){
        //base
        if(row == board.length){
            List<String> ds = new ArrayList<>();
            for(String[] temp: board){
                StringBuilder sb = new StringBuilder();
                for(String s: temp){
                    sb.append(s);
                }
                ds.add(sb.toString());
            }
            ans.add(ds);
            return;
        }

        // self work
        for(int i = 0; i < board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = "Q";
                putQueensOnRow(board, row+1, ans);
                board[row][i] = ".";
            }
        }
    }


    private boolean isSafe(String[][] board, int r, int c){
        // check row 
        for(int i = 0; i < board.length; i++){
            if(board[r][i] == "Q") return false;
        }

        // check col
        for(int i = 0; i < board.length; i++){
            if(board[i][c] == "Q") return false;
        }

        // check above left diagonal
        for(int i = r, j = c; i >= 0 && j >= 0; i--, j-- ){
            if(board[i][j] == "Q") return false; 
        }

        // check above right diagonal
        for(int i = r, j = c; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == "Q") return false; 
        }

        return true;
    }
}