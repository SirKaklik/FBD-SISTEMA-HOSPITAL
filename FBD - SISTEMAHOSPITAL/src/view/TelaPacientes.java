package view;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaPacientes extends JFrame{
	
	JButton voltarBttn;
	JComboBox<String> ID;
	JLabel tipoSangLabel, nomeLabel, telefoneLabel, CEPLabel, dataNascLabel, problemasLabel, AlergiaLabel, xLabel, fundoLabel;
	
	
	
	public TelaPacientes() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		super("Paciente");
		setSize(520, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setResizable(false);
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		ID = new JComboBox<String>();
		ID.setBounds(240, 2, 150, 30);
		
		tipoSangLabel = new JLabel("AB");
		tipoSangLabel.setBounds(418, 264, 200, 20);
		
		nomeLabel = new JLabel("NOME");
		nomeLabel.setBounds(47, 42, 200, 20);
		
		telefoneLabel = new JLabel("11111111111");
		telefoneLabel.setBounds(30, 82, 200, 20);
		
		CEPLabel = new JLabel("11111-111");
		CEPLabel.setBounds(140, 82, 200, 20);
		
		dataNascLabel = new JLabel("11/11/1111");
		dataNascLabel.setBounds(74, 107, 200, 20);
		
		problemasLabel = new JLabel("NADA");
		problemasLabel.setBounds(27, 162, 200, 20);
		
		AlergiaLabel = new JLabel("NADA");
		AlergiaLabel.setBounds(24, 262, 200, 20);
		
		xLabel = new JLabel("X");
		xLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		
		voltarBttn = new JButton("Voltar");
		voltarBttn.setBounds(200, 320, 100, 30);
		
		add(ID);
		add(nomeLabel);
		add(CEPLabel);
		add(AlergiaLabel);
		add(dataNascLabel);
		add(telefoneLabel);
		add(problemasLabel);
		add(tipoSangLabel);
		add(xLabel);
		add(voltarBttn);
	
		setVisible(true);
		
	}


	public JComboBox<String> getID() {
		return ID;
	}



	public JLabel getTipoSangLabel() {
		return tipoSangLabel;
	}



	public JLabel getNomeLabel() {
		return nomeLabel;
	}



	public JLabel getTelefoneLabel() {
		return telefoneLabel;
	}



	public JLabel getCEPLabel() {
		return CEPLabel;
	}



	public JLabel getDataNascLabel() {
		return dataNascLabel;
	}



	public JLabel getProblemasLabel() {
		return problemasLabel;
	}



	public JLabel getAlergiaLabel() {
		return AlergiaLabel;
	}



	public JLabel getxLabel() {
		return xLabel;
	}



	public JLabel getFundoLabel() {
		return fundoLabel;
	}


	public JButton getVoltarBttn() {
		return voltarBttn;
	}
	
}
