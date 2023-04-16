package me.bm;

public class BM83 {
    public String trans(String s, int n) {
        StringBuffer res = new StringBuffer();
        int index = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                res.append(" ");
                index = res.length();
            } else {
                // 当前字符是字母
                if (ch >= 'A' && ch <= 'Z') {
                    res.insert(index, (char)(ch + 32));
                } else {
                    res.insert(index, (char)(ch - 32));
                }
            }
        }
        return res.toString();
    }
}
