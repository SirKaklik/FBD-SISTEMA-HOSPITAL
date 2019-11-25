package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
	private JButton salvarBttn, cancelarBttn, limparBttn;

	public TelaConsulta() {
		super("Consulta");
		setSize(520, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		idLabel = new JLabel("");
		idLabel.setBounds(250, 2, 150, 30);
		
		nome = new JTextField();
		nome.setBounds(39, 38, 300, 25);
		
		rua = new JTextField();
		rua.setBounds(65, 66, 215, 25);
		
		numero = new JTextField();
		numero.setBounds(301, 66, 55, 25);
		
		municipio = new JTextField();
		municipio.setBounds(45, 94, 165, 25);
		
		telef = new JFormattedTextField();
		telef.setBounds(30, 119, 80, 25);
		
		CEP = new JTextField();
		CEP.setBounds(138, 119, 75, 25);
		
		ano = new JComboBox<String>();
		mes = new JComboBox<String>();
		dia = new JComboBox<String>();
		dia.setBounds(118, 146, 52, 25);
		mes.setBounds(198, 146, 52, 25);
		ano.setBounds(285, 146, 80, 25);
		
		estados = new JComboBox<String>();
		estados.setBounds(240, 94, 52, 25);
		
		masculino = new JRadioButton();
		masculino.setBounds(10, 194, 20, 20);
		feminino = new JRadioButton();
		feminino.setBounds(58, 194, 20, 20);
		
		group = new ButtonGroup();
		group.add(masculino);
		group.add(feminino);

		queixa = new JTextArea();
		queixa.setLineWrap(true);
		queixa.setWrapStyleWord(true);
		queixa.setBounds(8, 248, 495, 40);
		
		salvarBttn = new JButton("Salvar");
		salvarBttn.setBounds(100, 300, 100, 30);
		cancelarBttn = new JButton("Cancelar");
		cancelarBttn.setBounds(200, 300, 100, 30);
		limparBttn = new JButton("Limpar");
		limparBttn.setBounds(300, 300, 100, 30);
		
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
		add(salvarBttn);
		add(cancelarBttn);
		add(limparBttn);
		
		
		
		setVisible(false);
		
		
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

	public JButton getSalvarBttn() {
		return salvarBttn;
	}

	public JButton getCancelarBttn() {
		return cancelarBttn;
	}

	public JButton getLimparBttn() {
		return limparBttn;
	}
}
