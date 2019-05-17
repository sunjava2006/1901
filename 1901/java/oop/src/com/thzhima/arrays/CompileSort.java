package com.thzhima.arrays;

public class CompileSort {

	public static void main(String[] args) {
		int[] array = {40,30,20,10,50,33,22,1,9,27};
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i : array) {
			System.out.print(i + " ,");
		}
		
	}
}
