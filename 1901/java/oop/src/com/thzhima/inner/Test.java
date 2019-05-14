package com.thzhima.inner;

public abstract class Test {

	public abstract int sum(int a, int b);
	
}

class MyTest extends Test{
	public int sum(int a, int b) {
		return a+b;
	}
}