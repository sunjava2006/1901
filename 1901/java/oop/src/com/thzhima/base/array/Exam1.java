package com.thzhima.base.array;

public class Exam1 {

	public static void main(String[] args) {
		String str = "ÄãºÃ£¬Java¡£";
		char[] a = new char[str.length()];
		
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			a[i] = c;
		}
		
		int quoAt = -1;
		int dotAt = -1;
		for(int i=0; i<a.length; i++){
			if('£¬'== a[i]){
				quoAt = i;
			}
			else if('¡£' == a[i]){
				dotAt = i;
			}
		}
		char[] aa = new char[quoAt];
		for(int i=0;i<quoAt;i++){
			aa[i] = a[i];
		}
		
		char[] bb = new char[dotAt-quoAt-1];
		for(int i=quoAt+1, j=0;
				i<dotAt; 
				i++,j++){
			bb[j] = a[i];
		}
		
		
		System.out.println(new String(a));
		//char[] arr = str.toCharArray();
	}
}
