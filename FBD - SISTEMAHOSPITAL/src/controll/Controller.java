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
		board.getVoltarBttn().addActionListener(this);
		board.getFuncionarioBttn().addActionListener(this);
		board.getConsultaBttn().addActionListener(this);
		board.getTriagemBttn().addActionListener(this);
		board.getPacientesBttn().addActionListener(this);
		board.getLaudoBttn().addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(telaLogin.getSairBttn())) {
			System.exit(0);
		}
		if(e.getSource().equals(telaLogin.getAceitarBttn())) {
			if(telaLogin.getLoginField().getText().equalsIgnoreCase("0")) {
				board.getOpsPanel().add(board.getTriagemBttn());
				board.getOpsPanel().add(board.getLaudoBttn());
				board.getOpsPanel().add(board.getFuncionarioBttn());
				board.getOpsPanel().add(board.getPacientesBttn());
				board.getOpsPanel().add(board.getConsultaBttn());
				board.getOpsPanel().add(board.getVoltarBttn());
				board.revalidate();
				board.repaint();
				telaLogin.setVisible(false);
				board.setVisible(true);
			}
			if(telaLogin.getLoginField().getText().equalsIgnoreCase("1")) {
				board.getOpsPanel().remove(board.getTriagemBttn());
				board.getOpsPanel().remove(board.getConsultaBttn());
				board.getOpsPanel().add(board.getLaudoBttn());
				board.getOpsPanel().add(board.getFuncionarioBttn());
				board.getOpsPanel().add(board.getPacientesBttn());
				board.getOpsPanel().add(board.getVoltarBttn());
				board.revalidate();
				board.repaint();
				telaLogin.setVisible(false);
				board.setVisible(true);
			}
			if(telaLogin.getLoginField().getText().equalsIgnoreCase("2")) {
				board.getOpsPanel().remove(board.getConsultaBttn());
				board.getOpsPanel().remove(board.getLaudoBttn());
				board.getOpsPanel().add(board.getTriagemBttn());
				board.getOpsPanel().add(board.getFuncionarioBttn());
				board.getOpsPanel().add(board.getPacientesBttn());
				board.getOpsPanel().add(board.getVoltarBttn());
				board.revalidate();
				board.repaint();
				telaLogin.setVisible(false);
				board.setVisible(true);
			}
			if(telaLogin.getLoginField().getText().equalsIgnoreCase("3")) {
				board.getOpsPanel().remove(board.getTriagemBttn());
				board.getOpsPanel().remove(board.getLaudoBttn());
				board.getOpsPanel().add(board.getFuncionarioBttn());
				board.getOpsPanel().add(board.getPacientesBttn());
				board.getOpsPanel().add(board.getConsultaBttn());
				board.getOpsPanel().add(board.getVoltarBttn());
				board.revalidate();
				board.repaint();
				telaLogin.setVisible(false);
				board.setVisible(true);
			}
		
		}
		if(e.getSource().equals(board.getVoltarBttn())) {
			telaLogin.getLoginField().setText("");
			telaLogin.getSenhaField().setText("");
			board.setVisible(false);
			telaLogin.setVisible(true);
			
		}
		if(e.getSource().equals(board.getFuncionarioBttn())) {
			telaFunc.setVisible(true);
			
		}
		if(e.getSource().equals(board.getLaudoBttn())) {
			telaLaudo.setVisible(true);
			
		}
		if(e.getSource().equals(board.getPacientesBttn())) {
			telaPac.setVisible(true);
			
		}
		if(e.getSource().equals(board.getConsultaBttn())) {
			telaCon.setVisible(true);
			
		}
		if(e.getSource().equals(board.getTriagemBttn())) {
			telaTri.setVisible(true);
			
		}
		
	}


}
