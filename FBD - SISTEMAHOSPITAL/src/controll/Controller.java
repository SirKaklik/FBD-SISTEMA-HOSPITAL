package controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UnsupportedLookAndFeelException;

import model.Recursos;
import view.DashBoard;
import view.TelaLogin;

public class Controller implements ActionListener {

	private TelaLogin telaLogin;
	private Recursos rec;
	private DashBoard board;
	
	public Controller() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		telaLogin = new TelaLogin();
		board = new DashBoard();
		rec = new Recursos();
		montarTelaLogin();
		montarTelaDashBoard();
		control();
		
		
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
