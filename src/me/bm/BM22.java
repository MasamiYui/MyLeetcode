package me.bm;

public class BM22 {
    public int compare (String version1, String version2) {
        // write code here
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        for(int i=0; i<Math.max(v1.length, v2.length); i++){
            int n1 = v1.length > i? Integer.valueOf(v1[i]) : 0;
            int n2 = v2.length > i? Integer.valueOf(v2[i]) : 0;
            if(n1 > n2){
                return 1;
            }else if(n1 < n2){
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int compare = new BM22().compare("1.1", "2.1");
        System.out.println(compare);
    }
}
