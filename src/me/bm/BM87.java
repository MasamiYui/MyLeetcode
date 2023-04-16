package me.bm;

public class BM87 {
    public void merge(int A[], int m, int B[], int n) {
        int i1 = m-1;
        int i2 = n-1;
        for(int i=m+n-1; i>=0; i--){
            if(i2<0 || ((i1>=0) && A[i1]>= B[i2]) ){
                A[i] = A[i1--];
            }else{
                A[i] = B[i2--];
            }
        }
    }
}
