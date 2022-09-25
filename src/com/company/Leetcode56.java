package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode56 {

    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();

        //特殊处理
//        if(intervals.length == 1){
//            return intervals;
//        }

        //1.首先排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0]) {
                    return a[1] - b[1];
                }

                return a[0] - b[0];
            }
        });
        //2.遍历合并区间
        int min = intervals[0][0];
        int max = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] <= max){
                max = Math.max(max,intervals[i][1]);
            }else{
                result.add(new int[]{min,max});
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        result.add(new int[]{min,max});

        int[][] resultArr = new int[result.size()][2];
        for(int i=0; i<result.size(); i++){
            resultArr[i][0] = result.get(i)[0];
            resultArr[i][1] = result.get(i)[1];
        }
        return resultArr;
    }

}
