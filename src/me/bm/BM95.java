package me.bm;

import java.util.Arrays;

public class BM95 {
    public int candy (int[] arr) {
        // write code here
        int [] candies = new int[arr.length];
        Arrays.fill(candies, 1);

        for(int i =1; i<candies.length; i++){
            if(arr[i] > arr[i-1]){
                candies[i] = candies[i-1] + 1;
            }
        }


        for(int i=candies.length - 2; i >= 0; i--){
            if(arr[i] > arr[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }
        int result =0 ;
        for (int candy : candies) {
            result = result + candy;
        }
        return result;
    }

    public static void main(String[] args) {
        int candy = new BM95().candy(new int[]{10, 4, 10, 10, 4});
        System.out.println(candy);
    }
}
