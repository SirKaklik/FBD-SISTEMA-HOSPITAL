package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaPacientes extends JFrame{
	
	JButton salvarBttn, cancelarBttn, limparBttn;
	JComboBox<String> ID;
	JLabel tipoSangLabel, nomeLabel, telefoneLabel, CEPLabel, dataNascLabel, problemasLabel, AlergiaLabel, xLabel, fundoLabel;
	
	
	
	public TelaPacientes() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		super("Paciente");
		setSize(530, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		ID = new JComboBox<String>();
		ID.setBounds(240, 0, 150, 30);
		
		tipoSangLabel = new JLabel("AB");
		tipoSangLabel.setBounds(418, 260, 200, 20);
		
		nomeLabel = new JLabel("NOME");
		nomeLabel.setBounds(47, 40, 200, 20);
		
		telefoneLabel = new JLabel("11111111111");
		telefoneLabel.setBounds(30, 80, 200, 20);
		
		CEPLabel = new JLabel("11111-111");
		CEPLabel.setBounds(140, 80, 200, 20);
		
		dataNascLabel = new JLabel("11/11/1111");
		dataNascLabel.setBounds(74, 105, 200, 20);
		
		problemasLabel = new JLabel("NADA");
		problemasLabel.setBounds(27, 160, 200, 20);
		
		AlergiaLabel = new JLabel("NADA");
		AlergiaLabel.setBounds(24, 260, 200, 20);
		
		xLabel = new JLabel("X");
		xLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		
		
		add(ID);
		add(nomeLabel);
		add(CEPLabel);
		add(AlergiaLabel);
		add(dataNascLabel);
		add(telefoneLabel);
		add(problemasLabel);
		add(tipoSangLabel);
		add(xLabel);
	
		setVisible(true);
		
	}



	public JButton getSalvarBttn() {
		return salvarBttn;
	}



	public JButton getCancelarBttn() {
		return cancelarBttn;
	}



	public JButton getLimparBttn() {
		return limparBttn;
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
	
}
