package view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaTriagem extends JFrame {

	private JComboBox<String> tipoSang;
	private JTextField id;
	private JTextArea problemas, alergia;
	private JRadioButton vermelho, laranja, amarelo, verde, azul;
	private ButtonGroup group;
	
	private JLabel fundoLabel;

	public TelaTriagem() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		super("Triagem");
		setSize(520, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setResizable(false);
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		id = new JTextField();
		id.setBounds(242, 4, 150, 30);
		problemas = new JTextArea();
		problemas.setLineWrap(true);
		problemas.setWrapStyleWord(true);
		problemas.setBounds(8, 70, 500, 40);
		
		alergia = new JTextArea();
		alergia.setLineWrap(true);
		alergia.setWrapStyleWord(true);
		alergia.setBounds(8, 172, 265, 80);
		alergia.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
		
		vermelho = new JRadioButton();
		vermelho.setBounds(95, 125, 20, 20);
		laranja = new JRadioButton();
		laranja.setBounds(150, 125, 20, 20);
		amarelo = new JRadioButton();
		amarelo.setBounds(215, 125, 20, 20);
		verde = new JRadioButton();
		verde.setBounds(280, 125, 20, 20);
		azul = new JRadioButton();
		azul.setBounds(345, 125, 20, 20);
		
		group = new ButtonGroup();
		group.add(vermelho);
		group.add(laranja);
		group.add(verde);
		group.add(amarelo);
		group.add(azul);
		
		tipoSang = new JComboBox<String>();
		tipoSang.setBounds(405, 170, 50, 30);
		
		add(tipoSang);
		add(id);
		add(problemas);
		add(alergia);
		add(vermelho);
		add(laranja);
		add(verde);
		add(amarelo);
		add(azul);
		
		setVisible(true);
	}

	public JLabel getFundoLabel() {
		return fundoLabel;
	}
}
