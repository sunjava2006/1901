package com.thzhima.oop.abs;

public abstract class A {

	public abstract void killA(); 
	public abstract void killB() ;
    public abstract void killC() ;
	
}

abstract class  AA {
	void a() {}
	void b() {}
}

class MyAA extends AA{
	void a() {
		
	}
}

class MyKill extends A{

	@Override
	public void killA() {
		
	}

	@Override
	public void killB() {
		
	}

	@Override
	public void killC() {
		
	}
	
}
