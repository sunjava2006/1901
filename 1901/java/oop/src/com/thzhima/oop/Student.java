package com.thzhima.oop;

import java.awt.Toolkit;

public class Student {
    int age ;
    String gender;
    String name;
    
    public Student(String name,int age,String gender) {
    	this.name=name;
    	this.age=age;
    	this.gender=gender;
    	
    }
    
    public Student() {

    }
    
    public void sing() {
    	System.out.println("sing.....");
    	Toolkit k = Toolkit.getDefaultToolkit();
    	k.beep();
    	k.beep();
    	k.beep();
    }
    
    public void sing(String word) {
    	System.out.println("sing " + word);
    }
    
    public void dance() {
    	System.out.println("dance");
    }
    
    public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="李小光";
		s1.age =20;
		s1.gender = "男";
		
		s1.dance();
		s1.sing();
		
		
		Student s2 = new Student("李清", 22, "女");
		s2.sing();
		s2.sing("good morning");
		s2.sing("nice");
		
		
	}
}
