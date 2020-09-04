package mecanica.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mecanica.connection.ConnectionDAO;
import mecanicaDAO.Venda_add;
import mecanicaDAOVenda.VendaDAO;

public class Tela_Venda extends JPanel{
	
	private Connection connection;
	int contador_Table = 0;
	Double Total = 0.00;

	
	public Tela_Venda() throws SQLException {
        initComponents();
        vendaDAO = new VendaDAO();
        connection = ConnectionDAO.getConnection();
    }
	
	private void initComponents() {
		
			Label_Cod_Venda = new javax.swing.JLabel("Codigo");
	        Field_Codigo = new javax.swing.JTextField("0001");
	        Label_Titulo = new javax.swing.JLabel("Venda");
	        jSeparator1 = new javax.swing.JSeparator();
	        Label_data = new javax.swing.JLabel("Data : ");
	        Label_Editavel_data = new javax.swing.JLabel();
	        Combo_Produto = new javax.swing.JComboBox<>();
	        Label_Prdouto = new javax.swing.JLabel("Produto");
	        Field_Cod_Barras = new javax.swing.JTextField();
	        Label_Cod_barras = new javax.swing.JLabel("Cod. Barras");
	        Label_Valor = new javax.swing.JLabel("Valor Venda");
	        Field_Preco_Venda = new javax.swing.JTextField();
	        Label_Quantidade = new javax.swing.JLabel("Quantidade");
	        Field_Quantidade = new javax.swing.JTextField();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();
	        Btn_Add_Produto = new javax.swing.JButton("Adicionar produto");
	        Btn_Cancelar = new javax.swing.JButton("Cancelar");
	        Btn_Finalizar = new javax.swing.JButton("Finalizar Venda");
	        Btn_Orcamento = new javax.swing.JButton(" Orçamento");
	        Label_Cliente = new javax.swing.JLabel("Cliente");
	        Combo_Cadastrado = new javax.swing.JComboBox<>();
	        Field_nao_cadastrado = new javax.swing.JTextField();
	        Label_Cadastrados = new javax.swing.JLabel("Cadastrado");
	        Label_nao_cadastrados = new javax.swing.JLabel("Não Cadastrados");
	        Label_Cpf = new javax.swing.JLabel("Cpf");
	        Label_Placa = new javax.swing.JLabel("Placa  ");
	        Field_Placa = new javax.swing.JComboBox<>();
	        Label_Total = new javax.swing.JLabel("Total");
	        Field_Total = new javax.swing.JTextField();
	        jLabel1 = new javax.swing.JLabel("Produtos");
	        jSeparator2 = new javax.swing.JSeparator();
	        Field_Cpf = new javax.swing.JFormattedTextField();
	        Btn_Remove = new javax.swing.JButton("Remover Produto");
	        Field_Quantidade.setText("1");
	        Label_Ordem = new javax.swing.JLabel("Numero da Ordem de Serviço");
	        Field_Ordem = new javax.swing.JFormattedTextField();
	        Btn_Ordem = new javax.swing.JButton("Gerar");
	        jRadioButton1 = new javax.swing.JRadioButton("Dinheiro");
	        jRadioButton2 = new javax.swing.JRadioButton("Em conta");
	        jRadioButton3 = new javax.swing.JRadioButton("Cartão");
	        Field_Codigo.setEnabled(false);
	        
	        Label_Titulo.setFont(new java.awt.Font("Arial Black", 0, 12));
	        Label_Total.setFont(new java.awt.Font("Arial Black", 0, 12));
	        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12));
	        
	        Btn_Add_Produto.setBackground(Color.WHITE);
	        Btn_Add_Produto.setToolTipText("Adicionar");
	        ImageIcon image_Adcionar = new ImageIcon(getClass().getResource("/add.png"));
	        Btn_Add_Produto.setIcon(image_Adcionar);
	        
	        Btn_Cancelar.setBackground(Color.WHITE);
	        Btn_Cancelar.setToolTipText("Cancelar");
	        ImageIcon image_Cancel = new ImageIcon(getClass().getResource("/close.png"));
	        Btn_Cancelar.setIcon(image_Cancel);
	        
	        Btn_Ordem.setBackground(Color.WHITE);
	        Btn_Ordem.setToolTipText("Puxar Ordem de Serviço");
	        ImageIcon image_Ordem = new ImageIcon(getClass().getResource("/check-list.png"));
	        Btn_Ordem.setIcon(image_Ordem);
	        
	        Btn_Finalizar.setBackground(Color.GREEN);
	        Btn_Finalizar.setToolTipText("Finalizar Venda");
	        ImageIcon image_finalizar = new ImageIcon(getClass().getResource("/tick.png"));
	        Btn_Finalizar.setIcon(image_finalizar);
	        
	        Btn_Orcamento.setBackground(Color.WHITE);
	        Btn_Orcamento.setToolTipText("Orçamento");
	        ImageIcon image_orcamento = new ImageIcon(getClass().getResource("/project.png"));
	        Btn_Orcamento.setIcon(image_orcamento);
	        
	        Btn_Remove.setBackground(Color.WHITE);
	        Btn_Remove.setToolTipText("Remover");
	        ImageIcon image_Remover = new ImageIcon(getClass().getResource("/minus.png"));
	        Btn_Remove.setIcon(image_Remover);
	        
	      //Coloca as especificações nos campos da tabela
	     	Vector<String> columnVenda = new Vector<String>();
	     	columnVenda.add("Produto");
	     	columnVenda.add("Quantidade");
	     	columnVenda.add("Valor");
			Vector<? extends Vector> vector = new Vector();
			jTable1= new JTable(vector,columnVenda);
			jScrollPane1 = new JScrollPane(jTable1);
			
	        
		
		try {
            Field_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
		
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Cod_Venda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Field_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_data)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Label_Editavel_data, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_Placa)
                                        .addGap(18, 18, 18)
                                        .addComponent(Field_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Label_Ordem))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_Prdouto)
                                    .addComponent(Label_Cliente)
                                    .addComponent(Label_Cod_barras)))
                            .addComponent(Field_Ordem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Ordem))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Btn_Add_Produto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Btn_Remove)
                                        .addGap(48, 48, 48)
                                        .addComponent(Btn_Cancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(Label_Cadastrados)
                                        .addGap(257, 257, 257)
                                        .addComponent(Label_nao_cadastrados)))
                                .addGap(0, 21, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Combo_Cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Field_nao_cadastrado))
                                    .addComponent(Combo_Produto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Field_Cod_Barras))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(Label_Cpf))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label_Quantidade)
                                            .addComponent(Label_Valor))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Field_Preco_Venda, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(Field_Quantidade)
                            .addComponent(Field_Cpf)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Btn_Orcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Finalizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Label_Total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Field_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Label_Titulo)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_nao_cadastrados, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_Cadastrados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Combo_Cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Field_nao_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Cpf)
                            .addComponent(Field_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Field_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Cod_Venda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Cliente)
                            .addComponent(Label_Editavel_data)
                            .addComponent(Label_data))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Prdouto)
                    .addComponent(Combo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Valor)
                    .addComponent(Field_Preco_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Placa)
                    .addComponent(Field_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Cod_barras)
                            .addComponent(Field_Cod_Barras, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Quantidade)
                            .addComponent(Field_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Add_Produto)
                            .addComponent(Btn_Cancelar)
                            .addComponent(Btn_Remove)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Ordem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Field_Ordem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Ordem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Total)
                            .addComponent(Field_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Finalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jRadioButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Orcamento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)))
                .addGap(22, 22, 22))
        );
           
        Btn_Finalizar.addActionListener(new ActionListener() {
			
        	@Override
			public void actionPerformed(ActionEvent e) {
				if(Cad_Servico()) {
					 DefaultTableModel tablemodel_Cadastrados = (DefaultTableModel) jTable1.getModel();
					 tablemodel_Cadastrados.setRowCount(0);
					 contador_Table = 0;
					 Field_Preco_Venda.setText("0.00");
					 Lib_Campos();
					 update_quantidade();
					 Total =0.0;
				}
				
			}
				
	});    
        
        Btn_Cancelar.addActionListener(new ActionListener() {
			
        	@Override
			public void actionPerformed(ActionEvent e) {
				if(contador_Table == 0)erro();
				else 
					Limpa_tabela();
					Limpa_Dados();
					Total =0.0;
				
			}
		});
        
        Btn_Ordem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					
		}
	});
        
        Btn_Orcamento.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					
		}
	});
        
        Btn_Remove.addActionListener(new ActionListener() {
			
        	@Override
			public void actionPerformed(ActionEvent arg0) {
				Verica_Linha();
			}
	});
        
        Btn_Add_Produto.addActionListener(new ActionListener() {
			
        	@Override
			public void actionPerformed(ActionEvent e) {
				if(Verifica()){
					Bloq_Campos();
					update_tabela();
					soma_valor_serv_prod();
					Limpa_Dados();
					Combo_Produto.setSelectedItem("Seleciona");
				}
				
			}
	});
      //Funcao da combo box produto
        Combo_Produto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Mostra_Produto();
				
			}
		});
        
        //Funcao da combo box cliente
        Combo_Cadastrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Mostrar_Cliente();
				
			}
		});
    }

