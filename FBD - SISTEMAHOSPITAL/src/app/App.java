package app;

import java.text.ParseException;

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

public class App {
	public static void main(String[] args) {
		
		IFachada fachada = Fachada.getInstance();
		
//		Atendente a = new Atendente("100", "110", "Maria");
//		Paciente p = new Paciente("Breno", "Rua Augusto dos Santos Diniz", "996658536", "PB", "Manaíra", "100.599.474-97", "12123", "64654", "Masculino", "DOR", "15/08/1998", 190);	
//		Consulta consulta = new Consulta("reforço", "1");
//		Medico m = new Medico("orto", "123", "joão");
//		Auxiliares a = new Auxiliares("123", "1254", "joca");
		try {
//			fachada.salvarEditarAtendente(a);
//			fachada.salvarEditarPaciente(p);
//			fachada.salvarEditarConsulta(consulta);
//			fachada.salvarEditarMedico(m);
//			fachada.salvarEditarAuxiliares(a);
			System.out.println(fachada.getAllAuxiliares());
			System.out.println(fachada.buscarIDAuxiliares(1).getNome());
			
		
			
			
			new Controller();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException | ParseException | ExceptionGeral e) {
			
			e.printStackTrace();
		}
		
	}
}
