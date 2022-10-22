package me.nextJourney;

public class LeetCode43 {
    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2];
        for(int i= len1-1; i>=0; i--){
            int x = num1.charAt(i) - '0';
            for(int j = len2-1; j>=0; j--){
                int y = num2.charAt(j) - '0';
                result[i+j+1] =  result[i+j+1] + x*y;
            }
        }

        for(int i= len1+len2-1; i>0; i--){
            result[i-1] = result[i-1] + result[i] / 10;
            result[i] = result[i]% 10;
        }

        StringBuilder sb = new StringBuilder();
        int index = result[0] == 0? 1: 0;
        while(index < len1 + len2){
            sb.append(result[index]);
            index ++ ;
        }
        return sb.toString();
    }
}
