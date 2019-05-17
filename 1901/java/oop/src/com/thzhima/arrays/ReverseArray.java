package com.thzhima.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = {0, 10, 20, 30, 40, 50};
		int leng = array.length;
		for(int i=0; i<array.length/2; i++) {
			int temp = array[i];
			array[i] = array[leng-1-i];
			array[leng-1-i] = temp;
		}
		for(int i : array) {
			System.out.print(i + " \t");
		}
	}
}
