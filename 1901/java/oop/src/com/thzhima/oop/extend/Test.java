package com.thzhima.oop.extend;

public class Test {

	public static void main(String[] args) {
		Human xiaoLi =  null;
		
		if(Math.random()*10>5) {
			xiaoLi = new Student();
		}else {
			xiaoLi = new Worker();
		}
		
		xiaoLi.work();
		System.out.println(xiaoLi.name);
		
		if(xiaoLi instanceof Student) {
			Student s = (Student)xiaoLi;
			System.out.println(s.school);
			s.study();
		}
		
		if(xiaoLi instanceof Worker) {
			Worker w = (Worker)xiaoLi;
			System.out.println(w.name);
		}
		
		
		
		
	}

}
