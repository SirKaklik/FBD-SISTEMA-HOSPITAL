package model;

import javax.swing.ImageIcon;

public class Recursos {

	ImageIcon loginBonecoIcon, tempM, tempR, hosptZin, fundoBoard, telaPaciente, telaConsulta,
	telaLaudo, telaTriagem, coresHelp, telaFuncionario, telaMedico, cadFunc, cadMed;
	
	public Recursos() {
		
		loginBonecoIcon = new ImageIcon(getClass().getResource("/loginboneco.png"));
		tempM = new ImageIcon(getClass().getResource("/tempM.png"));
		tempR = new ImageIcon(getClass().getResource("/tempR.png"));
		hosptZin = new ImageIcon(getClass().getResource("/hosptzin.png"));
		fundoBoard = new ImageIcon(getClass().getResource("/fundoBoard.jpg"));
		
		telaPaciente = new ImageIcon(getClass().getResource("/telaPaciente.png"));
		telaConsulta = new ImageIcon(getClass().getResource("/telaConsulta.png"));
		telaLaudo = new ImageIcon(getClass().getResource("/telaLaudo.png"));
		telaTriagem = new ImageIcon(getClass().getResource("/telaTriagem.png"));
		telaFuncionario = new ImageIcon(getClass().getResource("/telaFuncionario.png"));
		telaMedico = new ImageIcon(getClass().getResource("/telaMedico.png"));
		cadFunc = new ImageIcon(getClass().getResource("/cadFunc.png"));
		cadMed = new ImageIcon(getClass().getResource("/cadMed.png"));
	}

	public ImageIcon getLoginBonecoIcon() {
		return loginBonecoIcon;
	}

	public ImageIcon getTempM() {
		return tempM;
	}

	public ImageIcon getTempR() {
		return tempR;
	}

	public ImageIcon getHosptZin() {
		return hosptZin;
	}

	public ImageIcon getFundoBoard() {
		return fundoBoard;
	}

	public ImageIcon getTelaPaciente() {
		return telaPaciente;
	}

	public ImageIcon getTelaConsulta() {
		return telaConsulta;
	}

	public ImageIcon getTelaLaudo() {
		return telaLaudo;
	}

	public ImageIcon getTelaTriagem() {
		return telaTriagem;
	}

	public ImageIcon getCoresHelp() {
		return coresHelp;
	}

	public ImageIcon getTelaFuncionario() {
		return telaFuncionario;
	}

	public ImageIcon getTelaMedico() {
		return telaMedico;
	}

	public ImageIcon getCadFunc() {
		return cadFunc;
	}

	public ImageIcon getCadMed() {
		return cadMed;
	}
	
}
