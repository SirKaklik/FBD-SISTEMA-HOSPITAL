package controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;

import javax.swing.UnsupportedLookAndFeelException;

import exceptions.ExceptionGeral;
import model.Atendente;
import model.Auxiliares;
import model.Consulta;
import model.Laudo;
import model.Medico;
import model.Paciente;
import model.Recursos;
import model.fachada.Fachada;
import model.fachada.IFachada;
import view.CadAtendente;
import view.CadEnfermeira;
import view.CadMedico;
import view.DashBoard;
import view.TelaConsulta;
import view.TelaFuncionario;
import view.TelaLaudo;
import view.TelaLogin;
import view.TelaMedico;
import view.TelaPacientes;


public class Controller implements ActionListener{

	private TelaLogin telaLogin;
	private Recursos rec;
	private DashBoard board;
	private TelaPacientes telaPac;
	private TelaConsulta telaCon;
	private TelaLaudo telaLaudo;
	private TelaFuncionario telaFunc;
	private TelaMedico telaMed;
	private CadAtendente cadAtend;
	private CadEnfermeira cadEnfe;
	private CadMedico cadMed;
	IFachada fachada;
	
	public Controller() throws ExceptionGeral {
		fachada = Fachada.getInstance();
		telaLogin = new TelaLogin();
		board = new DashBoard();
		telaPac = new TelaPacientes();
		telaCon = new TelaConsulta();
		telaLaudo = new TelaLaudo();
		telaFunc = new TelaFuncionario();
		telaMed = new TelaMedico();
		cadAtend = new CadAtendente();
		cadEnfe = new CadEnfermeira();
		cadMed = new CadMedico();
		rec = new Recursos();
		montarTelaLogin();
		montarTelaDashBoard();
		montarTelaPaciente();
		montarTelaConsulta();
		montartelaLaudo();
		montarTelaFuncionario();
		montarTelaMed();
		montarCadAtend();
		montarCadEnfe();
		montarCadMed();
		control();
		
		
	}
	private void montarCadAtend() throws ExceptionGeral {
		cadAtend.getFundoLabel().setIcon(rec.getCadFunc());

	}
	private void montarCadEnfe() throws ExceptionGeral {
		cadEnfe.getFundoLabel().setIcon(rec.getCadFunc());
//		cadEnfe.getNomeLabel().setText(fachada.buscarIDAuxiliares(fachada.getAllAuxiliares().size()).getNome());
//		cadEnfe.getCPFLabel().setText(fachada.buscarIDAuxiliares(fachada.getAllAuxiliares().size()).getCpf());
//		cadEnfe.getRgLabel().setText(fachada.buscarIDAuxiliares(fachada.getAllAuxiliares().size()).getRg());
	}
	
	private void montarCadMed() throws ExceptionGeral {
		cadMed.getFundoLabel().setIcon(rec.getCadMed());
	}
	
	
	private void montarTelaFuncionario() throws ExceptionGeral {
		telaFunc.getFundoLabel().setIcon(rec.getTelaFuncionario());
		telaFunc.getiD().setText(String.valueOf((fachada.buscarIDAuxiliares(fachada.getAllAuxiliares().size()).getId())));
		telaFunc.getNomeLabel().setText(fachada.buscarIDAuxiliares(fachada.getAllAuxiliares().size()).getNome());
		telaFunc.getCPFLabel().setText(fachada.buscarIDAuxiliares(fachada.getAllAuxiliares().size()).getCpf());
		telaFunc.getRgLabel().setText(fachada.buscarIDAuxiliares(fachada.getAllAuxiliares().size()).getRg());
		telaFunc.revalidate();
		telaFunc.repaint();
	}
	
