package com.thzhima.inner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JFrame{
	App(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("我的第一个图形程序");
		
		JPanel panel = new JPanel();
		this.setContentPane(panel);
		panel.setLayout(null);
		
		JButton btn = new JButton("点我");
		btn.setSize(100, 75);
		btn.setLocation(100, 100);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		panel.add(btn);
		
		this.setSize(1800, 600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		App  app = new App();
	}
}
