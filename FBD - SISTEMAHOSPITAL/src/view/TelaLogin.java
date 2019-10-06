package view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaLogin extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JLabel bonecoLabel, loginLabel, senhaLabel;
	JButton aceitarBttn, sairBttn;
	JTextField loginField;
	JPasswordField senhaField;
	
	public TelaLogin() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		super("Login");
		setSize(386, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		
		bonecoLabel = new JLabel();
		bonecoLabel.setBounds(20, 10, 137, 145);
		
		loginLabel = new JLabel("Login:");
		loginLabel.setBounds(200, 15, 40, 20);
		senhaLabel = new JLabel("Senha:");
		senhaLabel.setBounds(200, 65, 40, 20);
		
		aceitarBttn = new JButton("Entrar");
		aceitarBttn.setBounds(200, 120, 70, 30);
		sairBttn = new JButton("Sair");
		sairBttn.setBounds(280, 120, 70, 30);
		
		loginField = new JTextField(10);
		loginField.setBounds(200, 35, 150, 25);
		
		senhaField = new JPasswordField(10);
		senhaField.setEchoChar('•');
		senhaField.setBounds(200, 85, 150, 25);
		
		
		add(bonecoLabel);
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(aceitarBttn);
		add(sairBttn);
		
		setVisible(true);
		
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JLabel getBonecoLabel() {
		return bonecoLabel;
	}

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public JButton getAceitarBttn() {
		return aceitarBttn;
	}

	public JButton getSairBttn() {
		return sairBttn;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}
}