	private void montarTelaMed() throws ExceptionGeral {
		telaMed.getFundoLabel().setIcon(rec.getTelaMedico());
		telaMed.getiD().setText(String.valueOf(fachada.buscarIDMedico(fachada.getAllMedico().size()).getId()));
		telaMed.getNomeLabel().setText(fachada.buscarIDMedico(fachada.getAllMedico().size()).getNome());
		telaMed.getEspLabel().setText(fachada.buscarIDMedico(fachada.getAllMedico().size()).getEspecialidade());
		telaMed.getTeleLabel().setText(fachada.buscarIDMedico(fachada.getAllMedico().size()).getTelefone());
		telaMed.revalidate();
		telaMed.repaint();
	}
	
	private void montartelaLaudo() throws ExceptionGeral {
		telaLaudo.getFundoLabel().setIcon(rec.getTelaLaudo());
			for(int i = 1; i<= fachada.getAllPaciente().size(); i++) {
				telaLaudo.getID().addItem(String.valueOf(i));
			}
		
		attTelaLaudo();
	}
	
	private void attTelaLaudo() throws ExceptionGeral {
		telaLaudo.getNomeLabel().setText(fachada.buscarIDPaciente(telaLaudo.getID().getSelectedIndex()+1).getNome());
		telaLaudo.getTelefoneLabel().setText(fachada.buscarIDPaciente(telaLaudo.getID().getSelectedIndex()+1).getTelefone());
		telaLaudo.getDataNascLabel().setText(fachada.buscarIDPaciente(telaLaudo.getID().getSelectedIndex()+1).getData_nascimento());
//		if(fachada.getAllLaudo().size() > 0) {
//			telaLaudo.getArea().append(fachada.buscarIDLaudo(telaLaudo.getID().getSelectedIndex()).getLaudo());			
//		}
		telaPac.revalidate();
		telaPac.repaint();
	}
	
	private void montarTelaConsulta() throws ExceptionGeral {
		telaCon.getIdLabel().setText(String.valueOf(fachada.getAllPaciente().size()+1));
		telaCon.getFundoLabel().setIcon(rec.getTelaConsulta());
		for(int i = 2019; i >= 1909; i--) {
			telaCon.getAno().addItem(String.valueOf(i));	
		}
		for(int i = 1; i <= 12; i++) {
			telaCon.getMes().addItem(String.valueOf(i));	
		}
		
		for(int i = 1; i <= 31; i++) {
			telaCon.getDia().addItem(String.valueOf(i));	
		}
		telaCon.getEstados().addItem("AC");
		telaCon.getEstados().addItem("AL");
		telaCon.getEstados().addItem("AP");
		telaCon.getEstados().addItem("AM");
		telaCon.getEstados().addItem("BA");	 
		telaCon.getEstados().addItem("CE"); 
		telaCon.getEstados().addItem("DF");
		telaCon.getEstados().addItem("ES"); 
		telaCon.getEstados().addItem("GO");
		telaCon.getEstados().addItem("MA");
		telaCon.getEstados().addItem("MT");
		telaCon.getEstados().addItem("MS");
		telaCon.getEstados().addItem("MG");
		telaCon.getEstados().addItem("PA");
		telaCon.getEstados().addItem("PB");
		telaCon.getEstados().addItem("PR");
		telaCon.getEstados().addItem("PE");
		telaCon.getEstados().addItem("PI");
		telaCon.getEstados().addItem("RJ");
		telaCon.getEstados().addItem("RN"); 
		telaCon.getEstados().addItem("RS"); 
		telaCon.getEstados().addItem("RO");
		telaCon.getEstados().addItem("RR"); 
		telaCon.getEstados().addItem("SC");
		telaCon.getEstados().addItem("SP");
		telaCon.getEstados().addItem("SE");
		telaCon.getEstados().addItem("TO");
		
		
	}
	
