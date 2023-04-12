package me.bm;

public class BM66 {
    public String LCS (String str1, String str2) {
        // write code here
        int maxI = -1;
        int maxJ = -1;
        int max = -1;
        int row = str1.length();
        int col = str2.length();
        int[][] dp = new int[row+1][col+1];
        for(int i=1; i<row +1 ; i++){
            for(int j=1; j<col + 1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if(dp[i][j]> max){
                        max = dp[i][j];
                        maxI = i;
                        maxJ = j;
                    }
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        if(max == -1){
            return "";
        }
        return str1.substring(maxI-max, maxI);

    }

    public static void main(String[] args) {
        String lcs = new BM66().LCS("1AB2345CD", "12345EF");
        System.out.println(lcs);
    }
}
