package me.nextJourney;

public class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i=1; i< strs.length; i++){
            prefix = getSamePrefix(prefix, strs[i]);
            if(prefix.equals("")){
                return "";
            }
        }
        return prefix;
    }

    public String getSamePrefix(String str1, String str2){
        int i =0;
        for(; i<Math.min(str1.length(), str2.length()); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                break;
            }
        }
        return str1.substring(0, i);
    }
}