	private void limparTelaConsulta() {
		telaCon.getNome().setText("");
		telaCon.getRua().setText("");
		telaCon.getNumero().setText("");
		telaCon.getMunicipio().setText("");
		telaCon.getTelef().setText("");
		telaCon.getCEP().setText("");
		telaCon.getQueixa().setText("");
		telaCon.getEstados().setSelectedIndex(0);
		telaCon.getAno().setSelectedIndex(0);
		telaCon.getMes().setSelectedIndex(0);
		telaCon.getDia().setSelectedIndex(0);
	}
	private void attTelaConsulta() throws ExceptionGeral {
		telaCon.getIdLabel().setText(String.valueOf(fachada.getAllPaciente().size()+1));
		telaCon.revalidate();
		telaCon.repaint();
		
	}
	
	private void montarTelaDashBoard() throws ExceptionGeral {
		board.getNumeroFuncionariosDisponivesLabel().setText(String.valueOf(fachada.getAllAuxiliares().size()));
		board.getNumeroTotalPacientesAtendidosLabel().setText(String.valueOf(fachada.getAllPaciente().size()));
		board.getTempoBaixoLabel().setIcon(rec.getTempR());
		board.getTempoMedioLabel().setIcon(rec.getTempM());
		board.getFotoLabel().setIcon(rec.getHosptZin());
		board.getFundoLabel().setIcon(rec.getFundoBoard());
		
		
	}
	
	private void attDashBoard() throws ExceptionGeral {
		board.getNumeroFuncionariosDisponivesLabel().setText(String.valueOf(fachada.getAllAuxiliares().size()));
		board.getNumeroTotalPacientesAtendidosLabel().setText(String.valueOf(fachada.getAllPaciente().size()));
		board.revalidate();
		board.repaint();
	}
	
	private void montarTelaLogin(){
		telaLogin.getBonecoLabel().setIcon(rec.getLoginBonecoIcon());
	}
	
	private void montarTelaPaciente() throws ExceptionGeral{
		telaPac.getFundoLabel().setIcon(rec.getTelaPaciente());
		for(int i = 1; i<= fachada.getAllPaciente().size(); i++) {
			telaPac.getID().addItem(String.valueOf(i));
		}
		attTelaPaciente();
		
	}
	public void attTelaPaciente() throws ExceptionGeral {
		telaPac.getNomeLabel().setText(fachada.buscarIDPaciente(telaPac.getID().getSelectedIndex()+1).getNome());
		telaPac.getTelefoneLabel().setText(fachada.buscarIDPaciente(telaPac.getID().getSelectedIndex()+1).getTelefone());
		telaPac.getDataNascLabel().setText(fachada.buscarIDPaciente(telaPac.getID().getSelectedIndex()+1).getData_nascimento());
		telaPac.getProblemasLabel().setText("<html><p style=\"width:400px\">"+fachada.buscarIDPaciente(telaPac.getID().getSelectedIndex()+1).getQueixa()+"</p></html>");
		telaPac.revalidate();
		telaPac.repaint();
	}
	
