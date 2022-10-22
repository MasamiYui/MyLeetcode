package me.nextJourney;

import java.util.ArrayList;
import java.util.List;

public class LeetCode165 {
    public int compareVersion(String version1, String version2) {

        List<Integer> version1Arr = parseToVersionArray(version1);
        List<Integer> version2Arr = parseToVersionArray(version2);
        int len = Math.min(version1Arr.size(), version2Arr.size());
        for(int i=0; i<len; i++){
            if(version1Arr.get(i).equals(version2Arr.get(i)) ){
                continue;
            }else if(version1Arr.get(i) < version2Arr.get(i)){
                return -1;
            }else{
                return 1;
            }
        }
        if(version1Arr.size() > version2Arr.size()){
            for(int i = len; i<version1Arr.size(); i++){
                if(version1Arr.get(i) == 0){
                    continue;
                }else{
                    return 1;
                }
            }
        }else{
            for(int i = len; i<version2Arr.size(); i++){
                if(version2Arr.get(i) == 0){
                    continue;
                }else{
                    return -1;
                }
            }
        }
        return 0;
    }

    public List<Integer> parseToVersionArray(String version){
        List<Integer> result = new ArrayList<>();
        String[] arr = version.split("\\.");
        for(int i=0; i<arr.length; i++){
            int subVersion = Integer.valueOf(arr[i]);
            result.add(subVersion);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = new LeetCode165().compareVersion("0.1", "1.1");
        System.out.println(result);
    }


}
