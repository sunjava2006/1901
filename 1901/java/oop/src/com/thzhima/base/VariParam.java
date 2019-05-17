package com.thzhima.base;

public class VariParam {

	public static int sum(int a, int b, int... args) {
		int result =  a+b;
		if(null != args) {
			for(int i=0; i<args.length; i++) {
				result += args[i];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int r = sum(1,2, 3,4,5);
		System.out.println(r);
	}
}
