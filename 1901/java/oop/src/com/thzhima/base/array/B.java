package com.thzhima.base.array;

public class B {

	public static void main(String[] args) {
		int[] a = new int[]{100, 200, 300};
		
		for(int e : a){
			System.out.println(e);
		}
		
		int[] b = new int[]{100};
		System.out.println(b[0]);
	}
}
