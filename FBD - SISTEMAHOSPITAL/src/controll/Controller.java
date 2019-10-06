package controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UnsupportedLookAndFeelException;

import model.Recursos;
import view.TelaLogin;

public class Controller implements ActionListener {

	private TelaLogin telaLogin;
	private Recursos rec;
	
	public Controller() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		telaLogin = new TelaLogin();
		rec = new Recursos();
		montarTelaLogin();
		control();
		
		
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
