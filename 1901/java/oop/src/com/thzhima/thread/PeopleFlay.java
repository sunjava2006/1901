package com.thzhima.thread;

public  class PeopleFlay extends People implements Fly1 {
    public PeopleFlay(String g) {
		super(g);
		// TODO Auto-generated constructor stub
	}
	String chibang = "youchibang";
	@Override
	public final void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly¡£¡£¡£");
	}
	public static void main(String[] args) {
		PeopleFlay s1 = new PeopleFlay("");
		s1.name = "feiren";
		System.out.println(s1.name);
		s1.fly();
	}


}
