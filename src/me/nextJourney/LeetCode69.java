package me.nextJourney;

public class LeetCode69 {

    public int mySqrt(int x) {

        int left = 0;
        int right = x;
        int result =-1;
        while(left <= right){
            int mid = left + (right -left)/2;
            long tmp = (long) mid * mid;
            if(tmp <= x){
                result = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return result;
    }
}
