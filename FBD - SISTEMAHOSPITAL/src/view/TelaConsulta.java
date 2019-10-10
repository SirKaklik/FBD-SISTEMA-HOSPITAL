package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.MaskFormatter;

public class TelaConsulta extends JFrame{
	
	private JLabel fundoLabel, idLabel;
	private JTextField nome, rua, numero, municipio, CEP, telef;
	private JRadioButton masculino, feminino;
	private JTextArea queixa;
	private ButtonGroup group;
	private JComboBox<String> estados, ano, mes, dia;

	public TelaConsulta() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, ParseException {
		super("Consulta");
		setSize(530, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setResizable(false);
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		idLabel = new JLabel("");
		idLabel.setBounds(250, 0, 150, 30);
		
		nome = new JTextField();
		nome.setBounds(39, 34, 300, 25);
		
		rua = new JTextField();
		rua.setBounds(65, 62, 215, 25);
		
		numero = new JTextField();
		numero.setBounds(301, 62, 55, 25);
		
		municipio = new JTextField();
		municipio.setBounds(45, 90, 165, 25);
		
		telef = new JFormattedTextField();
		telef.setBounds(30, 115, 80, 25);
		
		CEP = new JTextField();
		CEP.setBounds(138, 115, 75, 25);
		
		ano = new JComboBox<String>();
		mes = new JComboBox<String>();
		dia = new JComboBox<String>();
		dia.setBounds(118, 142, 52, 25);
		mes.setBounds(198, 142, 52, 25);
		ano.setBounds(285, 142, 80, 25);
		
		estados = new JComboBox<String>();
		estados.setBounds(240, 90, 52, 25);
		
		masculino = new JRadioButton();
		masculino.setBounds(10, 190, 20, 20);
		feminino = new JRadioButton();
		feminino.setBounds(58, 190, 20, 20);
		
		group = new ButtonGroup();
		group.add(masculino);
		group.add(feminino);

		queixa = new JTextArea();
		queixa.setLineWrap(true);
		queixa.setWrapStyleWord(true);
		queixa.setBounds(8, 244, 495, 40);
		
		//////////////////////////////////////
		add(idLabel);
		add(nome);
		add(rua);
		add(numero);
		add(municipio);
		add(telef);
		add(CEP);
		add(dia);
		add(mes);
		add(ano);
		add(estados);
		add(masculino);
		add(feminino);
		add(queixa);
		
		
		
		
		setVisible(true);
		
		
	}

	public JLabel getFundoLabel() {
		return fundoLabel;
	}

	public JLabel getIdLabel() {
		return idLabel;
	}

	public JTextField getNome() {
		return nome;
	}

	public JTextField getRua() {
		return rua;
	}

	public JTextField getNumero() {
		return numero;
	}

	public JTextField getMunicipio() {
		return municipio;
	}

	public JTextField getTelef() {
		return telef;
	}

	public JTextField getCEP() {
		return CEP;
	}

	public JTextArea getQueixa() {
		return queixa;
	}

	public JRadioButton getMasculino() {
		return masculino;
	}

	public JRadioButton getFeminino() {
		return feminino;
	}

	public ButtonGroup getGroup() {
		return group;
	}

	public JComboBox<String> getEstados() {
		return estados;
	}

	public JComboBox<String> getAno() {
		return ano;
	}

	public JComboBox<String> getMes() {
		return mes;
	}

	public JComboBox<String> getDia() {
		return dia;
	}
}
