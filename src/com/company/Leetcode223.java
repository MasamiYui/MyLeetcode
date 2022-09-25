package com.company;

import java.util.Arrays;

public class Leetcode223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C-A) * (D-B);
        int area2 = (G-E) * (H-F);

        //1.判断未重合情况
        if(A >= G || C<=E){
            return area1+area2;
        }
        if(B>= H || D<=F){
            return area1+area2;
        }
        //2.判断有重合的情况
        int[] lrPoints = new int[]{A,C,E,G};
        int[] udPoints = new int[]{B,D,F,H};
        Arrays.sort(lrPoints);
        Arrays.sort(udPoints);
        int weight = lrPoints[2]- lrPoints[1];
        int height = udPoints[2] - udPoints[1];

        return area1+area2-weight * height;
    }

    public static void main(String[] args) {
        int res = new Leetcode223().computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
        System.out.println(res);
    }


}
