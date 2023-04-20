package me.bm;

public class BM51 {
    public int MoreThanHalfNum_Solution(int [] array) {

        int k = array[0];
        int n = 1;
        for(int i = 1; i < array.length; i++){
            if(k == array[i]){
                n++;
            }else{
                if(n==0){
                    k = array[i];
                    n = 1;
                }else{
                    n--;
                }
            }
        }
        return k;
    }
}
