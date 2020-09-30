package mecanica.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import mecanica.connection.ConnectionDAO;
import mecanicaDAOAgendamento.AgendamentoDAO;

public class Tela_Relatorios_e_consultas extends JPanel{
	
	private Connection connection;
	private JPanel contentPane;
	private JPanel centerPanel;
	
	public Tela_Relatorios_e_consultas() throws SQLException {
        initComponents();
        connection = ConnectionDAO.getConnection();
    }                        
    private void initComponents() {
    	    	
    	contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		//setContentPane(contentPane);
		
		createNorthPanel();
		centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.setBackground(Color.BLACK);
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
    	
    }
 
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(1920, 80));
		//northPanel.setBackground(new Color(45,173,199));
		northPanel.setBackground(Color.BLACK);
		
		
		contentPane.add(northPanel, BorderLayout.NORTH);
    }

}
