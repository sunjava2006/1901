package com.thzhima.oop;

public class Util {

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int r = Util.add(2, 3);
		
		Util u = new Util();
		int rr = u.add(1, 3);
	}
}
