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
	JLabel tipoSangLabel, nomeLabel, telefoneLabel, dataNascLabel, problemasLabel, AlergiaLabel, fundoLabel;
	
	
	
	public TelaPacientes(){
		super("Paciente");
		setSize(520, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		ID = new JComboBox<String>();
		ID.setBounds(240, 2, 150, 30);

		nomeLabel = new JLabel("NOME");
		nomeLabel.setBounds(47, 42, 200, 20);
		
		telefoneLabel = new JLabel("11111111111");
		telefoneLabel.setBounds(30, 82, 200, 20);
		
		dataNascLabel = new JLabel("11/11/1111");
		dataNascLabel.setBounds(74, 107, 200, 20);
		
		problemasLabel = new JLabel("NADA");
		problemasLabel.setBounds(27, 115, 200, 180);
		
		voltarBttn = new JButton("Voltar");
		voltarBttn.setBounds(200, 330, 100, 30);
		
		add(ID);
		add(nomeLabel);
		add(dataNascLabel);
		add(telefoneLabel);
		add(problemasLabel);
		add(voltarBttn);
	
		setVisible(false);
		
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


	public JLabel getDataNascLabel() {
		return dataNascLabel;
	}



	public JLabel getProblemasLabel() {
		return problemasLabel;
	}



	public JLabel getAlergiaLabel() {
		return AlergiaLabel;
	}


	public JLabel getFundoLabel() {
		return fundoLabel;
	}


	public JButton getVoltarBttn() {
		return voltarBttn;
	}
	
}
