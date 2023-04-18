package me.bm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BM89 {


    public class Interval {
         public int start;
         public int end;
         Interval() { start = 0; end = 0; }
         Interval(int s, int e) { start = s; end = e; }
    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        ArrayList<Interval> result = new ArrayList<>();
        if(intervals.size() == 0){
            return result;
        }
        intervals.sort((o1,o2) ->{
            if(o1.start != o2.start) {
                return o1.start - o2.start;
            } else {
                return o1.end - o2.end;
            }
        });
        result.add(intervals.get(0));
        int count = 0;
        for(int i=1; i<intervals.size(); i++){
            Interval interval = intervals.get(i);
            Interval origin = result.get(count);
            if(interval.start > origin.end){
                //没有重叠
                result.add(interval);
                count++;
            }else{
                //有重叠
                result.remove(count);
                result.add(new Interval(origin.start, Math.max(interval.end,origin.end)));
            }
        }
        return result;
    }
}
