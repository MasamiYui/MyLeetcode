package me.bm;

public class BM63 {
    public int jumpFloor(int target) {
        if(target <=2){
            return target;
        }
        int[] dp = new int[target];
        dp[0] = 1;
        dp[1] = 2;

        for(int i =2; i<target; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[target - 1];
    }

    public static void main(String[] args) {
        int i = new BM63().jumpFloor(1);
        System.out.println(i);
    }


}
