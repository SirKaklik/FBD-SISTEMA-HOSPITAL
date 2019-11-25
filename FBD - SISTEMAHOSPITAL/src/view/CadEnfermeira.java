package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadEnfermeira extends JFrame{
	JButton voltarBttn, salvarBttn;
	JTextField nomeLabel, CPFLabel, rgLabel, iD;
	private JLabel fundoLabel;
	
	public CadEnfermeira()  {
		super("Funcionario Info");
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
		CPFLabel = new JTextField(20);
		CPFLabel.setBounds(40, 85, 200, 20);
		rgLabel = new JTextField(20);
		rgLabel.setBounds(40, 132, 200, 20);
		
		add(nomeLabel);
		add(CPFLabel);
		add(rgLabel);
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

	public JTextField getCPFLabel() {
		return CPFLabel;
	}

	public JTextField getRgLabel() {
		return rgLabel;
	}
	
	public JLabel getFundoLabel() {
		return fundoLabel;
	}

	public JButton getSalvarBttn() {
		return salvarBttn;
	}
}
