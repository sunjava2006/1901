package com.thzhima.thread;

import java.awt.Toolkit;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread t = new MyThread();
		t.start();
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
				   Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		
		t2.start();
		
		
	}
}

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("-------------");
		}
		
	}
}
