package com.thzhima.exc;

public class B {

	
	
	public static void to() 
			throws ClassNotFoundException, 
			       InstantiationException, 
			       IllegalAccessException{
		Class clas = Class.forName("jdfdk");
		clas.newInstance();
	}
	
	
	public static void main(String[] args) {
		try {
			B.to();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