private void Bloq_Campos(){
	Combo_Cadastrado.setEnabled(false);
	
}

private void update_tabela() {

	DefaultTableModel tablemodel_Cadastrados = (DefaultTableModel) jTable1.getModel();
	tablemodel_Cadastrados.setRowCount(contador_Table);
	
	
    	Object[] data = {
				Combo_Cadastrado.getSelectedItem(),
				Field_Quantidade.getText(),
				Field_Preco_Venda.getText()
				
		};
    	
		tablemodel_Cadastrados.addRow(data);
		contador_Table ++;
}

private void soma_valor_serv_prod(){
	
	Double produto = Double.valueOf(Field_Preco_Venda.getText());
	Double Qtd = Double.valueOf(Field_Quantidade.getText());
	Total = Total + (produto * Qtd );
	Field_Total.setText(String.format("%.2f", Double.parseDouble(String.valueOf(Total))));
	
}


private void Limpa_Dados() {
	
	Field_Cod_Barras.setText(null);
	Field_Quantidade.setText("1");
	Field_Preco_Venda.setText("0.00");
	Field_Codigo.setText(null);
	//Field_Placa.setText(null);
	
}

 public void data() {
		LocalDate atual_data = LocalDate.now();
		 
	    String data;
		int mes = atual_data.getMonthValue();
		int dia = atual_data.getDayOfMonth();

		if(dia < 10){
			data = "0" + String.valueOf(dia) + "/";
		} else {
			data = String.valueOf(dia) + "/";
		}
		if(mes < 10) {
			data = data + "0" + String.valueOf(mes) +  "/";
		} else {
			data = data +  String.valueOf(mes) + "/";
		}
		
		data = data + String.valueOf(atual_data.getYear());
		
		Label_Editavel_data.setText(data);
	}
 
 
 public void Update_combo_cliente(){
	  Combo_Cadastrado.removeAllItems();
	  Combo_Cadastrado.addItem("Seleciona");
	  
	  String sql = "SELECT * FROM clientes ORDER BY nome";
    	try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()){
			Combo_Cadastrado.addItem(result.getString("Nome"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	  
  }
 
 
 public void Update_combo_produto(){
	  Combo_Produto.removeAllItems();
	  Combo_Produto.addItem("Seleciona");
	  
	  String sql = "SELECT * FROM produtos ORDER BY descricao";
    	try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()){
				Combo_Produto.addItem(result.getString("Descricao"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	  
  }
 
 private boolean Cad_Servico() {
		
		Venda_add vendas = new Venda_add();
		DefaultTableModel tablemodel_Cadastrados = (DefaultTableModel) jTable1.getModel();
		
		if(contador_Table == 1 ) {
			vendas.setCod_venda(Field_Codigo.getText());
			vendas.setCliente_venda(Combo_Cadastrado.getSelectedItem().toString());
			vendas.setProduto(Combo_Produto.getSelectedItem().toString());
			vendas.setProduto(String.valueOf(jTable1.getModel().getValueAt(0, 0)));
			vendas.setQuant(String.valueOf(jTable1.getModel().getValueAt(0, 1)));
			vendas.setValor_venda(String.valueOf(jTable1.getModel().getValueAt(0, 2)));
			vendas.setCpf_venda(String.valueOf(Field_Cpf.getText().replace("-", ".")));
			vendas.setCod_barras(String.valueOf(Field_Cod_Barras.getText()));
			vendas.setPlaca(Field_Placa.getSelectedItem().toString());
			vendas.setValor_Total(Double.valueOf(Field_Total.getText().replace(",", ".")));
			vendaDAO.Insert(vendas);
			JOptionPane.showMessageDialog(this, "Produto adicionado com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
		}else if(contador_Table > 1) {
				while(contador_Table != 0) {
					vendas.setCod_venda(Field_Codigo.getText());
					vendas.setCliente_venda(Combo_Cadastrado.getSelectedItem().toString());
					vendas.setProduto(Combo_Produto.getSelectedItem().toString());
					vendas.setProduto(String.valueOf(jTable1.getModel().getValueAt(0, 0)));
					vendas.setQuant(String.valueOf(jTable1.getModel().getValueAt(0, 1)));
					vendas.setValor_venda(String.valueOf(jTable1.getModel().getValueAt(0, 2)));
					vendas.setPlaca(Field_Placa.getSelectedItem().toString());
					vendas.setCod_barras(String.valueOf(Field_Cod_Barras.getText()));
					vendas.setCpf_venda(String.valueOf(Field_Cpf.getText().replace("-", ".")));
					vendas.setCod_barras(String.valueOf(Field_Cod_Barras.getText().replace("-", ".")));
					vendas.setValor_Total(Double.valueOf(Field_Total.getText().replace(",", ".")));
					vendaDAO.Insert(vendas);
				tablemodel_Cadastrados.removeRow(0);
				contador_Table --;
				
			}
			JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
		}else if(contador_Table == 0) {
			erro();
			return false;
		}
		
		return true;
	}
 
 
 private void Lib_Campos(){
		Combo_Cadastrado.setEnabled(true);
		Combo_Produto.setEnabled(true);
		Combo_Cadastrado.setSelectedItem("Seleciona");
		Combo_Produto.setSelectedItem("Seleciona");
	}
 
 private void erro() {
		JOptionPane.showMessageDialog(this, "Nenhum produto ou serviço foi adicionado", "Erro", JOptionPane.WARNING_MESSAGE);
	}
 
 private boolean Verifica(){
		
		if(Combo_Cadastrado.getSelectedItem().equals("Seleciona")) {
			JOptionPane.showMessageDialog(this, "Por favor, Selecione um Cliente valido", "Erro", JOptionPane.WARNING_MESSAGE);
			Combo_Cadastrado.requestFocus();
			return false;
		}
		if(Combo_Produto.getSelectedItem().equals("Seleciona")) {
			JOptionPane.showMessageDialog(this, "Por favor, Selecione um Produto valido", "Erro", JOptionPane.WARNING_MESSAGE);
			Combo_Produto.requestFocus();
			return false;
		}
		if(Field_Cpf.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Por favor, preencha o cpf", "Erro", JOptionPane.WARNING_MESSAGE);
			Label_Cpf.requestFocus();
			return false;
		}
		
		if(Field_Cod_Barras.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Por favor, preencha o Codigo de Barras", "Campo vazio", JOptionPane.WARNING_MESSAGE);
			Field_Cod_Barras.requestFocus();
			return false;
		}
		if(Field_Codigo.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Por favor, preencha o Codigo", "Campo vazio", JOptionPane.WARNING_MESSAGE);
			Field_Codigo.requestFocus();
			return false;
		}
		
		if(Field_Quantidade.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Por favor, preencha a Quantidade", "Campo vazio", JOptionPane.WARNING_MESSAGE);
			Field_Quantidade.requestFocus();
			return false;
		}
		
		if(Field_Preco_Venda.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Por favor, preencha o Preço de Venda", "Campo vazio", JOptionPane.WARNING_MESSAGE);
			Field_Preco_Venda.requestFocus();
			return false;
		}
		
		if(Field_Placa.getSelectedItem().equals("Selecionar")) {
			JOptionPane.showMessageDialog(this, "Por favor, preencha o Placa", "Campo vazio", JOptionPane.WARNING_MESSAGE);
			Field_Placa.requestFocus();
			return false;
		}
		return true;
	}

 
 private void Mostra_Produto(){
		
		String sql = "SELECT * FROM produtos where Descricao = '" + Combo_Produto.getSelectedItem() +"'" ;
    	try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()){
				Field_Preco_Venda.setText(result.getString("preco_venda"));
				Field_Cod_Barras.setText(result.getString("cod_barras"));
				//Field_Codigo.setText(result.getString("cod_sistema"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		
		
	}
}
 
 private void Mostrar_Cliente(){	
	 		
	 		Field_Placa.removeAllItems();
	 		Field_Placa.addItem("Seleciona");
	 
	 
			String sql = "SELECT * FROM placa_veiculos where cliente = '" + Combo_Cadastrado.getSelectedItem() +"';";
	    	try {
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(sql);
				while(result.next()){
					Field_Placa.addItem(result.getString("placa"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
		}
	    	
			
				
			String sql_cpf = "SELECT CPF FROM CLIENTES WHERE NOME ='"+Combo_Cadastrado.getSelectedItem()+"'" ;
			try {
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(sql_cpf);
				while(result.next()){
					Field_Cpf.setText(result.getString("CPF"));
					}
				} catch (SQLException a) {
					a.printStackTrace();
				}
		}
	
 
 
 
 public void update_quantidade() {
		String sql = "UPDATE produtos SET quantidade = quantidade - retquant WHERE Descricao'"+Combo_Produto.getSelectedItem()+"'";
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()){
				Combo_Cadastrado.addItem(result.getString("placa"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		
		
	}
	}
 
 
 
 private void Limpa_tabela() {
	 DefaultTableModel tablemodel_Cadastrados = (DefaultTableModel) jTable1.getModel();
	 int resposta = JOptionPane.showConfirmDialog(null, "Deseja as Informações da tabela ?", "Excluir", JOptionPane.YES_NO_OPTION);
	
	 if(resposta == JOptionPane.YES_OPTION){
		 tablemodel_Cadastrados.setRowCount(0);
		}
	 
	 contador_Table = 0;
	 Field_Total.setText("0.00");
	 Lib_Campos();
 }
 
 private void Verica_Linha(){
		DefaultTableModel tablemodel_Cadastrados = (DefaultTableModel) jTable1.getModel();
		int Numero_linha = jTable1.getSelectedRow();
		 if(Numero_linha == -1) {
			  JOptionPane.showMessageDialog(this, "Linha não encontrado", "Erro", JOptionPane.WARNING_MESSAGE);
		 }else{
			 int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Excluir", JOptionPane.YES_NO_OPTION);
			 if(resposta == JOptionPane.YES_OPTION){
				  if(Numero_linha >= 0){
					  
					  Double produto = Double.valueOf((String) jTable1.getModel().getValueAt(Numero_linha, 1));
					  Double Qtd = Double.valueOf((String)jTable1.getModel().getValueAt(Numero_linha, 2));
					  Total = Total - (produto * Qtd);
					  Field_Total.setText(String.format("%.2f", Double.parseDouble(String.valueOf(Total))));
					  tablemodel_Cadastrados.removeRow(Numero_linha);
					  contador_Table --;
					  if(contador_Table == 0 ) Lib_Campos();
				  }
				}
		 }
	}
	
	// Variables declaration - do not modify                     
	 	private javax.swing.JButton Btn_Add_Produto;
	    private javax.swing.JButton Btn_Cancelar;
	    private javax.swing.JButton Btn_Finalizar;
	    private javax.swing.JButton Btn_Ordem;
	    private javax.swing.JButton Btn_Orcamento;
	    private javax.swing.JButton Btn_Remove;
	    private javax.swing.JComboBox<String> Combo_Cadastrado;
	    private javax.swing.JComboBox<String> Combo_Produto;
	    private javax.swing.JTextField Field_Cod_Barras;
	    private javax.swing.JTextField Field_Codigo;
	    private javax.swing.JFormattedTextField Field_Cpf;
	    private javax.swing.JFormattedTextField Field_Ordem;
	    private javax.swing.JComboBox<String> Field_Placa;
	    private javax.swing.JTextField Field_Preco_Venda;
	    private javax.swing.JTextField Field_Quantidade;
	    private javax.swing.JTextField Field_Total;
	    private javax.swing.JTextField Field_nao_cadastrado;
	    private javax.swing.JLabel Label_Cadastrados;
	    private javax.swing.JLabel Label_Cliente;
	    private javax.swing.JLabel Label_Cod_Venda;
	    private javax.swing.JLabel Label_Cod_barras;
	    private javax.swing.JLabel Label_Cpf;
	    private javax.swing.JLabel Label_Ordem;
	    private javax.swing.JLabel Label_Placa;
	    private javax.swing.JLabel Label_Prdouto;
	    private javax.swing.JLabel Label_Quantidade;
	    private javax.swing.JLabel Label_Titulo;
	    private javax.swing.JLabel Label_Total;
	    private javax.swing.JLabel Label_Valor;
	    private javax.swing.JLabel Label_data;
	    private javax.swing.JLabel Label_Editavel_data;
	    private javax.swing.JLabel Label_nao_cadastrados;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JSeparator jSeparator1;
	    private javax.swing.JSeparator jSeparator2;
	    private javax.swing.JTable jTable1;
	    private javax.swing.JRadioButton jRadioButton1;
	    private javax.swing.JRadioButton jRadioButton2;
	    private javax.swing.JRadioButton jRadioButton3;
	    private VendaDAO vendaDAO;
	    
    // End of variables declaration 
}