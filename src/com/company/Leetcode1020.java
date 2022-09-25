//package com.company;
//
//public class Leetcode1020 {
//    public int numEnclaves(int[][] grid){
//		if(grid.length == 0){
//			return 0;
//		}
//		int t = 0;
//		for(int i=0; i< grid.length; i++){
//			for(int j=0; j<grid[0].length; j++){
//				if(grid[i][j] == 1){
//					k++;
//				}
//                int[] num = {0};
//				if(trace(grid, num, i, j)){
//                    t += num[0];
//				}
//			}
//		}
//		return k-t;
//	}
//
//	public boolean trace(int[][] grid,  int[] num, int i, int j){
//		if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
//			return true;
//		}
//		if(grid[i][j] == 0){
//			return false;
//		}else{
//            grid[i][j] = 0;
//            num[0] = num[0] +1;
//			boolean up = trace(grid, num, i+1, j);
//			boolean down = trace(grid, num, i-1, j);
//			boolean left = trace(grid, num, i,j-1);
//			boolean right = trace(grid, num, i,j+1);
//			return up || down || left ||right;
//		}
//
//	}
//
//    public static void main(String[] args) {
//
//    }
//
//}
