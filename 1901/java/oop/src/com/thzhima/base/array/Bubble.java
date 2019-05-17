package com.thzhima.base.array;

public class Bubble {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		for(int i=0; i<10; i++){
			int ran = (int)(Math.random()*100);
			array[i]  = ran;
		}
		
		for(int i:array){
			System.out.print(i + ",");
		}
		System.out.println();
		
		for(int i=0; i<array.length-1; i++){
			boolean change = false;
			for(int j=0; j<array.length-1-i; j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					change = true;
				}
			}
			if(!change){
				break;
			}
		}
		
		for(int i:array){
			System.out.print(i + ",");
		}
		System.out.println();
		
	}
}
