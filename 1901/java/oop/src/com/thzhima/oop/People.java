package com.thzhima.oop;

public class People {
    public String gender ; // ����ֵ�ĳ�ʼ��
    float height ;
    String name; // ȱʡ��ʼ��
    
    {
    	gender = "x";
    	System.out.println();
    }
    
    // ���췽����������:������ͬ����û�ķ������͡�
    public  People(String gender, String name) {
    	this.gender = gender;
    	this.name = name;
    }
    
    // Ĭ�Ϲ��죬��һ�����У�����û�ж����κι��������¡�
    //��������Ϊ�����Զ��Ĵ�����һ�����캯����
    // һ�������Լ����幹�죬Ĭ�Ϲ���Ͳ������ˡ�
    public People() {
    	name = "Li Xin";
    	gender = "male";
    	height = 2.0F;
    	
    }
    
    
    public void work() {// ���ܡ�����
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
