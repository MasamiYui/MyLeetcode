package me.bm;

public class BM91 {
    public String solve (String str) {
        char[] cs = str.toCharArray();
        int left = 0;
        int right = cs.length-1;
        while (left < right) {
            char temp = cs[left];
            cs[left++] = cs[right];
            cs[right--] = temp;
        }
        return new String(cs);
    }
}
