package com.jpetstore.ui;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
		
	private double screenWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	private double screenHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
	public MyFrame(String title, int width, int height) {
			
		super(title);
			
		setSize(width, height);
		int x = (int) (screenWidth - width) / 2;
		int y = (int) (screenHeight - height) / 2;
		setLocation(x, y);
			
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
	}
}

