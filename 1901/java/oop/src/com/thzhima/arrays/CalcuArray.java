package com.thzhima.arrays;

public class CalcuArray {

	/*
	 * 1,2,3
	 * 4,5,6
	 * 7,8,9
	 * 
	 * {{1,2,3},{4,5,6},{7,8,9}}
	 * int[][] array = new int[3][3];
	 */
	public static void main(String[] args) {
		int[][] array = new int[3][3];
		int count = 1;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = count++;
			}
		}
		
		for(int[] a : array) {
			for(int i : a) {
				System.out.print(i + ",");
			}
			System.out.println();
		}
		
		//===================================
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i][i];
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i=0,j=array[i].length-1;
				i<array.length; 
				i++,j--) {
			System.out.println(":" + array[i][j]);
			sum += array[i][j];
		}
		System.out.println("sum: " + sum);
	}
}
