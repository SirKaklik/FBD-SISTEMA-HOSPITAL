package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DashBoard extends JFrame {
	
	JPanel tempoPanel, tituloPanel, infoPanel, funcionariosPanel, pacientesPanel, opsPanel;
	JLabel fotoLabel, tempoAltoLabel, tempoMedioLabel, tempoBaixoLabel, totalPacientesAtendidosLabel,
	numeroTotalPacientesAtendidosLabel, funcionariosDisponiveisLabel, numeroFuncionariosDisponivesLabel, tempoAtendimentoInfoLabel;
	JButton voltarBttn, funcionarioBttn, consultaBttn, triagemBttn, pacientesBttn, laudoBttn;
	
	
	
	public DashBoard() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		super("Dashboard Hospital");
		setSize(386, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		
		
		
	}

}
