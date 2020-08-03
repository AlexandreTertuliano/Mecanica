package mecanica.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Tela_Venda extends JPanel{
	
	public Tela_Venda() {
		
			Label_Cod_Venda = new javax.swing.JLabel("Codigo");
	        Field_Codigo = new javax.swing.JTextField();
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
	        Btn_Orçamento = new javax.swing.JButton(" Orçamento");
	        Label_Cliente = new javax.swing.JLabel("Cliente");
	        Combo_Cadastrado = new javax.swing.JComboBox<>();
	        Field_nao_cadastrado = new javax.swing.JTextField();
	        Label_Cadastrados = new javax.swing.JLabel("Cadastrado");
	        Label_nao_cadastrados = new javax.swing.JLabel("Não Cadastrados");
	        Label_Cpf = new javax.swing.JLabel("Cpf");
	        Label_Placa = new javax.swing.JLabel("Placa  ");
	        Field_Placa = new javax.swing.JTextField();
	        Label_Total = new javax.swing.JLabel("Total");
	        Field_Total = new javax.swing.JTextField();
	        jLabel1 = new javax.swing.JLabel("Produtos");
	        jSeparator2 = new javax.swing.JSeparator();
	        Field_Cpf = new javax.swing.JFormattedTextField();
	        Btn_Remove = new javax.swing.JButton("Remover Produto");
	        Field_Quantidade.setText("1");
	        Label_Ordem = new javax.swing.JLabel("Numero da Ordem de Serviço");
	        Field_Ordem = new javax.swing.JFormattedTextField();
	        Btn_Orcamento = new javax.swing.JButton("Gerar");
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
	        
	        Btn_Orcamento.setBackground(Color.WHITE);
	        Btn_Orcamento.setToolTipText("Puxar Ordem de Serviço");
	        ImageIcon image_Ordem = new ImageIcon(getClass().getResource("/check-list.png"));
	        Btn_Orcamento.setIcon(image_Ordem);
	        
	        Btn_Finalizar.setBackground(Color.GREEN);
	        Btn_Finalizar.setToolTipText("Finalizar Venda");
	        ImageIcon image_finalizar = new ImageIcon(getClass().getResource("/tick.png"));
	        Btn_Finalizar.setIcon(image_finalizar);
	        
	        Btn_Orçamento.setBackground(Color.WHITE);
	        Btn_Orçamento.setToolTipText("Orçamento");
	        ImageIcon image_orcamento = new ImageIcon(getClass().getResource("/project.png"));
	        Btn_Orçamento.setIcon(image_orcamento);
	        
	        Btn_Remove.setBackground(Color.WHITE);
	        Btn_Remove.setToolTipText("Remover");
	        ImageIcon image_Remover = new ImageIcon(getClass().getResource("/minus.png"));
	        Btn_Remove.setIcon(image_Remover);
	        
	        
		
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
                                .addComponent(Btn_Orcamento))
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
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(Label_Total)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Field_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Btn_Orçamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_Finalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                            .addComponent(Btn_Orcamento)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_Total)
                        .addComponent(Field_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Btn_Finalizar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Btn_Orçamento)
                    .addGap(16, 16, 16))
            );
            
            Btn_Cancelar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Limpa_Dados();
				}
			});
        }
	
	private void Limpa_Dados() {
		
		Field_Cod_Barras.setText(null);
		Field_Quantidade.setText("1");
		Field_Preco_Venda.setText("0.00");
		
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
     
	
	
	// Variables declaration - do not modify                     
	 	private javax.swing.JButton Btn_Add_Produto;
	    private javax.swing.JButton Btn_Cancelar;
	    private javax.swing.JButton Btn_Finalizar;
	    private javax.swing.JButton Btn_Orcamento;
	    private javax.swing.JButton Btn_Orçamento;
	    private javax.swing.JButton Btn_Remove;
	    private javax.swing.JComboBox<String> Combo_Cadastrado;
	    private javax.swing.JComboBox<String> Combo_Produto;
	    private javax.swing.JTextField Field_Cod_Barras;
	    private javax.swing.JTextField Field_Codigo;
	    private javax.swing.JFormattedTextField Field_Cpf;
	    private javax.swing.JFormattedTextField Field_Ordem;
	    private javax.swing.JTextField Field_Placa;
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
    // End of variables declaration 
}
