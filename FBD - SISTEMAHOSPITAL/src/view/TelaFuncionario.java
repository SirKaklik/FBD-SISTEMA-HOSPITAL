package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaFuncionario extends JFrame{

	JButton voltarBttn;
	JLabel nomeLabel, CPFLabel, rgLabel, iD;
	private JLabel fundoLabel;
	
	public TelaFuncionario() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		super("Funcionario Info");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		nomeLabel = new JLabel("Nome");
		nomeLabel.setBounds(40, 45, 300, 20);
		CPFLabel = new JLabel("11111111111");
		CPFLabel.setBounds(40, 85, 200, 20);
		rgLabel = new JLabel("111111");
		rgLabel.setBounds(40, 132, 200, 20);
		iD = new JLabel("10000");
		iD.setBounds(140, 5, 150, 30);
		
		add(nomeLabel);
		add(CPFLabel);
		add(rgLabel);
		add(iD);
		
		
		setVisible(false);
	}

	public JButton getVoltarBttn() {
		return voltarBttn;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getCPFLabel() {
		return CPFLabel;
	}

	public JLabel getRgLabel() {
		return rgLabel;
	}

	public JLabel getiD() {
		return iD;
	}

	public JLabel getFundoLabel() {
		return fundoLabel;
	}
}
