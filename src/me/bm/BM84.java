package me.bm;

public class BM84 {
    public String longestCommonPrefix (String[] strs) {
        if(strs.length==0 || strs==null){
            return "";
        }

        int rows = strs.length;
        int cols = strs[0].length();

        for(int i=0;i<cols;i++){
            char firstChar = strs[0].charAt(i);
            for(int j=1;j<rows;j++){
                if(strs[j].length()==i || strs[j].charAt(i)!=firstChar){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String s = new BM84().longestCommonPrefix(new String[]{"A", "AB", "ABC"});
        System.out.println(s);
    }
}
