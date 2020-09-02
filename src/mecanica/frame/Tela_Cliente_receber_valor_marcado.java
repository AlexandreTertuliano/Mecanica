package mecanica.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mecanica.connection.ConnectionDAO;
import mecanicaDAO.Cliente_add;
import mecanicaDAO.Contas_add;
import mecanicaDAOContas.ContasDAO;

public class Tela_Cliente_receber_valor_marcado extends JPanel {
	
	private Connection connection;
	
	 public Tela_Cliente_receber_valor_marcado() throws SQLException  {
		 connection = ConnectionDAO.getConnection();
		 conta_add = new Contas_add();
		 contaDAO = new ContasDAO();
	     initComponents();
	    }
	 
	 
	 private void initComponents() {

		 	Label_Titulo = new javax.swing.JLabel("Vendas a Prazo");
	        jSeparator1 = new javax.swing.JSeparator();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();
	        Label_cpf = new javax.swing.JLabel("Digite o cpf do Cliente");
	        Field_Cpf = new javax.swing.JFormattedTextField();
	        Btn_Buscar_Cpf = new javax.swing.JButton("Buscar");
	        Label_Placa = new javax.swing.JLabel("Digite a placa do Carro");
	        Field_Placa = new javax.swing.JFormattedTextField();
	        Btn_Busca_Placa = new javax.swing.JButton("Buscar");
	        Btn_Cancelar_Venda = new javax.swing.JButton("Cancelar");
	        Label_Ed_Total = new javax.swing.JLabel("0.00");
	        Label_Total = new javax.swing.JLabel("Total");
	        Label_Titulo_Venda = new javax.swing.JLabel("Controle");
	        jSeparator2 = new javax.swing.JSeparator();
	        Btn_Bloquear = new javax.swing.JButton("Bloquear");
	        LabePago = new javax.swing.JLabel("Valor Pago");
	        Field_Valor_Pago = new javax.swing.JFormattedTextField();
	        Btn_Receber = new javax.swing.JButton("Receber");
	        jScrollPane2 = new javax.swing.JScrollPane();
	        jTable2 = new javax.swing.JTable();
	        Label_Movimentacao = new javax.swing.JLabel("Cliente sem movimentação durante 1 mês");
	        Btn_Movimento_1Mes = new javax.swing.JButton("Gerar");

	        Label_Titulo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
	        
	        try {
	            Field_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
	        } catch (java.text.ParseException ex) {
	            ex.printStackTrace();
	        }


	        Label_Ed_Total.setFont(new java.awt.Font("Arial Black", 0, 18)); 
	        Label_Total.setFont(new java.awt.Font("Arial Black", 0, 18));
	        Label_Titulo_Venda.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N


	        //Coloca as especificações nos campos da tabela
	     	Vector<String> columnBoleto = new Vector<String>();
	     	columnBoleto.add("Cod Venda");
	     	columnBoleto.add("Nome");
	     	columnBoleto.add("Placa do Carro");
	     	columnBoleto.add("Quantidade de Produto");
	     	columnBoleto.add("Valor da Venda");
			Vector<? extends Vector> vector = new Vector();
			jTable1 = new JTable(vector,columnBoleto);
			jScrollPane1 = new JScrollPane(jTable1);

	        Btn_Buscar_Cpf.setBackground(Color.WHITE);
	        Btn_Buscar_Cpf.setToolTipText("Salvar");
	        ImageIcon image_Lupa = new ImageIcon(getClass().getResource("/search (1).png"));
	        Btn_Buscar_Cpf.setIcon(image_Lupa);
	           
	        Btn_Busca_Placa.setBackground(Color.WHITE);
	        Btn_Busca_Placa.setToolTipText("Salvar");
	        Btn_Busca_Placa.setIcon(image_Lupa);
	        
	        Btn_Cancelar_Venda.setBackground(Color.WHITE);
	        Btn_Cancelar_Venda.setToolTipText("Cancelar");
	        ImageIcon image_cancelar = new ImageIcon(getClass().getResource("/close.png"));
	        Btn_Cancelar_Venda.setIcon(image_cancelar);
	           
	        Btn_Bloquear.setBackground(Color.WHITE);
	        Btn_Bloquear.setToolTipText("Bloquear");
	        ImageIcon image_bloquear = new ImageIcon(getClass().getResource("/blocked.png"));
	        Btn_Bloquear.setIcon(image_bloquear);
	        
	        Btn_Receber.setBackground(Color.WHITE);
	        Btn_Receber.setToolTipText("Receber");
	        ImageIcon image_receber = new ImageIcon(getClass().getResource("/accepted.png"));
	        Btn_Receber.setIcon(image_receber);
	        
	        Btn_Movimento_1Mes.setBackground(Color.WHITE);
	        Btn_Movimento_1Mes.setToolTipText("Gerar");
	        ImageIcon image_gerar = new ImageIcon(getClass().getResource("/tax.png"));
	        Btn_Movimento_1Mes.setIcon(image_gerar);
	           
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(Label_Titulo)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jSeparator1))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(Label_Placa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(Label_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(Field_Cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
	                            .addComponent(Field_Placa))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(Btn_Buscar_Cpf)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(Btn_Bloquear))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(Btn_Busca_Placa)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(Btn_Cancelar_Venda))))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(LabePago)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(Field_Valor_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(Btn_Receber)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(Label_Total)
	                        .addGap(18, 18, 18)
	                        .addComponent(Label_Ed_Total))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addComponent(Label_Titulo_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(jSeparator2))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(Label_Movimentacao)
	                            .addComponent(Btn_Movimento_1Mes))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Label_Titulo))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(Label_cpf)
	                    .addComponent(Field_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Btn_Buscar_Cpf)
	                    .addComponent(Btn_Bloquear))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(Label_Placa)
	                    .addComponent(Field_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Btn_Busca_Placa)
	                    .addComponent(Btn_Cancelar_Venda))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(Label_Ed_Total)
	                    .addComponent(Label_Total)
	                    .addComponent(LabePago)
	                    .addComponent(Field_Valor_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Btn_Receber))
	                .addGap(31, 31, 31)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Label_Titulo_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(Label_Movimentacao)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(Btn_Movimento_1Mes)))
	                .addContainerGap(35, Short.MAX_VALUE))
	        );
	        Btn_Buscar_Cpf.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(Verifica_cliente()){
						Preenche_tabela();
						soma_total();
					}
				}
			});
	        
	    }
	 
	 private boolean Verifica_cliente(){
		 
		 
		 
		 
		 return true;
	 }
	 
	 private void soma_total(){
		 
		 String sql = "select sum (valor_venda) as valor_venda "
					+ "from vendas "
	    			+ "where cpf_venda = '"
	    			+ Field_Cpf.getText() + "'" ;
	    	try {
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(sql);
				result.next();
				Label_Ed_Total.setText(String.valueOf(result.getDouble("valor_venda")));
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    
	 }
	 
	 private void Preenche_tabela(){
		 
			 DefaultTableModel tablemodel_Cadastrados = (DefaultTableModel) jTable1.getModel();
	    	tablemodel_Cadastrados.setRowCount(0);
	    	
	    	 for(Contas_add conta : contaDAO.getAll_table(Field_Cpf.getText())) {
	        	Object[] data = {
	    				conta.getCod_servico(),
	    				conta.getNome_cliente(),
	    				conta.getPlaca_carro(),
	    				conta.getQuant_prod(),
	    				conta.getValor_venda()
	    				
	    		};
	        	
	    		tablemodel_Cadastrados.addRow(data);
	    		
	        	}
	    	
	 }
	 

	 // Variables declaration - do not modify                     
	    private javax.swing.JButton Btn_Bloquear;
	    private javax.swing.JButton Btn_Busca_Placa;
	    private javax.swing.JButton Btn_Buscar_Cpf;
	    private javax.swing.JButton Btn_Cancelar_Venda;
	    private javax.swing.JButton Btn_Movimento_1Mes;
	    private javax.swing.JButton Btn_Receber;
	    private javax.swing.JFormattedTextField Field_Cpf;
	    private javax.swing.JFormattedTextField Field_Placa;
	    private javax.swing.JFormattedTextField Field_Valor_Pago;
	    private javax.swing.JLabel LabePago;
	    private javax.swing.JLabel Label_Ed_Total;
	    private javax.swing.JLabel Label_Movimentacao;
	    private javax.swing.JLabel Label_Placa;
	    private javax.swing.JLabel Label_Titulo;
	    private javax.swing.JLabel Label_Titulo_Venda;
	    private javax.swing.JLabel Label_Total;
	    private javax.swing.JLabel Label_cpf;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JScrollPane jScrollPane2;
	    private javax.swing.JSeparator jSeparator1;
	    private javax.swing.JSeparator jSeparator2;
	    private javax.swing.JTable jTable1;
	    private javax.swing.JTable jTable2;
	    private Contas_add conta_add;
	    private ContasDAO contaDAO;
	    // End of variables declaration                     
}
