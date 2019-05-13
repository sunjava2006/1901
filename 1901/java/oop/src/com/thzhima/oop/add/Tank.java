package com.thzhima.oop.add;

import com.thzhima.oop.extend.Student;
import com.thzhima.oop.extend.*;

public class Tank {

	 public static void main(String[] args) {
		 Bird b = new Bird();
		 com.thzhima.oop.add.Student ss = new com.thzhima.oop.add.Student();
		 
			Student s = new Student("张方", "女", "南京大学");
//			s.name = "张明";
//			s.gender = "男";
			
			System.out.println(s.name);
			System.out.println(s.gender);
			
			s.work();
			s.study();
		}
	 
	
}



class Plane{
	
}
