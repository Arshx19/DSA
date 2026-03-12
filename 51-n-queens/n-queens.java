import java.util.*;

class Solution {

    public List<List<String>> solveNQueens(int n) {
        boolean [][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        queen(board, n, 0, ans);
        return ans;
    }

    public static void queen(boolean [][] board, int tq, int row, List<List<String>> ans){ 
        if(tq == 0){
            ans.add(display(board));
            return ; 
        }
        for(int col = 0; col < board[0].length; col++){         
            if(issafe(board, col, row)){                
                board[row][col] = true;                
                queen(board, tq-1, row+1, ans);
                board[row][col] = false;
            }
        }
    }

    public static boolean issafe(boolean [][] board , int col, int row){
        int r = row;
        int c = col;
        // right diagonal
        while(r >= 0 && c < board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        // left diagonal
        r = row;
        c = col;
        while(r >= 0 && c >= 0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }
        // up
        r = row;
        while(r >= 0){
            if(board[r][col]){
                return false;
            }
            r--;
        }
        return true;
    }

    public static List<String> display(boolean[][] board){
        List<String> list = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String str = "";
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j])
                    str += "Q";
                else
                    str += ".";
            }
            list.add(str);
        }
        return list;
    }
}