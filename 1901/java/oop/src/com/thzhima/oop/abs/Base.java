package com.thzhima.oop.abs;

public class Base {

	public int a; // ʵ�����ڶ�����
	public static int b;// ��̬��������
	
	{
		System.out.println();
	}
	
	public static void todo() {
		//a++;
		b++;
	}
	
	
	public static void main(String[] args) {
		Base  base = new Base();
		base.a = 90;
		Base.b = 1000;
	
		
		Base base2 = new Base();
		base2.a = 80;
		
		System.out.println(base.a);
		System.out.println(base2.a);
		
		System.out.println(Base.b);
		System.out.println(Base.b);
		base.b= 8;
		System.out.println(Base.b);
		System.out.println(base2.b);
		
	}
}
