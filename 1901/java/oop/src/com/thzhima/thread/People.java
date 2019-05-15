package com.thzhima.thread;

public class People { 
	String name;
	static final String national;
	
	final String gender ;
	
	static{
		national = "china";
	}
	
	{
	  // this.gender = "female";	
	}
	
	public People(String g){
		this.gender = g;
	}
	
	public void run ()
	{
		System.out.println("run....");
	}
	public void eat (int a, int b)
	{
		int c = a;
		System.out.println("eat....");
		{
			int d = c;
			System.out.println(a+b+c+d);
		}
		//System.out.println(a+b+c+d);
	}
	
}
