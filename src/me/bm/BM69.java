package me.bm;

public class BM69 {

    public int solve(String nums){
        nums = "0"+nums;
        int[] dp = new int[nums.length()];
        dp[0] = 1;
        for(int i=1; i<nums.length(); i++){
            int cond1 = nums.charAt(i) - '0';
            if(cond1>=1 && cond1<=9){
                dp[i] = dp[i] + dp[i-1];
            }
            int cond2 = (nums.charAt(i-1) - '0') * 10 + nums.charAt(i) - '0';
            if(cond2>=10 && cond2<=26){
                dp[i] = dp[i]+ dp[i-2];
            }
        }
        return dp[nums.length() - 1];
    }

    public static void main(String[] args) {
        int solve = new BM69().solve("12");
        System.out.println(solve);
    }

}
