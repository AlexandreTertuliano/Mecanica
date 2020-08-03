package mecanica.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Tela_Ordem_Servico extends JPanel {

	public Tela_Ordem_Servico() {
        initComponents();
    }
	
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Label_Titulo_Ordem = new javax.swing.JLabel("Ordem de Serviço");
        jSeparator1 = new javax.swing.JSeparator();
        Label_Cod_Servico = new javax.swing.JLabel("Codigo do Serviço : ");
        Label_Cliente = new javax.swing.JLabel("Cliente");
        Combo_Nome_Cliente = new javax.swing.JComboBox<>();
        Label_Data = new javax.swing.JLabel("Data : ");
        Label_Editavel_data = new javax.swing.JLabel();
        Label_Serviço = new javax.swing.JLabel("Serviço");
        ScrollPane_add_Produto_Servico = new javax.swing.JScrollPane();
        Table_add_Prod_Serv = new javax.swing.JTable();
        Label_Produto = new javax.swing.JLabel("Produto");
        Combo_Produto = new javax.swing.JComboBox<>();
        Label_funcionario = new javax.swing.JLabel("Funcionário");
        Combo_Funcionario = new javax.swing.JComboBox<>();
        Btn_Selecionar = new javax.swing.JButton("Cancelar");
        Btn_Adicionar = new javax.swing.JButton("Adicionar");
        Label_Titulo_ordem_Aberto = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        ScrollPane_Serv_abert = new javax.swing.JScrollPane();
        Table_servico_aberto = new javax.swing.JTable();
        Label_Selecione_Linha_ou_Cod = new javax.swing.JLabel("Selecione uma linha ou digite o codigo");
        Field_Cod_aberto = new javax.swing.JFormattedTextField();
        Btn_Busca_Senha = new javax.swing.JButton("Buscar Venda");
        textArea1 = new java.awt.TextArea();
        Label_valor = new javax.swing.JLabel("Valor Total do serviço : R$");
        Btn_gerar = new javax.swing.JButton("Gerar");
        Btn_Cancelar = new javax.swing.JButton("Cancelar");
        Label_Placa = new javax.swing.JLabel("Placa do Carro");
        textField1 = new javax.swing.JFormattedTextField();
        Btn_Remover = new javax.swing.JButton("Remover");
        Label_Quantidade = new javax.swing.JLabel("Quantidade");
        Field_Quantidade = new javax.swing.JFormattedTextField();
        field_editavel_total = new javax.swing.JFormattedTextField();
        Btn_Editar = new javax.swing.JButton("Editar Serviço");
        Btn_fazer_venda = new javax.swing.JButton("Finalizar Serviço");
        Field_Editavel_Cod_Servico = new javax.swing.JFormattedTextField();
        Label_valor_Serviço = new javax.swing.JLabel("Valor do Serviço");
        Field_Valor_serviço = new javax.swing.JFormattedTextField();
        Btn_Imprimir = new javax.swing.JButton("Imprimir");
        Label_valor_Produto = new javax.swing.JLabel("Valor");
        Field_Valor_Produto = new java.awt.TextField();

        Label_Titulo_Ordem.setFont(new java.awt.Font("Arial Black", 0, 12));
        Label_Cod_Servico.setFont(new java.awt.Font("Tahoma", 0, 12));
        Label_Data.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        Label_Editavel_data.setFont(new java.awt.Font("Tahoma", 0, 12));
        Label_Titulo_ordem_Aberto.setFont(new java.awt.Font("Arial Black", 0, 12));
        Label_valor.setFont(new java.awt.Font("Arial Black", 0, 14));
        Field_Quantidade.setText("1");
        field_editavel_total.setPreferredSize(new java.awt.Dimension(70, 30));
        Field_Editavel_Cod_Servico.setEnabled(false);
        
        
        Btn_Adicionar.setBackground(Color.WHITE);
        Btn_Adicionar.setToolTipText("Adcionar");
        ImageIcon image_Adcionar = new ImageIcon(getClass().getResource("/add.png"));
        Btn_Adicionar.setIcon(image_Adcionar);
        
        Btn_Busca_Senha.setBackground(Color.WHITE);
        Btn_Busca_Senha.setToolTipText("Buscar");
        ImageIcon image_Buscar = new ImageIcon(getClass().getResource("/search (1).png"));
        Btn_Busca_Senha.setIcon(image_Buscar);
        
        Btn_Cancelar.setBackground(Color.WHITE);
        Btn_Cancelar.setToolTipText("Cancelar");
        ImageIcon image_Cancel = new ImageIcon(getClass().getResource("/close.png"));
        Btn_Cancelar.setIcon(image_Cancel);
        
        Btn_Editar.setBackground(Color.WHITE);
        Btn_Editar.setToolTipText("Editar Serviço");
        ImageIcon image_Editar = new ImageIcon(getClass().getResource("/pencil.png"));
        Btn_Editar.setIcon(image_Editar);

        Btn_fazer_venda.setBackground(Color.WHITE);
        Btn_fazer_venda.setToolTipText("Finalizar");
        ImageIcon image_finalizar = new ImageIcon(getClass().getResource("/tick.png"));
        Btn_fazer_venda.setIcon(image_finalizar);
        
        Btn_gerar.setBackground(Color.WHITE);
        Btn_gerar.setToolTipText("Finalizar");
        ImageIcon image_gerar = new ImageIcon(getClass().getResource("/project.png"));
        Btn_gerar.setIcon(image_gerar);
        
        Btn_Imprimir.setBackground(Color.WHITE);
        Btn_Imprimir.setToolTipText("Imprimir");
        ImageIcon image_imprimir = new ImageIcon(getClass().getResource("/print.png"));
        Btn_Imprimir.setIcon(image_imprimir);
        
        Btn_Remover.setBackground(Color.WHITE);
        Btn_Remover.setToolTipText("Remover");
        ImageIcon image_tirar = new ImageIcon(getClass().getResource("/minus.png"));
        Btn_Remover.setIcon(image_tirar);
        
        Btn_Selecionar.setBackground(Color.WHITE);
        Btn_Selecionar.setToolTipText("Cancelar");
        Btn_Selecionar.setIcon(image_Cancel);
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label_Titulo_Ordem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSeparator1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(Label_Titulo_ordem_Aberto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSeparator3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(288, 288, 288)
                                                .addComponent(Label_valor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(field_editavel_total, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                                                .addComponent(Btn_Cancelar)
                                                .addGap(18, 18, 18)
                                                .addComponent(Btn_gerar))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(ScrollPane_add_Produto_Servico, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(235, 235, 235)
                                                    .addComponent(Label_Produto))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(Label_Data)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(Label_Editavel_data)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Label_Cliente)
                                                        .addComponent(Label_Serviço)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(Label_Cod_Servico)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Field_Editavel_Cod_Servico, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(66, 66, 66)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Combo_Nome_Cliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Combo_Produto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(Btn_Adicionar)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(Btn_Remover)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(Btn_Selecionar)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Label_valor_Serviço)
                                                .addComponent(Label_Quantidade)
                                                .addComponent(Label_Placa)
                                                .addComponent(Label_funcionario))
                                            .addGap(24, 24, 24)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Combo_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(Field_Valor_serviço, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addComponent(textField1, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Field_Quantidade))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Label_valor_Produto)))))
                                    .addGap(4, 4, 4)
                                    .addComponent(Field_Valor_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ScrollPane_Serv_abert, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Label_Selecione_Linha_ou_Cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(Btn_Busca_Senha))
                                .addComponent(Field_Cod_aberto))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Btn_fazer_venda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_Imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(29, 29, 29))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label_Titulo_Ordem))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_Cliente)
                        .addComponent(Combo_Nome_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label_Placa)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Produto)
                            .addComponent(Combo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Quantidade)
                            .addComponent(Field_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_valor_Produto)
                            .addComponent(Field_Valor_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Field_Editavel_Cod_Servico, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_Cod_Servico))
                                    .addGap(11, 11, 11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_Serviço)
                                        .addComponent(Label_Data)
                                        .addComponent(Label_Editavel_data))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Btn_Selecionar)
                                .addComponent(Btn_Adicionar)
                                .addComponent(Btn_Remover)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Label_valor_Serviço)
                                .addComponent(Field_Valor_serviço, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Combo_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Label_funcionario))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ScrollPane_add_Produto_Servico, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_valor)
                        .addComponent(Btn_gerar)
                        .addComponent(Btn_Cancelar)
                        .addComponent(field_editavel_total, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    		.addComponent(Label_Titulo_ordem_Aberto)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Label_Selecione_Linha_ou_Cod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Btn_Editar)
                                .addComponent(Field_Cod_aberto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Btn_Busca_Senha)
                                .addComponent(Btn_fazer_venda))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Btn_Imprimir))
                        .addComponent(ScrollPane_Serv_abert, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            
            //Botao do primeiro cancelar
            Btn_Selecionar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Limpa_Dados();
					
				}
			});
            
            Btn_Cancelar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Limpa_Dados();
					
				}
			});
        }            

	private void Limpa_Dados() {
		
		textArea1.setText(" ");
		Field_Valor_serviço.setText(null);
		Field_Quantidade.setText("1");
		Field_Valor_Produto.setText("0.00");		
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
	 private javax.swing.JButton Btn_Adicionar;
	    private javax.swing.JButton Btn_Busca_Senha;
	    private javax.swing.JButton Btn_Cancelar;
	    private javax.swing.JButton Btn_Editar;
	    private javax.swing.JButton Btn_Imprimir;
	    private javax.swing.JButton Btn_Remover;
	    private javax.swing.JButton Btn_Selecionar;
	    private javax.swing.JButton Btn_fazer_venda;
	    private javax.swing.JButton Btn_gerar;
	    private javax.swing.JComboBox<String> Combo_Funcionario;
	    private javax.swing.JComboBox<String> Combo_Nome_Cliente;
	    private javax.swing.JComboBox<String> Combo_Produto;
	    private javax.swing.JFormattedTextField Field_Cod_aberto;
	    private javax.swing.JFormattedTextField Field_Editavel_Cod_Servico;
	    private javax.swing.JFormattedTextField Field_Quantidade;
	    private java.awt.TextField Field_Valor_Produto;
	    private javax.swing.JFormattedTextField Field_Valor_serviço;
	    private javax.swing.JLabel Label_Cliente;
	    private javax.swing.JLabel Label_Cod_Servico;
	    private javax.swing.JLabel Label_Data;
	    private javax.swing.JLabel Label_Editavel_data;
	    private javax.swing.JLabel Label_Placa;
	    private javax.swing.JLabel Label_Produto;
	    private javax.swing.JLabel Label_Quantidade;
	    private javax.swing.JLabel Label_Selecione_Linha_ou_Cod;
	    private javax.swing.JLabel Label_Serviço;
	    private javax.swing.JLabel Label_Titulo_Ordem;
	    private javax.swing.JLabel Label_Titulo_ordem_Aberto;
	    private javax.swing.JLabel Label_funcionario;
	    private javax.swing.JLabel Label_valor;
	    private javax.swing.JLabel Label_valor_Produto;
	    private javax.swing.JLabel Label_valor_Serviço;
	    private javax.swing.JScrollPane ScrollPane_Serv_abert;
	    private javax.swing.JScrollPane ScrollPane_add_Produto_Servico;
	    private javax.swing.JTable Table_add_Prod_Serv;
	    private javax.swing.JTable Table_servico_aberto;
	    private javax.swing.JFormattedTextField field_editavel_total;
	    private javax.swing.JSeparator jSeparator1;
	    private javax.swing.JSeparator jSeparator3;
	    private java.awt.TextArea textArea1;
	    private javax.swing.JFormattedTextField textField1;
    // End of variables declaration   
	
}
