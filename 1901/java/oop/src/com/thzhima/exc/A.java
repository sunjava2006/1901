package com.thzhima.exc;

public class A {

	public static int a(int i, int j){
		return i/j;
	}
	
	public static void main(String[] args) {
		
		
		
		try{
			int result = A.a(10, 10);
			System.out.println(result);
			
			int[] array = new int[-2];
			
			int[] a = {10,20};
			int v = a[3];
			
		}catch(ArithmeticException ex){
			System.out.println("��������");
		}catch(NegativeArraySizeException ex){
			System.out.println("���鳤�Ȳ������ԡ�");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
}
