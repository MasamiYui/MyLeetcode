package me.bm;

public class BM21 {
    public int minNumberInRotateArray(int [] array) {

        int left = 0;
        int right = array.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(array[mid] < array[right]){
                //最小值一定在右边
                right = mid;
            }else if(array[mid] == array[right]){
                right--;
            }else{
                left = mid + 1;
            }
        }
        return array[left];
    }
}
