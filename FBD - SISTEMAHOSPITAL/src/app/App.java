package app;

import java.text.ParseException;

import javax.swing.UnsupportedLookAndFeelException;

import controll.Controller;

public class App {
	public static void main(String[] args) {
		try {
			new Controller();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException | ParseException e) {
			
			e.printStackTrace();
		}
		
	}
}
