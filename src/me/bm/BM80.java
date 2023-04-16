package me.bm;

public class BM80 {
    public int maxProfit (int[] prices) {
        // write code here
        if(prices.length <= 1){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        //int max = Integer.MIN_VALUE;
        int result = 0;
        for(int i =0; i<prices.length; i++){
            min = Math.min(prices[i], min);
            result = Math.max(result, prices[i] - min);
        }
        return result;
    }
}
