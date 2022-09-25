package com.company;

public class Leetcode37 {

    boolean[][]rowsUsed = new boolean[9][9];
    boolean[][]colsUsed = new boolean[9][9];
    boolean[][]subUsed = new boolean[9][9];

    char[][] board;

    public boolean trackBack(int row, int col, int subIdx){

        while(row<9 && board[row][col] != '.'){
            if(col ==8){
                row =row +1;
                col =0;
            }else{
                row = row;
                col = col +1;
            }
        }
        if(row >=9){
            return true;//回溯完毕
        }
        subIdx = row/3 *3 + col/3;
        for(int i =1; i<=9; i++){
            if(rowsUsed[row][i-1] || colsUsed[col][i-1] || subUsed[subIdx][i-1]){
                continue;
            }
            rowsUsed[row][i-1] = true;
            colsUsed[col][i-1] = true;
            subUsed[subIdx][i-1] = true;
            board[row][col] = (char)(i + '0');
            if(trackBack(row, col, subIdx)){
                return true;
            }
            rowsUsed[row][i-1] = false;
            colsUsed[col][i-1] = false;
            subUsed[subIdx][i-1] = false;
            board[row][col] = '.';
        }
        return false;
    }



    public void solveSudoku(char[][] board) {
        this.board = board;
        for(int i =0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    char n = board[i][j];
                    int num = (int)(n-'0');
                    int subIdx = i/3*3 + j/3;
                    rowsUsed[i][num-1] = true;
                    colsUsed[j][num-1] = true;
                    subUsed[subIdx][num-1] = true;
                }
            }
        }
        trackBack(0,0,0);
    }


    public static void main(String[] args) {
        char[][]testData = new char[][]{{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        new Leetcode37().solveSudoku(testData);

    }
}
