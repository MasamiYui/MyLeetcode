package me.bm;

public class BM18 {
    public boolean Find(int target, int [][] array) {
        int row = array.length-1;
        int col = 0;
        while(row>=0&&col<=array[0].length-1){
            if(target==array[row][col]){
                return true;
            }else if(target>array[row][col]){
                col++;
            }else if(target<array[row][col]){
                row--;
            }
        }
        return false;
    }
}
