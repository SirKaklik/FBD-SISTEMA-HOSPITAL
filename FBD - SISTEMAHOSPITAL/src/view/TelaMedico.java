package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaMedico extends JFrame{
	
	JButton voltarBttn;
	JLabel nomeLabel, espLabel, teleLabel, iD;
	private JLabel fundoLabel;
	
	public TelaMedico()  {
		super("Medico Info");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		nomeLabel = new JLabel("Nome");
		nomeLabel.setBounds(40, 45, 300, 20);
		espLabel = new JLabel("Pediatra");
		espLabel.setBounds(110, 83, 200, 20);
		teleLabel = new JLabel("111111");
		teleLabel.setBounds(85, 130, 200, 20);
		iD = new JLabel("10000");
		iD.setBounds(140, 5, 150, 30);
		
		add(nomeLabel);
		add(espLabel);
		add(teleLabel);
		add(iD);
		
		
		setVisible(false);
	}

	public JButton getVoltarBttn() {
		return voltarBttn;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getEspLabel() {
		return espLabel;
	}

	public JLabel getTeleLabel() {
		return teleLabel;
	}

	public JLabel getiD() {
		return iD;
	}

	public JLabel getFundoLabel() {
		return fundoLabel;
	}
}
