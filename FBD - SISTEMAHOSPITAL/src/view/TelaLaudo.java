package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaLaudo extends JFrame{

	private JButton salvarBttn, cancelarBttn, limparBttn, infoGeral;
	private JLabel fundoLabel;
	private JLabel nomeLabel, telefoneLabel, CEPLabel, dataNascLabel;
	private JComboBox<String> ID;
	private JTextArea area;
	
	public TelaLaudo() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		super("Laudo médico");
		setSize(520, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setResizable(false);
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		area = new JTextArea();
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBounds(10, 153, 500, 150);
		
		infoGeral = new JButton("Todas as Informações");
		infoGeral.setBounds(0, 2, 170, 30);
		
		ID = new JComboBox<String>();
		ID.setBounds(240, 2, 150, 30);
		
		nomeLabel = new JLabel("NOME");
		nomeLabel.setBounds(47, 42, 200, 20);
		
		telefoneLabel = new JLabel("11111111111");
		telefoneLabel.setBounds(30, 82, 200, 20);
		
		CEPLabel = new JLabel("11111-111");
		CEPLabel.setBounds(140, 82, 200, 20);
		
		dataNascLabel = new JLabel("11/11/1111");
		dataNascLabel.setBounds(74, 107, 200, 20);
		
		salvarBttn = new JButton("Salvar");
		salvarBttn.setBounds(100, 310, 100, 30);
		cancelarBttn = new JButton("Cancelar");
		cancelarBttn.setBounds(200, 310, 100, 30);
		limparBttn = new JButton("Limpar");
		limparBttn.setBounds(300, 310, 100, 30);
		
		add(ID);
		add(nomeLabel);
		add(CEPLabel);
		add(infoGeral);
		add(dataNascLabel);
		add(telefoneLabel);
		add(area);
		add(salvarBttn);
		add(cancelarBttn);
		add(limparBttn);
		
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

	public JButton getInfoGeral() {
		return infoGeral;
	}

	public JLabel getFundoLabel() {
		return fundoLabel;
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

	public JComboBox<String> getID() {
		return ID;
	}

	public JTextArea getArea() {
		return area;
	}
}
