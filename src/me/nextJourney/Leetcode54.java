package me.nextJourney;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {

    public List<Integer> spiralOrder(int[][] matrix) {

        if(matrix == null){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        //define top bottom left right
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        while (true){
            //go left
            for(int i = left; i<= right; i++){
                result.add(matrix[top][i]);
            }
            if(++top > bottom){
                break;
            }

            // go down
            for(int i=top; i<= bottom; i++){
                result.add(matrix[i][right]);
            }
            if(--right < left){
                break;
            }

            // go left
            for(int i=right; i>=left; i--){
                result.add(matrix[bottom][i]);
            }
            if(--bottom < top){
                break;
            }

            // fo up
            for(int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
            if(++left > right){
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {

    }
}
