package me.bm;

public class BM73 {
    public int getLongestPalindrome (String A) {
        // write code here
        //中心扩散法
        if(A.length() == 0){
            return 0;
        }
        int result = 1;
        char[] cs = A.toCharArray();
        for(int i=0; i<cs.length; i++){
            //单节点扩散
            int k = 1;
            int left = i-1;
            int right = i+1;
            while(left>=0 && right<cs.length){
                if(cs[left] == cs[right]){
                    k = k + 2;
                    left --;
                    right ++;
                }else{
                    break;
                }
            }
            result =Math.max(result, k);

            //双节点扩散
            if(i+1 < cs.length && cs[i] == cs[i+1]){
                k = 2;
                left = i-1;
                right = i+2;
                while(left>=0 && right<cs.length){
                    if(cs[left] == cs[right]){
                        k = k + 2;
                        left --;
                        right ++;
                    }else{
                        break;
                    }
                }
                result =Math.max(result, k);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int bb = new BM73().getLongestPalindrome("bb");
        System.out.println(bb);
    }
}
