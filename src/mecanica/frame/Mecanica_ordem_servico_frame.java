package mecanica.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mecanica_ordem_servico_frame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel centerPanel;
	private JPanel Tela_ordem_servicos_finalizados;
	private JPanel Tela_ordem_servicos_nao_finalizados;
	
	public Mecanica_ordem_servico_frame() throws SQLException {
		
		setSize(500,450);
		setTitle("Números das ordens de Serviço");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		initialize();
	}
	
	
	private void initialize() throws SQLException {	
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		
		Tela_ordem_servicos_finalizados = new Tela_ordem_servicos_finalizados();
		Tela_ordem_servicos_nao_finalizados = new Tela_ordem_servicos_nao_finalizados();
				
		createNorthPanel();
		centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.setBackground(Color.WHITE);
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
	}
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(500,80));
		northPanel.setBackground(new Color(45,173,199));
		
		JButton orcamento_finalizado = new JButton();
		orcamento_finalizado.setPreferredSize(new Dimension(100, 70));
		orcamento_finalizado.setToolTipText("Orçamentos Finalizados");
		ImageIcon image1 = new ImageIcon(getClass().getResource("/verifica.png"));
		orcamento_finalizado.setIcon(image1);
		orcamento_finalizado.setBackground(Color.WHITE);
		orcamento_finalizado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanel.removeAll();
				centerPanel.add(Tela_ordem_servicos_finalizados);
				centerPanel.revalidate();
				Mecanica_ordem_servico_frame.this.repaint();
				((mecanica.frame.Tela_ordem_servicos_finalizados)Tela_ordem_servicos_finalizados).Gerar_Ordens();
			}
		});
		
		northPanel.add(orcamento_finalizado);
		
		JButton orcamento_nao_finalizado = new JButton();
		orcamento_nao_finalizado.setPreferredSize(new Dimension(100, 70));
		orcamento_nao_finalizado.setToolTipText("Orçamentos Não Finalizados");
		ImageIcon image2 = new ImageIcon(getClass().getResource("/perto.png"));
		orcamento_nao_finalizado.setIcon(image2);
		orcamento_nao_finalizado.setBackground(Color.WHITE);
		orcamento_nao_finalizado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanel.removeAll();
				centerPanel.add(Tela_ordem_servicos_nao_finalizados);
				centerPanel.revalidate();
				Mecanica_ordem_servico_frame.this.repaint();
				((mecanica.frame.Tela_ordem_servicos_nao_finalizados)Tela_ordem_servicos_nao_finalizados).Gerar_Ordens();
			}
		});
		
		northPanel.add(orcamento_nao_finalizado);
		
		contentPane.add(northPanel, BorderLayout.NORTH);
	}

}