package app;

import javax.swing.UnsupportedLookAndFeelException;

import controll.Controller;

public class App {
	public static void main(String[] args) {
		try {
			new Controller();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			
			e.printStackTrace();
		}
		
	}
}
