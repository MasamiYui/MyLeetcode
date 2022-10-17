package me.nextJourney;

import java.util.ArrayList;
import java.util.List;

public class LeetCode93 {
    public List<String> restoreIpAddresses(String s) {

        List<String> result = new ArrayList<>();
        List<String> subList = new ArrayList<>();
        dfs(s, 0,  subList, result);
        return result;
    }

    public void dfs(String s, int dealed, List<String> subList, List<String> result){
        if(subList.size() > 4){
            System.out.println("error");
            return;
        }else if(subList.size() == 4){
            if(dealed == s.length()){
                result.add(toIpStr(subList));
            }
            return;
        }else{
            if(dealed + 1 <= s.length() && isValidPart(s.substring(dealed, dealed+1))){
                subList.add(s.substring(dealed, dealed + 1));
                dfs(s, dealed+1, subList , result);
                subList.remove(subList.size() -1);
            }
            if(dealed + 2 <= s.length() && isValidPart(s.substring(dealed, dealed + 2))){
                subList.add(s.substring(dealed, dealed + 2));
                dfs(s, dealed+2, subList , result);
                subList.remove(subList.size() -1);
            }
            if(dealed + 3 <= s.length() && isValidPart(s.substring(dealed, dealed + 3))){
                subList.add(s.substring(dealed, dealed + 3));
                dfs(s, dealed+3, subList , result);
                subList.remove(subList.size() -1);
            }
        }
    }

    public String toIpStr(List<String> list){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size()-1; i++){
            sb.append(list.get(i)).append(".");
        }
        sb.append(list.get(list.size() - 1));
        return sb.toString();
    }


    public boolean isValidPart(String s){
        if(s == null || s.length() == 0){
            return false;
        }
        if(s.length() > 1 && s.startsWith("0")){
            return false;
        }
        if(s.length() > 3){
            return false;
        }
        if(Integer.valueOf(s) > 255){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> result = new LeetCode93().restoreIpAddresses("25525511135");
        System.out.println(result);
    }
}
