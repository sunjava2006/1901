package com.thzhima.inner;

import com.thzhima.oop.extend.Student;

public class School {

	Student gs = new Student();
	
	Student ss = new Student() {
		public void study() {
			System.out.println("��ͬ��ѧ����ʽ��");
		}
	};
	
	Student ss2 = new Student() {
		public void study() {
			System.out.println("��ͬ��ѧ����ʽ��");
		}
	};
	
	Student ss3 = new SpecStudent();
	Student ss4 = new SpecStudent();
	Student ss5 = new SpecStudent();
	Student ss6 = new SpecStudent();
	
	
}

class SpecStudent extends Student{
	public void study() {
		System.out.println("��ͬ��ѧ����ʽ��");
	}
}
