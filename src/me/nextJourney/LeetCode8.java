package me.nextJourney;

public class LeetCode8 {
    /**
     * 太恶心了，不想优化代码了，过了就行
     * @param s
     * @return
     */
    public int myAtoi(String s) {

        long result = 0;
        int haveNumFlag = 0;
        int haveEngFlag = 0;
        int havePlus = 0;
        int haveIncr = 0;
        int haveSpace = 0;
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(chars[i] == '-'){
                if(haveIncr ==1 || havePlus ==1){
                    if(haveNumFlag ==1){
                        break;
                    }else{
                        return 0;
                    }

                }
                if(haveNumFlag ==1 ){
                    break;
                }
                haveIncr = 1;
            }else if(chars[i] == '+'){
                if(haveIncr ==1 || havePlus ==1 ){
                    if(haveNumFlag ==1){
                        break;
                    }else{
                        return 0;
                    }
                }
                if(haveNumFlag ==1 ){
                    break;
                }
                havePlus = 1;
            }
            else if(chars[i] >= '0' && chars[i] <= '9'){
                if(haveEngFlag == 1){
                    return 0;
                }
                haveNumFlag = 1;
                result =result * 10 + (chars[i] - '0');
                if(result > Integer.MAX_VALUE){
                    if(haveIncr ==1){
                        return Integer.MIN_VALUE;
                    }else{
                        return Integer.MAX_VALUE;
                    }
                }
            }else if(chars[i] == ' '){
                haveSpace = 1;
                if(haveNumFlag ==1){
                    break;
                }else{
                    if(havePlus ==1 || haveIncr ==1){
                        return 0;
                    }
                }
                continue;
            }else{
                haveEngFlag = 1;
                if(haveNumFlag ==1){
                    break;
                }
            }
        }
        if(haveIncr == 1){
            result = -result;
        }
        if(result > Integer.MAX_VALUE){
            result = Integer.MAX_VALUE;
        }else if(result < Integer.MIN_VALUE){
            result = Integer.MIN_VALUE;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        int result = new LeetCode8().myAtoi("-5-");
        System.out.println(result);
    }
}
