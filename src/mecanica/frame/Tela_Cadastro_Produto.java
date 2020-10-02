
package mecanica.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mecanica.connection.ConnectionDAO;
import mecanicaDAO.Cliente_add;
import mecanicaDAO.Fornecedor_add;
import mecanicaDAO.Produto_Add;
import mecanicaDAOFornecedores.FornecedoresDAO;
import mecanicaDAOProduto.ProdutoDAO;

public class Tela_Cadastro_Produto extends JPanel {
	
	private Connection connection;
	
	
	 public Tela_Cadastro_Produto() throws SQLException {
	        initComponents();
	        produtoDAO = new ProdutoDAO();
	        fornecedorDAO = new FornecedoresDAO();
	        connection = ConnectionDAO.getConnection();
	    }
	 
	 private void initComponents() {
	 
	 Label_Cod_Sistema = new javax.swing.JLabel("Codigo Sistema");
     Label_Cod_Barras = new javax.swing.JLabel("Codigo de Barras");
     Label_Descricao = new javax.swing.JLabel("Descri��o");
     Label_Quantidade = new javax.swing.JLabel("Quantidade");
     Label_Preco_Custo = new javax.swing.JLabel("Pre�o de Custo");
     Label_Preco_Venda = new javax.swing.JLabel("Pre�o de Venda");
     Btn_Porcentagem = new javax.swing.JButton();
     Label_Porcentagem = new javax.swing.JLabel("Porcentagem de Venda");
     ScrollPane_Cadastrados = new javax.swing.JScrollPane();
     Table_Cadastrados = new javax.swing.JTable();
     Label_Cadastrados = new javax.swing.JLabel("Cadastrados");
     Btn_Salvar = new javax.swing.JButton("Salvar");
     Btn_Cancelar = new javax.swing.JButton("Cancelar");
     Field_Cod_Sistema = new javax.swing.JFormattedTextField();
     Field_Descricao = new javax.swing.JFormattedTextField();
     Field_Quantidade = new javax.swing.JFormattedTextField();
     Field_Cod_Barras = new javax.swing.JFormattedTextField();
     Field_Porcentagem = new javax.swing.JFormattedTextField();
     Field_Preco_Custo = new javax.swing.JFormattedTextField();
     Field_Preco_Venda = new javax.swing.JFormattedTextField();
     Btn_Pesquisar = new javax.swing.JButton();
     Label_Titulo_Produto = new javax.swing.JLabel("Produto");
     jSeparator1 = new javax.swing.JSeparator();
     jSeparator2 = new javax.swing.JSeparator();
     Label_Titulo_Fornecedor = new javax.swing.JLabel("Fornecedor");
     Separador_Fornecedor = new javax.swing.JSeparator();
     Combo_Fornecedor = new javax.swing.JComboBox<>();
     Label_Selecione_Fornecedor = new javax.swing.JLabel("Selecione o Fornecedor");
     Label_Nome_Fornecedor = new javax.swing.JLabel("Tell Fornecedor");
     Field_Fornecedor_Nome = new javax.swing.JFormattedTextField();
     Label_CNPJ_Fornecedor = new javax.swing.JLabel("CNPJ Fornecedor");
     Field_Fornecedor_CNPJ =new javax.swing.JFormattedTextField();
     Label_Data = new javax.swing.JLabel("Data da Inclus�o");
     Field_Data = new javax.swing.JFormattedTextField();
     Btn_salvarEdit = new javax.swing.JButton("Editar");
     Label_qtd_min = new javax.swing.JLabel("Quantidade Minima");
     field_qtd_minima = new javax.swing.JFormattedTextField();
     Btn_busca_cod_sistema = new javax.swing.JButton();
    
     Label_Cadastrados.setFont(new java.awt.Font("Arial Black", 0, 12)); 
     Label_Titulo_Produto.setFont(new java.awt.Font("Arial Black", 0, 12));
     Label_Titulo_Fornecedor.setFont(new java.awt.Font("Arial Black", 0, 12)); 
     
     Field_Data.setEditable(false);
     
     Field_Quantidade.setText("1");
     Field_Porcentagem.setText("0");
     field_qtd_minima.setText("1");
     Field_Fornecedor_CNPJ.setEditable(false);
     Field_Fornecedor_Nome.setEditable(false);
     Btn_salvarEdit.setEnabled(false);
     
     Btn_Cancelar.setBackground(Color.WHITE);
     Btn_Cancelar.setToolTipText("Cancelar");
     ImageIcon image_Cancel = new ImageIcon(getClass().getResource("/close.png"));
     Btn_Cancelar.setIcon(image_Cancel);
     
     Btn_salvarEdit.setBackground(Color.WHITE);
     Btn_salvarEdit.setToolTipText("Salvar");
     ImageIcon image_edit = new ImageIcon(getClass().getResource("/pencil.png"));
     Btn_salvarEdit.setIcon(image_edit);
     
     Btn_Pesquisar.setBackground(Color.WHITE);
     Btn_Pesquisar.setToolTipText("Pesquisar");
     ImageIcon image_Lupa= new ImageIcon(getClass().getResource("/search (1).png"));
     Btn_Pesquisar.setIcon(image_Lupa);
     
     Btn_busca_cod_sistema.setBackground(Color.WHITE);
     Btn_busca_cod_sistema.setToolTipText("Pesquisar");
     Btn_busca_cod_sistema.setIcon(image_Lupa);
     
     Btn_Porcentagem.setBackground(Color.WHITE);
     Btn_Porcentagem.setToolTipText("Gerar Porcentagem");
     ImageIcon image_Porcentagem = new ImageIcon(getClass().getResource("/tax.png"));
     Btn_Porcentagem.setIcon(image_Porcentagem);
     
     Btn_Salvar.setBackground(Color.WHITE);
     Btn_Salvar.setToolTipText("Salvar");
     ImageIcon image_Salvar = new ImageIcon(getClass().getResource("/tick.png"));
     Btn_Salvar.setIcon(image_Salvar);
     
     
     	//Coloca as especifica��es nos campos da tabela
     	Vector<String> columnNames = new Vector<String>();
		columnNames.add("Codigo de Barras");
		columnNames.add("Codigo do Sistema");
		columnNames.add("Descri��o");
		columnNames.add("Estoque");
		columnNames.add("Pre�o de Venda");
		Vector<? extends Vector> vector = new Vector();
		Table_Cadastrados = new JTable(vector,columnNames);
		ScrollPane_Cadastrados = new JScrollPane(Table_Cadastrados);
     
     
     try {
         Field_Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
     } catch (java.text.ParseException ex) {
         ex.printStackTrace();
     }try {
         Field_Fornecedor_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
     } catch (java.text.ParseException ex) {
         ex.printStackTrace();
     }try {
         Field_Fornecedor_Nome.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-#####")));
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
                 .addComponent(ScrollPane_Cadastrados, javax.swing.GroupLayout.Alignment.TRAILING)
                 .addGroup(layout.createSequentialGroup()
                     .addComponent(Label_Cadastrados)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(jSeparator2))
                 .addGroup(layout.createSequentialGroup()
                     .addComponent(Label_Titulo_Produto)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                         .addGroup(layout.createSequentialGroup()
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(Combo_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addGroup(layout.createSequentialGroup()
                                     .addGap(83, 83, 83)
                                     .addComponent(Label_Selecione_Fornecedor)))
                             .addGap(55, 55, 55)
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(Label_CNPJ_Fornecedor)
                                 .addComponent(Field_Fornecedor_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(Label_Nome_Fornecedor)
                                 .addGroup(layout.createSequentialGroup()
                                     .addComponent(Field_Fornecedor_Nome)
                                     .addGap(69, 69, 69))))
                         .addGroup(layout.createSequentialGroup()
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout.createSequentialGroup()
                                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                         .addComponent(Label_Cod_Sistema)
                                         .addComponent(Label_Descricao))
                                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                         .addGroup(layout.createSequentialGroup()
                                             .addComponent(Field_Cod_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addComponent(Btn_busca_cod_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addComponent(Label_Cod_Barras)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                             .addComponent(Field_Cod_Barras, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                         .addComponent(Field_Descricao))
                                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                     .addComponent(Btn_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                 .addGroup(layout.createSequentialGroup()
                                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                         .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                             .addComponent(Label_Preco_Venda)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                             .addComponent(Field_Preco_Venda))
                                         .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                             .addComponent(Label_Porcentagem)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addComponent(Field_Porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                     .addComponent(Btn_Porcentagem))
                                 .addGroup(layout.createSequentialGroup()
                                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                         .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                             .addComponent(Label_Preco_Custo)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                             .addComponent(Field_Preco_Custo))
                                         .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                 .addComponent(Label_Data)
                                                 .addComponent(Label_Quantidade))
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                 .addComponent(Field_Quantidade)
                                                 .addComponent(Field_Data, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))))
                                     .addGap(18, 18, 18)
                                     .addComponent(Label_qtd_min)
                                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                     .addComponent(field_qtd_minima, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                             .addGap(0, 0, Short.MAX_VALUE))))
                 .addGroup(layout.createSequentialGroup()
                     .addComponent(Label_Titulo_Fornecedor)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addComponent(Separador_Fornecedor))
                 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                     .addGap(0, 0, Short.MAX_VALUE)
                     .addComponent(Btn_salvarEdit)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addComponent(Btn_Cancelar)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(Btn_Salvar)))
             .addContainerGap())
     );
     layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addGap(22, 22, 22)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                 .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(Label_Titulo_Produto))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(Label_Cod_Sistema)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(Label_Cod_Barras)
                     .addComponent(Field_Cod_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(Field_Cod_Barras, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(Btn_busca_cod_sistema))
                 .addComponent(Btn_Pesquisar))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(Label_Descricao)
                 .addComponent(Field_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(10, 10, 10)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(Label_Data)
                 .addComponent(Field_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(10, 10, 10)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(Label_Quantidade)
                 .addComponent(Field_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(Label_qtd_min)
                 .addComponent(field_qtd_minima, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(10, 10, 10)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(Label_Preco_Custo)
                 .addComponent(Field_Preco_Custo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(10, 10, 10)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(Label_Porcentagem)
                     .addComponent(Field_Porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addComponent(Btn_Porcentagem))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(Label_Preco_Venda)
                 .addComponent(Field_Preco_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(26, 26, 26)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                 .addComponent(Label_Titulo_Fornecedor)
                 .addComponent(Separador_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(Label_Selecione_Fornecedor)
                 .addComponent(Label_CNPJ_Fornecedor)
                 .addComponent(Label_Nome_Fornecedor))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(Combo_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(Field_Fornecedor_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(Field_Fornecedor_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(17, 17, 17)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(Btn_Salvar)
                 .addComponent(Btn_Cancelar)
                 .addComponent(Btn_salvarEdit))
             .addGap(18, 18, 18)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                 .addComponent(Label_Cadastrados)
                 .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(ScrollPane_Cadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addContainerGap())
     );
     
   //Funcao de colocar o cnpj e tell do fornecedor
   	 Combo_Fornecedor.addActionListener(new ActionListener() {
   		
   		@Override
   		public void actionPerformed(ActionEvent e) {
   			
   			String str = "Seleciona";
   			
   			if(str.equals(Combo_Fornecedor.getSelectedItem())){
   					Limpa();
   				}else{
   					Mostra_Fornecedor();
   				}
   		}
   	});
     
     //Funcao de Cancelar Cad
     Btn_Cancelar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar o cadastro",
					"Cadastro de Produto", JOptionPane.YES_NO_OPTION);
			if(resposta == JOptionPane.YES_OPTION) {
				Limpa_campos();
				
			}
			
		}
	});
     
     //Funcao de Gerar porcentagem na venda
     Btn_Porcentagem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Gerar_porcentagem();
			
		}
	});
     
     //Funcao de Salvar Produto
     Btn_Salvar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
				if( Verifica()) {
					Cad_Produto();
					Entrada_produto();
					Limpa_campos();
					update_tabela();
			}
				
		}
	});
    
     //Funcao de Pesquisar por Cod Barras
	 Btn_Pesquisar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (Field_Cod_Barras.getText().trim().isEmpty() ) {
				erro();
				 
			}else {
				if(Mostra_cadastro()){
				Btn_salvarEdit.setEnabled(true);
				Field_Cod_Sistema.setEnabled(false);
				
				}
			}
			
		}
	});
	 
	 //Funcao de pesquisar pelo codigo do sistema
	 Btn_busca_cod_sistema.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (Field_Cod_Sistema.getText().trim().isEmpty() ) {
				erro();
				 
			}else {
				if(Mostra_cadastro_via_cod_sistema()){
				Btn_salvarEdit.setEnabled(true);
				Field_Cod_Sistema.setEnabled(false);
				}
			}
		}
	});
	 
	 
	 
	 //Funcao de update cadastro
	 Btn_salvarEdit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			 Entrada_produto();
			 Update_produto();
			 Btn_Cancelar.setEnabled(true);
			 Btn_Salvar.setEnabled(true);
			 Btn_salvarEdit.setEnabled(false);
			 field_qtd_minima.setText("1");
			 Limpa_campos();
			 update_tabela();
			 Label_Quantidade.setForeground(new Color(55,65,65));
			 Field_Cod_Sistema.setEnabled(true);
		}
	});
	 }
	 
	 private void Limpa(){
		 	Field_Fornecedor_CNPJ.setText(null);
			Field_Fornecedor_Nome.setText(null);
	 }
	 
	 private void Mostra_Fornecedor(){
		 
		 for(Fornecedor_add fornecedor : fornecedorDAO.getAll()){
				 if(fornecedor.getRaz�o_Social().equals(Combo_Fornecedor.getSelectedItem())){
					 Field_Fornecedor_CNPJ.setText(fornecedor.getCnpj());
					 Field_Fornecedor_Nome.setText(fornecedor.getTell());	 
			}
	 }
}
	 
	 
	 private void Update_produto(){
		 
		 Produto_Add produto = new Produto_Add();
		 produto.setCod_Sistema(Field_Cod_Sistema.getText());
		 produto.setCod_Barras(Field_Cod_Barras.getText());
		 produto.setDescricao(Field_Descricao.getText());		
		 produto.setData(Field_Data.getText());
		 produto.setQuantidade(Field_Quantidade.getText());
		 produto.setPreco_custo(Field_Preco_Custo.getText());
		 produto.setPreco_Venda(Field_Preco_Venda.getText().replace(",", "."));
		 produto.setFornecedor(Combo_Fornecedor.getSelectedItem().toString());
		 produto.setQtd_minima(field_qtd_minima.getText());
		 produtoDAO.update_produto(produto);
		 
		 JOptionPane.showMessageDialog(this, "Produto Atualizado com sucesso! \n Verifique a tabela a baixo",
				 "Sucesso", JOptionPane.WARNING_MESSAGE);

	 }
	 
	 private boolean Verifica_update(){
		
		 if(Field_Cod_Barras.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha o Codigo de Barras",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Cod_Barras.requestFocus();
				return false;
		 }
		 if(Field_Descricao.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha a Descri��o do Produto",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Descricao.requestFocus();
				return false;
		 }
		 if(Field_Quantidade.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha Quantidade do Produto",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Quantidade.requestFocus();
				return false;
		 }
		 if(Field_Preco_Custo.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha o Pre�o de Custo",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Preco_Custo.requestFocus();
				return false;
		 }
		 if(Field_Preco_Venda.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha o Pre�o de Venda",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Preco_Venda.requestFocus();
				return false;
		 }
		
		 for(Produto_Add produto_igual : produtoDAO.getAll()){
			 if(Field_Descricao.getText().equals(produto_igual.getDescricao())){
				 JOptionPane.showMessageDialog(this, "Descri��o ja usado! Tente outro nome",
						 "Cadastrado", JOptionPane.WARNING_MESSAGE);
	    			Field_Descricao.requestFocus();
	    			return false;
			 }
		 }
		 		 
		 return true;
		
	 		 
	 	 }
	 
	 private void Update_produtos() {
		 
		 Produto_Add produto = new Produto_Add();
		 produto.setCod_Sistema(Field_Cod_Sistema.getText());
		 produto.setCod_Barras(Field_Cod_Barras.getText());
		 produto.setData(Field_Data.getText());
		 produto.setDescricao(Field_Descricao.getText());
		 produto.setPreco_custo(Field_Preco_Custo.getText());
		 produto.setPreco_Venda(Field_Preco_Venda.getText());
		 produto.setQuantidade(Field_Quantidade.getText());
		 produto.setFornecedor(Combo_Fornecedor.getSelectedItem().toString());
		 produtoDAO.update_produto(produto);
		 JOptionPane.showMessageDialog(this, "Atualizado com sucesso", "Atualizado", JOptionPane.WARNING_MESSAGE);
		 
	 }
	 
	 private boolean Mostra_cadastro() {
		 for(Produto_Add produto : produtoDAO.getAll()) {
			 if(produto.getCod_Barras().equals(Field_Cod_Barras.getText())) {
				Field_Cod_Sistema.setText(produto.getCod_Sistema());
				Field_Cod_Barras.setText(produto.getCod_Barras());
				Field_Data.setText(produto.getData());
				Field_Descricao.setText(produto.getDescricao());
				Field_Preco_Custo.setText(produto.getPreco_custo());
				Field_Preco_Venda.setText(produto.getPreco_Venda());
				Field_Quantidade.setText(produto.getQuantidade());
				Combo_Fornecedor.setSelectedItem(produto.getFornecedor());
				field_qtd_minima.setText(produto.getQtd_minima());
			 }
		 }		 
		 if(Field_Descricao.getText().trim().isEmpty()) {
			 JOptionPane.showMessageDialog(this, "Produto n�o cadastrado",
					 "Codigo Inv�lido", JOptionPane.WARNING_MESSAGE);
			 Field_Cod_Barras
			 .requestFocus();
			 Label_Quantidade.setForeground(new Color(55,65,65));
			 return false;
		 }
		 
		 if((Double.valueOf(field_qtd_minima.getText()) + 10) < Double.valueOf(Field_Quantidade.getText())){
			 Label_Quantidade.setForeground(new Color(0,255,0));
		 }if((Double.valueOf(field_qtd_minima.getText()) + 10) > Double.valueOf(Field_Quantidade.getText())){
			 Label_Quantidade.setForeground(new Color(200,200,0));
		 }if(Double.valueOf(field_qtd_minima.getText()) > Double.valueOf(Field_Quantidade.getText())){
			 Label_Quantidade.setForeground(new Color(255,0,0));
		 }
		 
		 Btn_Cancelar.setEnabled(false);
		 Btn_Salvar.setEnabled(false);
		 return true;
	 }
	 
	 private boolean Mostra_cadastro_via_cod_sistema() {
		 for(Produto_Add produto : produtoDAO.getAll()) {
			 if(produto.getCod_Sistema().equals(Field_Cod_Sistema.getText())) {
				Field_Cod_Sistema.setText(produto.getCod_Sistema());
				Field_Cod_Barras.setText(produto.getCod_Barras());
				Field_Data.setText(produto.getData());
				Field_Descricao.setText(produto.getDescricao());
				Field_Preco_Custo.setText(produto.getPreco_custo());
				Field_Preco_Venda.setText(produto.getPreco_Venda());
				Field_Quantidade.setText(produto.getQuantidade());
				Combo_Fornecedor.setSelectedItem(produto.getFornecedor());
				field_qtd_minima.setText(produto.getQtd_minima());
			 }
		 }		 
		 if(Field_Descricao.getText().trim().isEmpty()) {
			 JOptionPane.showMessageDialog(this, "Produto n�o cadastrado",
					 "Codigo Inv�lido", JOptionPane.WARNING_MESSAGE);
			 Field_Cod_Barras
			 .requestFocus();
			 Label_Quantidade.setForeground(new Color(55,65,65));
			 return false;
		 }
		 
		 if((Double.valueOf(field_qtd_minima.getText()) + 10) < Double.valueOf(Field_Quantidade.getText())){
			 Label_Quantidade.setForeground(new Color(0,255,0));
		 }if((Double.valueOf(field_qtd_minima.getText()) + 10) > Double.valueOf(Field_Quantidade.getText())){
			 Label_Quantidade.setForeground(new Color(200,200,0));
		 }if(Double.valueOf(field_qtd_minima.getText()) > Double.valueOf(Field_Quantidade.getText())){
			 Label_Quantidade.setForeground(new Color(255,0,0));
		 }
		 
		 Btn_Cancelar.setEnabled(false);
		 Btn_Salvar.setEnabled(false);
		 return true;
	 }
	 
	 private void erro() {
		 JOptionPane.showMessageDialog(this, "Por favor, preencha o Campo ao lado",
				 "Campo vazio", JOptionPane.WARNING_MESSAGE);
		 Field_Cod_Barras.requestFocus();
	 }
	 
	 private void Entrada_produto(){
		 
		 String total_estoque_antigo = null;
		 String total_estoque_novo = null;
		 String total_digitado = null;
		 
		 String Data = Field_Data.getText();
		 String [] DataSeparada = Data.split("/");
		 LocalDate dia = LocalDate.of(Integer.parseInt(DataSeparada[2]), Integer.parseInt(DataSeparada[1]), Integer.parseInt(DataSeparada[0]));
		  	
		 for(Produto_Add produto : produtoDAO.getAll()) {
			 if(produto.getCod_Sistema().equals(Field_Cod_Sistema.getText())) {
				total_estoque_antigo = produto.getQuantidade();
			 }
		 }	
		 if(total_estoque_antigo.equals("") || total_estoque_antigo.equals("0")){
			 Produto_Add produto = new Produto_Add();
			 produto.setCod_Sistema(Field_Cod_Sistema.getText());
			 produto.setCod_Barras(Field_Cod_Barras.getText());	
			 produto.setData_entrada(Date.valueOf(dia));
			 produto.setQuantidade(total_estoque_novo);
			 produtoDAO.Insert_Entrada(produto);
		 }else{
			 total_digitado = Field_Quantidade.getText();
			 
			 total_estoque_novo = String.valueOf(
					 (Double.valueOf(total_digitado)) - 
					 (Double.valueOf(total_estoque_antigo)));
			 
			 Produto_Add produto = new Produto_Add();
			 produto.setCod_Sistema(Field_Cod_Sistema.getText());
			 produto.setCod_Barras(Field_Cod_Barras.getText());	
			 produto.setData_entrada(Date.valueOf(dia));
			 produto.setQuantidade(total_estoque_novo);
			 produtoDAO.Insert_Entrada(produto);
		 }
		 
		 
		 total_estoque_antigo = null;
		 total_estoque_novo = null;
		 total_digitado = null;

	 }
	 
	 private void Cad_Produto() {
		 
		 //System.out.println(Field_Preco_Custo.getText());
		 //Field_Preco_Custo.getText().replace(",", ".");
		 //System.out.println(Field_Preco_Custo.getText());
		 
		 Produto_Add produto = new Produto_Add();
		 produto.setCod_Sistema(Field_Cod_Sistema.getText());
		 produto.setCod_Barras(Field_Cod_Barras.getText());
		 produto.setDescricao(Field_Descricao.getText());		
		 produto.setData(Field_Data.getText());
		 produto.setQuantidade(Field_Quantidade.getText());
		 produto.setPreco_custo(Field_Preco_Custo.getText().replace(",", "."));
		 produto.setPreco_Venda(Field_Preco_Venda.getText().replace(",", "."));
		 produto.setFornecedor(Combo_Fornecedor.getSelectedItem().toString());
		 produto.setQtd_minima(field_qtd_minima.getText());
		 produtoDAO.Insert(produto);
		 
		 JOptionPane.showMessageDialog(this, "Produto Cadastrado com sucesso! \n Verifique a tabela a baixo",
				 "Sucesso", JOptionPane.WARNING_MESSAGE);
		 		 
		 
	 }
	 
	 private void Gerar_porcentagem() {
		 
		 Double Valor_custo = (Double.parseDouble(Field_Preco_Custo.getText().replace(",", ".")));
		 Double Valor_porcentagem = (Double.parseDouble(Field_Porcentagem.getText()));
		 Double Valor_total;
		 
		 if(Field_Preco_Custo.getText().trim().isEmpty() ) {
				JOptionPane.showMessageDialog(this, "Pre�o de custo Invalido", "Invalido", JOptionPane.ERROR_MESSAGE);
				Field_Preco_Custo.requestFocus();
		 }
		 if(Field_Porcentagem.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Valor de Porcentagem Invalido",
						"Invalido", JOptionPane.ERROR_MESSAGE);
				Field_Porcentagem.requestFocus();
		 }
		 if(Valor_custo >= 0 && Valor_porcentagem >= 0 ) {
			 Valor_total =  (double) (Valor_porcentagem * Valor_custo);
			 Valor_porcentagem = (double) (Valor_total / 100);
			 Field_Preco_Venda.setText(String.format("%.2f", Double.parseDouble(String.valueOf(Valor_custo + Valor_porcentagem))));
		 }
		 
		 
	 }
	 
	 public void  data() {
		 
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
			
			Field_Data.setText(data);
			
	 }
	 
	 private void Limpa_campos() {
		 Field_Cod_Barras.setText(null);
		 Field_Cod_Sistema.setText(null);
		 Field_Descricao.setText(null);
		 Field_Fornecedor_CNPJ.setText(null);
		 Field_Porcentagem.setText("0");
		 Field_Preco_Custo.setText(null);
		 Field_Preco_Venda.setText(null);
		 Field_Quantidade.setText("1");
		 Field_Fornecedor_Nome.setText(null);
		 Combo_Fornecedor.setSelectedItem("Seleciona");
		 field_qtd_minima.setText("1");
	 }
	 
	 private boolean Verifica() {
		 
		/* if(Field_Cod_Barras.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha o Codigo de Barras",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Cod_Barras.requestFocus();
				return false;
		 }*/
		 if(Field_Cod_Sistema.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha o Codigo do Sistema",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Cod_Sistema.requestFocus();
				return false;
		 }
		 if(field_qtd_minima.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha a Quantidade m�nima",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				field_qtd_minima.requestFocus();
				return false;
		 }
		 if(Field_Descricao.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha a Descri��o do Produto",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Descricao.requestFocus();
				return false;
		 }
		 if(Field_Quantidade.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha Quantidade do Produto",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Quantidade.requestFocus();
				return false;
		 }
		 if(Field_Preco_Custo.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha o Pre�o de Custo",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Preco_Custo.requestFocus();
				return false;
		 }
		 if(Field_Preco_Venda.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Por favor, preencha o Pre�o de Venda",
						"Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Preco_Venda.requestFocus();
				return false;
		 }
		 if(Combo_Fornecedor.getSelectedItem().equals("Seleciona")){
				JOptionPane.showMessageDialog(this, "Selecione um fornecedor!",
						"Fornecedor Inv�lido", JOptionPane.WARNING_MESSAGE);
				Combo_Fornecedor.requestFocus();
				return false;
		 }
		 for(Produto_Add produto_igual : produtoDAO.getAll()){
			 if(Field_Cod_Barras.getText().equals(produto_igual.getCod_Barras())){
				 JOptionPane.showMessageDialog(this, "Codigo de Barras ja usado!",
						 "Cadastrado", JOptionPane.WARNING_MESSAGE);
	    			Field_Cod_Barras.requestFocus();
	    			return false;
			 }
		 }
		 for(Produto_Add produto_igual : produtoDAO.getAll()){
			 if(Field_Descricao.getText().equals(produto_igual.getDescricao())){
				 JOptionPane.showMessageDialog(this, "Descri��o ja usado! Tente outro nome",
						 "Cadastrado", JOptionPane.WARNING_MESSAGE);
	    			Field_Descricao.requestFocus();
	    			return false;
			 }
		 }
		 		 
		 return true;
	 }
	 
	 public void update_tabela() {

	    	DefaultTableModel tablemodel_Cadastrados = (DefaultTableModel) Table_Cadastrados.getModel();
	    	tablemodel_Cadastrados.setRowCount(0);
	    	
	    	for(Produto_Add produto : produtoDAO.getAll()){
	        	Object[] data = {
	    				produto.getCod_Barras(),
	    				produto.getCod_Sistema(),
	    				produto.getDescricao(),
	    				produto.getQuantidade(),
	    				produto.getPreco_Venda()
	    		};
	        	
	    		tablemodel_Cadastrados.addRow(data);
	    		
	        	}
	    	
		}
	 
	 public void Update_Combo_fornecedor(){
		 		 	
		 	Combo_Fornecedor.removeAllItems();
			Combo_Fornecedor.addItem("Seleciona");
			
		 	
			 String sql = "SELECT * FROM fornecedor order by razao_social";
			 		
		    	try {
					Statement statement = connection.createStatement();
					ResultSet result = statement.executeQuery(sql);
					while(result.next()){
					Combo_Fornecedor.addItem(result.getString("RAZAO_SOCIAL"));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
	 }
	 
	 // Variables declaration - do not modify                     
	    private javax.swing.JButton Btn_Cancelar;
	    private javax.swing.JButton Btn_Pesquisar;
	    private javax.swing.JButton Btn_Porcentagem;
	    private javax.swing.JButton Btn_Salvar;
	    private javax.swing.JButton Btn_salvarEdit;
	    private javax.swing.JButton Btn_busca_cod_sistema;
	    private javax.swing.JComboBox<String> Combo_Fornecedor;
	    private javax.swing.JFormattedTextField Field_Cod_Barras;
	    private javax.swing.JFormattedTextField Field_Cod_Sistema;
	    private javax.swing.JFormattedTextField Field_Data;
	    private javax.swing.JFormattedTextField Field_Descricao;
	    private javax.swing.JFormattedTextField Field_Fornecedor_CNPJ;
	    private javax.swing.JFormattedTextField Field_Fornecedor_Nome;
	    private javax.swing.JFormattedTextField Field_Porcentagem;
	    private javax.swing.JFormattedTextField Field_Preco_Custo;
	    private javax.swing.JFormattedTextField Field_Preco_Venda;
	    private javax.swing.JFormattedTextField Field_Quantidade;
	    private javax.swing.JLabel Label_CNPJ_Fornecedor;
	    private javax.swing.JLabel Label_Cadastrados;
	    private javax.swing.JLabel Label_Cod_Barras;
	    private javax.swing.JLabel Label_Cod_Sistema;
	    private javax.swing.JLabel Label_Data;
	    private javax.swing.JLabel Label_Descricao;
	    private javax.swing.JLabel Label_Nome_Fornecedor;
	    private javax.swing.JLabel Label_Porcentagem;
	    private javax.swing.JLabel Label_Preco_Custo;
	    private javax.swing.JLabel Label_Preco_Venda;
	    private javax.swing.JLabel Label_Quantidade;
	    private javax.swing.JLabel Label_Selecione_Fornecedor;
	    private javax.swing.JLabel Label_Titulo_Fornecedor;
	    private javax.swing.JLabel Label_Titulo_Produto;
	    private javax.swing.JLabel Label_qtd_min;
	    private javax.swing.JScrollPane ScrollPane_Cadastrados;
	    private javax.swing.JSeparator Separador_Fornecedor;
	    private javax.swing.JTable Table_Cadastrados;
	    private javax.swing.JFormattedTextField field_qtd_minima;
	    private javax.swing.JSeparator jSeparator1;
	    private javax.swing.JSeparator jSeparator2;           
	    private ProdutoDAO produtoDAO;
	    private FornecedoresDAO fornecedorDAO;
	 //End of variables declaration       

}
