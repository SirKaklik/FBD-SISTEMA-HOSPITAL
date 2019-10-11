package controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.UnsupportedLookAndFeelException;

import model.Recursos;
import view.DashBoard;
import view.TelaConsulta;
import view.TelaFuncionario;
import view.TelaLaudo;
import view.TelaLogin;
import view.TelaPacientes;
import view.TelaTriagem;

public class Controller implements ActionListener {

	private TelaLogin telaLogin;
	private Recursos rec;
	private DashBoard board;
	private TelaPacientes telaPac;
	private TelaConsulta telaCon;
	private TelaTriagem telaTri;
	private TelaLaudo telaLaudo;
	private TelaFuncionario telaFunc;
	
	public Controller() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, ParseException {
		telaLogin = new TelaLogin();
		board = new DashBoard();
		telaPac = new TelaPacientes();
		telaCon = new TelaConsulta();
		telaTri = new TelaTriagem();
		telaLaudo = new TelaLaudo();
		telaFunc = new TelaFuncionario();
		rec = new Recursos();
		montarTelaLogin();
		montarTelaDashBoard();
		montarTelaPaciente();
		montarTelaConsulta();
		montarTelaTriagem();
		montartelaLaudo();
		montarTelaFuncionario();
		control();
		
		
	}
	private void montarTelaFuncionario() {
		telaFunc.getFundoLabel().setIcon(rec.getTelaFuncionario());
	}
	
	private void montartelaLaudo() {
		telaLaudo.getFundoLabel().setIcon(rec.getTelaLaudo());
	}
	
	private void montarTelaTriagem() {
		telaTri.getFundoLabel().setIcon(rec.getTelaTriagem());
	}
	
	private void montarTelaConsulta() {
		telaCon.getFundoLabel().setIcon(rec.getTelaConsulta());
	}
	
	private void montarTelaDashBoard() {
		board.getTempoBaixoLabel().setIcon(rec.getTempR());
		board.getTempoMedioLabel().setIcon(rec.getTempM());
		board.getFotoLabel().setIcon(rec.getHosptZin());
		board.getFundoLabel().setIcon(rec.getFundoBoard());
		
		
	}
	
	private void montarTelaLogin(){
		telaLogin.getBonecoLabel().setIcon(rec.getLoginBonecoIcon());
	}
	
	private void montarTelaPaciente(){
		telaPac.getFundoLabel().setIcon(rec.getTelaPaciente());
	}
	
	private void control() {
		telaLogin.getAceitarBttn().addActionListener(this);
		telaLogin.getSairBttn().addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(telaLogin.getSairBttn())) {
			System.exit(0);
		}
		
	}


}
