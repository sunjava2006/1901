package com.thzhima.arrays;

public class Array2 {

	public static void main(String[] args) {
		int[][] a = new int[2][3];
		/*
		 * {{1,2,3},{4,5,6}}
		 */
		System.out.println(a[0].length);
		a[0] = new int[] {1,2,3};
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		for(int[] arr : a) {
			for(int i : arr) {
				System.out.print(i + ",");
			}
			System.out.println();
		}
		
		
		int[][] b = new int[2][];
		b[0] = new int[3];
		b[1] = new int[] {1,2};
		
		System.out.println();
		
		int[][] c = new int[][]{{1,2,3},{4,5}};
		int[][] d = {{1,2},{3},{4,5,6}};
	}
}
