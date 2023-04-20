package me.bm;

import java.util.ArrayList;
import java.util.Arrays;

public class BM54 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer>>();
        int n = num.length;
        if(n < 3) {
            return res;
        }
        Arrays.sort(num);
        for(int i = 0; i < n - 2; i++){
            if(i != 0 && num[i] == num[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;
            int target = -num[i];
            while(left < right){
                //双指针指向的二值相加为目标，则可以与num[i]组成0
                if(num[left] + num[right] == target){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(num[i]);
                    temp.add(num[left]);
                    temp.add(num[right]);
                    res.add(temp);
                    while(left + 1 < right && num[left] == num[left + 1]) {
                        left++;
                    }
                    while(right - 1 > left && num[right] == num[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(num[left] + num[right] > target) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = new BM54().threeSum(new int[]{
                -10, 0, 10, 20, -10, -40
        });
        System.out.println(arrayLists);
    }
}
