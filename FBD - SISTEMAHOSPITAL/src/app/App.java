package app;

import java.text.ParseException;

import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

import controll.Controller;
import exceptions.ExceptionGeral;
import model.Atendente;
import model.Auxiliares;
import model.Consulta;
import model.Medico;
import model.Paciente;
import model.fachada.Fachada;
import model.fachada.IFachada;

public class App extends Thread{
	
	Controller control;
	
	public App() throws ExceptionGeral {
		control = new Controller();
	}
	
	public void run() {
		try {
			while(true) {
				
				Thread.sleep(500);
				
			}
			
			
		} catch (Exception e) {
			
		}
		}
	
	
	public static void main(String[] args) {
		
		
		try {
			new App().start();;
		} catch (ExceptionGeral e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