	private void control() {
		telaLogin.getAceitarBttn().addActionListener(this);
		telaLogin.getSairBttn().addActionListener(this);
		board.getVoltarBttn().addActionListener(this);
		board.getFuncionarioBttn().addActionListener(this);
		board.getConsultaBttn().addActionListener(this);
		board.getPacientesBttn().addActionListener(this);
		board.getLaudoBttn().addActionListener(this);
		board.getMedFuncionarioBttn().addActionListener(this);
		board.getCadastrarAtendente().addActionListener(this);
		board.getCadastrarEnfermeira().addActionListener(this);
		board.getCadastrarMedico().addActionListener(this);
		telaCon.getSalvarBttn().addActionListener(this);
		telaCon.getLimparBttn().addActionListener(this);
		telaCon.getCancelarBttn().addActionListener(this);
		telaPac.getID().addActionListener(this);
		telaPac.getVoltarBttn().addActionListener(this);
		telaLaudo.getID().addActionListener(this);
		telaLaudo.getSalvarBttn().addActionListener(this);
		telaLaudo.getCancelarBttn().addActionListener(this);
		cadAtend.getSalvarBttn().addActionListener(this);
		cadMed.getSalvarBttn().addActionListener(this);
		cadEnfe.getSalvarBttn().addActionListener(this);
		cadAtend.getVoltarBttn().addActionListener(this);
		cadMed.getVoltarBttn().addActionListener(this);
		cadEnfe.getVoltarBttn().addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(telaLogin.getSairBttn())) {
			System.exit(0);
		}
		if(e.getSource().equals(telaLogin.getAceitarBttn())) {
			if(telaLogin.getLoginField().getText().equalsIgnoreCase("admin") && (telaLogin.getSenhaField().getText().equalsIgnoreCase("admin"))) {
				board.getOpsPanel().add(board.getLaudoBttn());
				board.getOpsPanel().add(board.getFuncionarioBttn());
				board.getOpsPanel().add(board.getMedFuncionarioBttn());
				board.getOpsPanel().add(board.getPacientesBttn());
				board.getOpsPanel().add(board.getConsultaBttn());
				board.getOpsPanel().add(board.getVoltarBttn());
				board.revalidate();
				board.repaint();
				telaLogin.setVisible(false);
				board.setVisible(true);
			}
			if(telaLogin.getLoginField().getText().equalsIgnoreCase("1")) {
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
				board.getOpsPanel().add(board.getFuncionarioBttn());
				board.getOpsPanel().add(board.getPacientesBttn());
				board.getOpsPanel().add(board.getVoltarBttn());
				board.revalidate();
				board.repaint();
				telaLogin.setVisible(false);
				board.setVisible(true);
			}
			if(telaLogin.getLoginField().getText().equalsIgnoreCase("3")) {
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
	
		if(e.getSource().equals(board.getMedFuncionarioBttn())) {
			telaMed.setVisible(true);
		}
		if(e.getSource().equals(board.getCadastrarAtendente())) {
			cadAtend.setVisible(true);
		}
		if(e.getSource().equals(board.getCadastrarEnfermeira())){
			cadEnfe.setVisible(true);
		}
		if(e.getSource().equals(board.getCadastrarMedico())) {
			cadMed.setVisible(true);
		}
		//telas individuais
			//consulta
		if(e.getSource().equals(telaCon.getSalvarBttn())) {
			String sexo;
			if(telaCon.getMasculino().isSelected()) {
				sexo = "masculino";
			}
			else{sexo = "feminino";}
			try {
				fachada.salvarEditarConsulta(new Consulta("normal", String.valueOf(fachada.getAllPaciente().size()+1)));
			} catch (ExceptionGeral e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			fachada.salvarEditarPaciente(new Paciente(telaCon.getNome().getText(), telaCon.getRua().getText(), telaCon.getTelef().getText(), telaCon.getEstados().getSelectedItem().toString(),
					telaCon.getMunicipio().getText(), telaCon.getCEP().getText(), "", "", sexo,
					telaCon.getQueixa().getText(),
					telaCon.getDia().getSelectedItem().toString()+'\''+telaCon.getMes().getSelectedItem().toString()+'\''+telaCon.getAno().getSelectedItem().toString(),
					telaCon.getNumero().toString()));
			limparTelaConsulta();
			try {
				attTelaConsulta();
				attDashBoard();
				attTelaPaciente();
				telaPac.getID().addItem(String.valueOf(fachada.getAllPaciente().size()));
				attTelaLaudo();
			
				
			} catch (ExceptionGeral e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if(e.getSource().equals(telaCon.getLimparBttn())) {
			limparTelaConsulta();
		}
		if(e.getSource().equals(telaCon.getCancelarBttn())) {
			limparTelaConsulta();
			telaCon.setVisible(false);
		}
			//Paciente
		if(e.getSource().equals(telaPac.getVoltarBttn())) {
			telaPac.revalidate();
			telaPac.repaint();
			telaPac.setVisible(false);
		}
		if(e.getSource().equals(telaPac.getID())) {
			try {
				attTelaPaciente();
			} catch (ExceptionGeral e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
			//laudo
		if(e.getSource().equals(telaLaudo.getID())) {
			try {
				attTelaLaudo();
			} catch (ExceptionGeral e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource().equals(telaLaudo.getSalvarBttn())) {
			fachada.salvarEditarLaudo(new Laudo(telaLaudo.getArea().getText()));
			try {
				attTelaLaudo();
			} catch (ExceptionGeral e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource().equals(telaLaudo.getCancelarBttn())) {
			telaLaudo.getArea().selectAll();
			telaLaudo.getArea().replaceSelection("");
			telaLaudo.setVisible(false);
		}
			//cadastros
		if(e.getSource().equals(cadAtend.getSalvarBttn())) {
			try {
				fachada.salvarEditarAtendente(new Atendente(cadAtend.getCPFLabel().getText(), cadAtend.getRgLabel().getText(), cadAtend.getNomeLabel().getText()));
			} catch (ExceptionGeral e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			cadAtend.getCPFLabel().setText("");
			cadAtend.getRgLabel().setText("");
			cadAtend.getNomeLabel().setText("");
			try {
				attDashBoard();
				montarTelaFuncionario();
			} catch (ExceptionGeral e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			cadAtend.revalidate();
			cadAtend.repaint();
			
		}
		if(e.getSource().equals(cadEnfe.getSalvarBttn())) {
			fachada.salvarEditarAuxiliares(new Auxiliares(cadEnfe.getCPFLabel().getText(), cadEnfe.getRgLabel().getText(), cadEnfe.getNomeLabel().getText()));
			cadEnfe.getCPFLabel().setText("");
			cadEnfe.getRgLabel().setText("");
			cadEnfe.getNomeLabel().setText("");
			try {
				attDashBoard();
				montarTelaFuncionario();
			} catch (ExceptionGeral e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			cadEnfe.revalidate();
			cadEnfe.repaint();
		}
		if(e.getSource().equals(cadMed.getSalvarBttn())) {
			fachada.salvarEditarMedico(new Medico(cadMed.getEspLabel().getText(), cadMed.getTeleLabel().getText(), cadMed.getNomeLabel().getText()));
			cadMed.getEspLabel().setText("");
			cadMed.getTeleLabel().setText("");
			cadMed.getNomeLabel().setText("");
			try {
				attDashBoard();
				montarTelaMed();
			} catch (ExceptionGeral e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			cadMed.revalidate();
			cadMed.repaint();
		}
		
		if(e.getSource().equals(cadAtend.getVoltarBttn())) {
			cadAtend.getCPFLabel().setText("");
			cadAtend.getRgLabel().setText("");
			cadAtend.getNomeLabel().setText("");
			cadAtend.revalidate();
			cadAtend.repaint();
			cadAtend.setVisible(false);
		}
		if(e.getSource().equals(cadEnfe.getVoltarBttn())) {
			cadEnfe.getCPFLabel().setText("");
			cadEnfe.getRgLabel().setText("");
			cadEnfe.getNomeLabel().setText("");
			cadEnfe.revalidate();
			cadEnfe.repaint();
			cadEnfe.setVisible(false);
		}
		if(e.getSource().equals(cadMed.getVoltarBttn())) {
			cadMed.getEspLabel().setText("");
			cadMed.getTeleLabel().setText("");
			cadMed.getNomeLabel().setText("");
			cadMed.revalidate();
			cadMed.repaint();
			cadMed.setVisible(false);
		}
	}

	public TelaLogin getTelaLogin() {
		return telaLogin;
	}
	public Recursos getRec() {
		return rec;
	}
	public DashBoard getBoard() {
		return board;
	}
	public TelaPacientes getTelaPac() {
		return telaPac;
	}
	public TelaConsulta getTelaCon() {
		return telaCon;
	}
	public TelaLaudo getTelaLaudo() {
		return telaLaudo;
	}
	public TelaFuncionario getTelaFunc() {
		return telaFunc;
	}
	public TelaMedico getTelaMed() {
		return telaMed;
	}
	public IFachada getFachada() {
		return fachada;
	}
	

}
