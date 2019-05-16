package com.thzhima.exc;

public class C {

	public static int devide(int a, int b)throws ArithmeticException{
		try{
			int result = a/b;
			return result;
		}catch(ArithmeticException ex){
			throw ex;
		}
		
	}
	
	public static int devide2(int a, int b) throws ParameterException{
		if(0 == b){
			throw new ParameterException("除数不能为0");
		}else{
			return a/b;
		}
	}
	
	public static void main(String[] args) {
		//C.devide(1, 2);
		try {
			int r = C.devide2(10, 0);
			System.out.println(r);
		} catch (ParameterException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally{
			System.out.println("end.....");
		}
	}
}
