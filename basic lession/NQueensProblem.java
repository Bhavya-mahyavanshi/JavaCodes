import java.util.Array;
import java.util.Scanner;

class NQueens{


    /*Question 2: N-Queens
                      N * N chessboard
                      N queens
                      Print all solution where queen is safe*/
                      
    public boolean issafe(int row, int col, char [][] board){

        //Horizontal
        for(int j = 0; j< board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //Verticale
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //Upper left
        int r = row;
        for (int c = col; c>=0 && r>=0; c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //Upper right 
         r = row;
        for (int c = col; c<board.length && r>=0; c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower left
        r = row;
        for (int c = col; c>=0 && r<board.length; c--,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower Right 
        r = row;
        for (int c = col; c<board.length && r<board.length; c++,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char [][] board,  List<List<String>> allboard){
        String row = "";
        List<String> newboard = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
           row = "";
           for(int j = 0; j < board[0].length; j++){
            if(board[i][j] == 'Q'){
                row += 'Q';
            }else{
                row += '.';
            }
            }
            newboard.add(row);
        }
        allboard.add(newboard);
    }

    public void helper(char [][] board,  List<List<String>> allboard, int col){
        
        if(col == board.length){
            saveBoard(board, allboard);
            return;
        }
        for(int row = 0; row < board.length; row++){
            if(issafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allboard, col+1);
                board[row][col] = '.';
            }
        }
    }

    public  List<List<String>> solveNQueens(int n){
        List<List<String>> allboard = new ArrayList<>();
        char [][] board = new board[n][n];

        helper(board, allboard, 0);
        return allboard;
    }

}