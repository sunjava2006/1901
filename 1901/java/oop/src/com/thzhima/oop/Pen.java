package com.thzhima.oop;

import java.util.Calendar;

public class Pen {

	int ink ;
	
	Pen(int ink){
		System.out.println("构造1");
		this.ink = ink;
	}
	
	Pen(){
		System.out.println("构造2");
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		System.out.println(month);
		if(month>=7-1 && month<=8-1) {
			ink = 90;
		}
		else {
			ink = 100;
		}
	}
	
	public static void main(String[] args) {
		Pen p = new Pen();
		System.out.println(p.ink);
		
		Pen p2 = new Pen(80);
		System.out.println(p2.ink);
		
		p.write();
		p.write("hello");
		p.write(1000);
	}
	
	void write() {
		System.out.println("-----------------");
	}
	
	void write(String msg) {
		System.out.println(msg);
	}
	
	void write(int n) {
		System.out.println(n);
	}
}
