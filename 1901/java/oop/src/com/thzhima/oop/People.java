package com.thzhima.oop;

public class People {
    public String gender ; // 属性值的初始化
    float height ;
    String name; // 缺省初始化
    
    {
    	gender = "x";
    	System.out.println();
    }
    
    // 构造方法（函数）:与类名同名，没的返回类型。
    public  People(String gender, String name) {
    	this.gender = gender;
    	this.name = name;
    }
    
    // 默认构造，在一个类中，我们没有定义任何构造的情况下。
    //编译器会为我们自动的创建的一个构造函数。
    // 一但我们自己定义构造，默认构造就不存在了。
    public People() {
    	name = "Li Xin";
    	gender = "male";
    	height = 2.0F;
    	
    }
    
    
    public void work() {// 功能、方法
    	System.out.println("working.......");
    }
    
    public void eat() {
    	System.out.println("eating...");
    }
    
    int add (int a, int b){
    	return a + b;
    }
    
    void add (String a, int b){
    	String c=  a + b;
    }
    
    
}
