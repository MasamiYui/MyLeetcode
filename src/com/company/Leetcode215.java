package com.company;

public class Leetcode215 {
    public int findKthLargest(int[] nums, int k) {

        buildHeap(nums, k);
        //遍历剩下元素，比堆顶小，跳过；比堆顶大，交换后重新堆化
        for (int i = k; i < nums.length; i++) {
            if (nums[i] < nums[0]) continue;
            swap(nums, i, 0);
            heapify(nums, k, 0);
        }
        //K个元素的小顶堆的堆顶即是第K大元素
        return nums[0];
    }

    //建堆
    public void buildHeap(int[] nums, int k){
        for (int i = k/2 - 1; i >= 0; i--) {
            heapify(nums, k, i);
        }
    }

    public void heapify(int[] a, int k, int i) {
        //临时变量 minPos 用于存储最小值的下标，先假设父节点最小
        int minPos = i;
        while (true) {
            //和左子节点比较
            if (i*2+1 < k && a[i*2+1] < a[i]) minPos = i*2+1;
            //和右子节点比较
            if (i*2+2 < k && a[i*2+2] < a[minPos]) minPos = i*2+2;
            //如果minPos没有发生变化，说明父节点已经是最小了，直接跳出
            if (minPos == i) break;
            //否则交换
            swap(a, i, minPos);
            //父节点下标进行更新，继续堆化
            i = minPos;
        }
    }

    public void swap(int[] a, int n, int m) {
        int tmp = a[n];
        a[n] = a[m];
        a[m] = tmp;
    }


    public static void main(String[] args) {

    }
}
