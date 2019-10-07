package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DashBoard extends JFrame {
	
	JPanel tempoPanel, tituloPanel, infoPanel, funcionariosPanel, pacientesPanel, opsPanel;
	JLabel fotoLabel, tempoMedioLabel, tempoBaixoLabel, totalPacientesAtendidosLabel,
	numeroTotalPacientesAtendidosLabel, funcionariosDisponiveisLabel, numeroFuncionariosDisponivesLabel, mediaTempoLabel, numeroMediaTempoLabel, medicoDispLabel, medicoBooleanLabel, fundoLabel;
	JButton voltarBttn, funcionarioBttn, consultaBttn, triagemBttn, pacientesBttn, laudoBttn;
	
	
	
	public DashBoard() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		super("Dashboard Hospital");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		fundoLabel = new JLabel();
		setContentPane(fundoLabel);
		
		tempoPanel = new JPanel();
		tempoPanel.setBounds(438, 206, 347, 355);
		tempoPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 5, true));
		tempoPanel.setBackground(Color.white);
		tempoPanel.setLayout(null);
		tempoPanel.setBackground(new Color(0, 0, 0, 100));
		
		tituloPanel = new JPanel();
		tituloPanel.setBounds(117, 0, 667, 205);
		tituloPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 5, true));
		tituloPanel.setBackground(Color.white);
		tituloPanel.setLayout(null);
		tituloPanel.setBackground(new Color(0, 0, 0, 100));
		
		funcionariosPanel = new JPanel();
		funcionariosPanel.setBounds(117, 206, 320, 355);
		funcionariosPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 5, true));
		funcionariosPanel.setBackground(Color.white);
		funcionariosPanel.setLayout(null);		
		funcionariosPanel.setBackground(new Color(0, 0, 0, 100));
		
		opsPanel = new JPanel();
		opsPanel.setBounds(0, 0, 115, 560);
		opsPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 5, true));
		opsPanel.setBackground(Color.white);
		opsPanel.setLayout(new FlowLayout());
		opsPanel.setBackground(new Color(0, 0, 0, 100));
		
		tempoBaixoLabel = new JLabel();
		tempoBaixoLabel.setBounds(70, 10, 200, 150);
		tempoMedioLabel = new JLabel();
		tempoMedioLabel.setBounds(65, 160, 200, 150);
		
		totalPacientesAtendidosLabel = new JLabel("Pacientes:");
		totalPacientesAtendidosLabel.setBounds(220, 60, 100, 30);
		totalPacientesAtendidosLabel.setFont(new Font("Arial", Font.BOLD, 20));
		totalPacientesAtendidosLabel.setForeground(Color.white);
		
		numeroTotalPacientesAtendidosLabel = new JLabel("0");
		numeroTotalPacientesAtendidosLabel.setBounds(260, 100, 150, 30);
		numeroTotalPacientesAtendidosLabel.setFont(new Font("Arial", Font.BOLD, 35));
		numeroTotalPacientesAtendidosLabel.setForeground(Color.white);
		
		mediaTempoLabel = new JLabel("Média de espera:");
		mediaTempoLabel.setBounds(400, 60, 250, 30);
		mediaTempoLabel.setFont(new Font("Arial", Font.BOLD, 20));
		mediaTempoLabel.setForeground(Color.white);
		
		numeroMediaTempoLabel = new JLabel("30 Minutos");
		numeroMediaTempoLabel.setBounds(435, 100, 150, 30);
		numeroMediaTempoLabel.setFont(new Font("Arial", Font.BOLD, 20));
		numeroMediaTempoLabel.setForeground(Color.white);
		
		fotoLabel = new JLabel();
		fotoLabel.setBounds(0,0, 146, 205);
		
		voltarBttn = new JButton("Voltar");
		funcionarioBttn = new JButton("Funcionario");
		consultaBttn = new JButton("Consulta");
		triagemBttn = new JButton("Triagem");
		pacientesBttn = new JButton("Paciente");
		laudoBttn = new JButton("Laudo");
		
		funcionariosDisponiveisLabel = new JLabel("Enfermeiras disponiveis:");
		funcionariosDisponiveisLabel.setBounds(40, 40, 300, 30);
		funcionariosDisponiveisLabel.setFont(new Font("Arial", Font.BOLD, 20));
		funcionariosDisponiveisLabel.setForeground(Color.white);
		
		numeroFuncionariosDisponivesLabel = new JLabel("??");
		numeroFuncionariosDisponivesLabel.setBounds(150, 80, 100, 30);
		numeroFuncionariosDisponivesLabel.setFont(new Font("Arial", Font.BOLD, 20));
		numeroFuncionariosDisponivesLabel.setForeground(Color.white);
		
		medicoDispLabel = new JLabel("Médico disponivel? ");
		medicoDispLabel.setBounds(75, 200, 300, 30);
		medicoDispLabel.setFont(new Font("Arial", Font.BOLD, 20));
		medicoDispLabel.setForeground(Color.white);
		
		medicoBooleanLabel = new JLabel("Sim");
		medicoBooleanLabel.setBounds(150, 250, 100, 30);
		medicoBooleanLabel.setFont(new Font("Arial", Font.BOLD, 20));
		medicoBooleanLabel.setForeground(Color.white);
		
		////////////////////////////////////////////////
		add(tempoPanel);
		tempoPanel.add(tempoBaixoLabel);
		tempoPanel.add(tempoMedioLabel);
		
		add(funcionariosPanel);
		funcionariosPanel.add(funcionariosDisponiveisLabel);
		funcionariosPanel.add(numeroFuncionariosDisponivesLabel);
		funcionariosPanel.add(medicoDispLabel);
		funcionariosPanel.add(medicoBooleanLabel);
		
		add(tituloPanel);
		tituloPanel.add(totalPacientesAtendidosLabel);
		tituloPanel.add(numeroTotalPacientesAtendidosLabel);
		tituloPanel.add(mediaTempoLabel);
		tituloPanel.add(numeroMediaTempoLabel);
		tituloPanel.add(fotoLabel);
		
		add(opsPanel);
		opsPanel.add(funcionarioBttn);
		opsPanel.add(consultaBttn);
		opsPanel.add(triagemBttn);
		opsPanel.add(pacientesBttn);
		opsPanel.add(laudoBttn);
		opsPanel.add(voltarBttn);
		////////////////////////////////////////////////
		
		setVisible(true);
	}



	public JPanel getTempoPanel() {
		return tempoPanel;
	}



	public JPanel getTituloPanel() {
		return tituloPanel;
	}



	public JPanel getInfoPanel() {
		return infoPanel;
	}



	public JPanel getFuncionariosPanel() {
		return funcionariosPanel;
	}



	public JPanel getPacientesPanel() {
		return pacientesPanel;
	}



	public JPanel getOpsPanel() {
		return opsPanel;
	}



	public JLabel getFotoLabel() {
		return fotoLabel;
	}



	public JLabel getTempoMedioLabel() {
		return tempoMedioLabel;
	}



	public JLabel getTempoBaixoLabel() {
		return tempoBaixoLabel;
	}



	public JLabel getTotalPacientesAtendidosLabel() {
		return totalPacientesAtendidosLabel;
	}



	public JLabel getNumeroTotalPacientesAtendidosLabel() {
		return numeroTotalPacientesAtendidosLabel;
	}



	public JLabel getFuncionariosDisponiveisLabel() {
		return funcionariosDisponiveisLabel;
	}



	public JLabel getNumeroFuncionariosDisponivesLabel() {
		return numeroFuncionariosDisponivesLabel;
	}



	public JLabel getMediaTempoLabel() {
		return mediaTempoLabel;
	}



	public JLabel getNumeroMediaTempoLabel() {
		return numeroMediaTempoLabel;
	}



	public JButton getVoltarBttn() {
		return voltarBttn;
	}



	public JButton getFuncionarioBttn() {
		return funcionarioBttn;
	}



	public JButton getConsultaBttn() {
		return consultaBttn;
	}



	public JButton getTriagemBttn() {
		return triagemBttn;
	}



	public JButton getPacientesBttn() {
		return pacientesBttn;
	}



	public JButton getLaudoBttn() {
		return laudoBttn;
	}



	public JLabel getMedicoDispLabel() {
		return medicoDispLabel;
	}



	public JLabel getMedicoBooleanLabel() {
		return medicoBooleanLabel;
	}



	public JLabel getFundoLabel() {
		return fundoLabel;
	}

}
