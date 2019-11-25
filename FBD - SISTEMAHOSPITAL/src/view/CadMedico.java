package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadMedico extends JFrame{
	JButton voltarBttn, salvarBttn;
	JTextField nomeLabel, espLabel, teleLabel, iD;
	private JLabel fundoLabel;
	
	public CadMedico()  {
		super("Cadastro Medico");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		salvarBttn = new JButton("Salvar");
		salvarBttn.setBounds(106, 10, 100, 30);
		voltarBttn = new JButton("Cancelar");
		voltarBttn.setBounds(208, 10, 100, 30);
		
		nomeLabel = new JTextField(20);
		nomeLabel.setBounds(40, 45, 300, 20);
		espLabel = new JTextField(20);
		espLabel.setBounds(100, 87, 200, 20);
		teleLabel = new JTextField(20);
		teleLabel.setBounds(75, 135, 200, 20);
		
		add(nomeLabel);
		add(espLabel);
		add(teleLabel);
		add(voltarBttn);
		add(salvarBttn);
		
		
		setVisible(false);
	}

	public JButton getVoltarBttn() {
		return voltarBttn;
	}

	public JTextField getNomeLabel() {
		return nomeLabel;
	}

	public JTextField getEspLabel() {
		return espLabel;
	}

	public JTextField getTeleLabel() {
		return teleLabel;
	}

	public JLabel getFundoLabel() {
		return fundoLabel;
	}

	public JButton getSalvarBttn() {
		return salvarBttn;
	}
}
