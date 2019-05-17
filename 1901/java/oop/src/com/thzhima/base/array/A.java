package com.thzhima.base.array;

public class A {

	public static void main(String[] args) {
		int[] array = new int[3];
		System.out.println(array[0]);
		
		boolean[] barray = new boolean[2];
		System.out.println(barray[0]);
		
		Object[] oarray = new Object[3];
		System.out.println(oarray[0]);
		
		array[0] = 100;
		array[1] = 200;
		array[2] = 300;
		
		System.out.println(array[2]);
		
		for(int i=0; i<array.length; i+=2){
			int e = array[i];
			System.out.println(i+ ":" + e);
		}
		
		for(int i : array){
			System.out.println(i+=1);
		}
		for(int i : array){
			System.out.println(i);
		}
	}
}
