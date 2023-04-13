package me.bm;

import java.util.ArrayList;
import java.util.List;

public class BM74 {



    public ArrayList<String> restoreIpAddresses (String s) {
        // write code here
        ArrayList<String> result = new ArrayList<>();
        dfs(s, 1, "", result);
        return result;
    }

    public void dfs(String s, int n, String ipAddr, ArrayList<String> result){
        if(n == 5 && s.length() == 0){
            result.add(ipAddr.substring(0, ipAddr.length() - 1));
            return;
        }
        if(n>=5){
            return;
        }
        int remain = 5 - n;
        if(s.length() < remain || s.length() > (3*remain)){
            return;
        }

        for(int i=1; i<=3; i++){
            if(s.length() < i){
                return;
            }
            String part = s.substring(0,i);
            int num = Integer.valueOf(part);
            if(part.length() != String.valueOf(num).length()){
                return;
            }

            if(num > 255){
                return;
            }

            dfs(s.substring(i), n+1, ipAddr+part+".", result);
        }






    }

}
