package mecanica.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.postgresql.jdbc2.optional.SimpleDataSource;

public class Tela_Contas_Pagar_E_Vale extends JPanel {

	
	public Tela_Contas_Pagar_E_Vale() {
        initComponents();
    }
	
	
	  private void initComponents() {

	        Label_Titulo_Controle_Boleto = new javax.swing.JLabel("Controle de Boletos");
	        jSeparator1 = new javax.swing.JSeparator();
	        Label_descricao = new javax.swing.JLabel("Descrição");
	        Field_Descricao = new javax.swing.JFormattedTextField();
	        Label_Valor = new javax.swing.JLabel("Valor");
	        Field_valor = new javax.swing.JFormattedTextField();;
	        Label_Data_Vencimento = new javax.swing.JLabel("Data Vencimento");
	        Field_Data_Vencimento = new javax.swing.JFormattedTextField();;
	        Label_Num_Parcelas = new javax.swing.JLabel("Numeros de Parcelas");
	        Field_Num_Parcelas = new javax.swing.JFormattedTextField();;
	        Label_Titulo_Pago = new javax.swing.JLabel("Boletos Cadastrados      ");//Deixar com espaços
	        jSeparator2 = new javax.swing.JSeparator();
	        ScrollPane_Boletos = new javax.swing.JScrollPane();
	        Table_Boleto = new javax.swing.JTable();
	        jSeparator3 = new javax.swing.JSeparator();
	        Label_SubTitulo_Boleto = new javax.swing.JLabel();
	        Label_Titulo_Vale = new javax.swing.JLabel("Vale");
	        ScrollPane_Vales = new javax.swing.JScrollPane();
	        Table_Vales = new javax.swing.JTable();
	        Label_Inf_vale = new javax.swing.JLabel("Informações sobre quem pegou vale : ");
	        Label_Nome_vale = new javax.swing.JLabel("Nome");
	        Label_Valor_Vale = new javax.swing.JLabel("Valor");
	        Field_Vale_Valor = new javax.swing.JFormattedTextField();
	        Label_Data_Vale = new javax.swing.JLabel("Data");
	        Field_Vale_Data = new javax.swing.JFormattedTextField();
	        Btn_Salvar_Vale = new javax.swing.JButton("Salvar");
	        Btn_Cancelar_Vale = new javax.swing.JButton("Cancelar");
	        Btn_Zerar_Vale = new javax.swing.JButton("Recomeçar");
	        Btn_Cancelar_Boleto = new javax.swing.JButton("Cancelar");
	        Btn_Salvar_Boleto = new javax.swing.JButton("Salvar");
	        Label_Boleto_Pago = new javax.swing.JLabel("Marcar Boleto como pago: ");
	        Btn_Boleto_Pago = new javax.swing.JButton();
	        Label_Boleto_Cancelado = new javax.swing.JLabel("Cancelar Boleto: ");
	        Btn_Boleto_Cancelado = new javax.swing.JButton();
	        Label_total_Pagar = new javax.swing.JLabel("Total a Pagar : ");
	        Label_total_Editavel_Boletos = new javax.swing.JLabel("0.00");
	        Combo_Nome = new javax.swing.JComboBox<>();


	        Label_Titulo_Controle_Boleto.setFont(new java.awt.Font("Arial Black", 0, 12));
	        Field_Num_Parcelas.setText("1");	     
	        Label_Titulo_Pago.setFont(new java.awt.Font("Arial Black", 0, 12));
	        Label_SubTitulo_Boleto.setFont(new java.awt.Font("Arial Black", 0, 11));
	        Label_Titulo_Vale.setFont(new java.awt.Font("Arial Black", 0, 12));
	        Label_Inf_vale.setFont(new java.awt.Font("Arial Black", 0, 11));
	        Label_Boleto_Pago.setFont(new java.awt.Font("Arial", 0, 15));
	        Label_Boleto_Cancelado.setFont(new java.awt.Font("Arial", 0, 15));
	        Label_total_Pagar.setFont(new java.awt.Font("Arial", 0, 15));
	        Label_total_Editavel_Boletos.setFont(new java.awt.Font("Arial", 0, 18));
	        
	        
	       Btn_Salvar_Boleto.setBackground(Color.WHITE);
	       Btn_Salvar_Boleto.setToolTipText("Salvar");
	       ImageIcon image_Salvar = new ImageIcon(getClass().getResource("/tick.png"));
	       Btn_Salvar_Boleto.setIcon(image_Salvar);
	       
	       Btn_Cancelar_Boleto.setBackground(Color.WHITE);
	       Btn_Cancelar_Boleto.setToolTipText("Cancelar");
	       ImageIcon image_Cancel = new ImageIcon(getClass().getResource("/close.png"));
	       Btn_Cancelar_Boleto.setIcon(image_Cancel);
	       
	       Btn_Salvar_Vale.setBackground(Color.WHITE);
	       Btn_Salvar_Vale.setToolTipText("Salvar");
	       Btn_Salvar_Vale.setIcon(image_Salvar);
	       
	       Btn_Cancelar_Vale.setBackground(Color.WHITE);
	       Btn_Cancelar_Vale.setToolTipText("Cancelar");
	       Btn_Cancelar_Vale.setIcon(image_Cancel);

	       Btn_Boleto_Cancelado.setBackground(Color.WHITE);
	       Btn_Boleto_Cancelado.setToolTipText("Cancelar Boleto");
	       ImageIcon image_boleto_nao_pago = new ImageIcon(getClass().getResource("/no-money.png"));
	       Btn_Boleto_Cancelado.setIcon(image_boleto_nao_pago);
	       
	       Btn_Boleto_Pago.setBackground(Color.WHITE);
	       ImageIcon image_boleto_pago = new ImageIcon(getClass().getResource("/accepted.png"));
	       Btn_Boleto_Pago.setToolTipText("Boleto Pago");
	       Btn_Boleto_Pago.setIcon(image_boleto_pago);
	       
	       Btn_Zerar_Vale.setBackground(Color.WHITE);
	       Btn_Zerar_Vale.setToolTipText("Zerar Vales");
	       ImageIcon image_zerar = new ImageIcon(getClass().getResource("/Zerar_Boleto.png"));
	       Btn_Zerar_Vale.setIcon(image_zerar);
	       
	       
	       //Coloca as especificações nos campos da tabela
	     	Vector<String> columnNames = new Vector<String>();
			columnNames.add("Descrição");
			columnNames.add("Data Venciemento");
			columnNames.add("Valor");
			Vector<? extends Vector> vector = new Vector();
			Table_Boleto = new JTable(vector,columnNames);
			ScrollPane_Boletos = new JScrollPane(Table_Boleto);
	       
	        try {
	            Field_Data_Vencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
	        } catch (java.text.ParseException ex) {
	            ex.printStackTrace();
	        } try {
	            Field_Vale_Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
	        } catch (java.text.ParseException ex) {
	            ex.printStackTrace();
	        }
	        
	        
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(layout.createSequentialGroup()
	                            .addContainerGap()
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(layout.createSequentialGroup()
	                                    .addComponent(Label_Titulo_Controle_Boleto)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                    .addComponent(jSeparator1))
	                                .addGroup(layout.createSequentialGroup()
	                                    .addComponent(Label_Titulo_Vale)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addGroup(layout.createSequentialGroup()
	                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                                .addGroup(layout.createSequentialGroup()
	                                                    .addComponent(Btn_Cancelar_Vale)
	                                                    .addGap(18, 18, 18)
	                                                    .addComponent(Btn_Salvar_Vale)
	                                                    .addGap(102, 102, 102))
	                                                .addGroup(layout.createSequentialGroup()
	                                                    .addComponent(Label_Nome_vale)
	                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                                        .addComponent(Label_Inf_vale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                                        .addComponent(Combo_Nome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                                .addGroup(layout.createSequentialGroup()
	                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                                            .addComponent(Label_Data_Vale)
	                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
	                                                        .addGroup(layout.createSequentialGroup()
	                                                            .addComponent(Label_Valor_Vale)
	                                                            .addGap(18, 18, 18)))
	                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                                        .addComponent(Field_Vale_Valor, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
	                                                        .addComponent(Field_Vale_Data))))
	                                            .addGap(18, 18, Short.MAX_VALUE)
	                                            .addComponent(Btn_Zerar_Vale)
	                                            .addGap(18, 18, 18)
	                                            .addComponent(ScrollPane_Vales, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                        .addComponent(jSeparator3)))))
	                        .addGroup(layout.createSequentialGroup()
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(layout.createSequentialGroup()
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addGroup(layout.createSequentialGroup()
	                                            .addGap(13, 13, 13)
	                                            .addComponent(Label_Titulo_Pago))
	                                        .addGroup(layout.createSequentialGroup()
	                                            .addGap(23, 23, 23)
	                                            .addComponent(Label_total_Pagar)
	                                            .addGap(18, 18, 18)
	                                            .addComponent(Label_total_Editavel_Boletos)))
	                                    .addGap(18, 18, 18)
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                            .addComponent(Label_Boleto_Cancelado)
	                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                            .addComponent(Btn_Boleto_Cancelado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                            .addGroup(layout.createSequentialGroup()
	                                                .addComponent(Label_Boleto_Pago)
	                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                                .addComponent(Btn_Boleto_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(Label_SubTitulo_Boleto)))
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
	                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addComponent(Label_descricao, javax.swing.GroupLayout.Alignment.TRAILING)
	                                        .addComponent(Label_Valor, javax.swing.GroupLayout.Alignment.TRAILING)
	                                        .addComponent(Label_Data_Vencimento, javax.swing.GroupLayout.Alignment.TRAILING)
	                                        .addComponent(Label_Num_Parcelas, javax.swing.GroupLayout.Alignment.TRAILING))
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                            .addGroup(layout.createSequentialGroup()
	                                                .addComponent(Field_Num_Parcelas, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
	                                                .addGap(62, 62, 62)
	                                                .addComponent(Btn_Cancelar_Boleto)
	                                                .addGap(18, 18, 18)
	                                                .addComponent(Btn_Salvar_Boleto))
	                                            .addComponent(Field_Descricao))
	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                            .addComponent(Field_Data_Vencimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
	                                            .addComponent(Field_valor, javax.swing.GroupLayout.Alignment.LEADING)))
	                                    .addGap(58, 58, 58)))
	                            .addComponent(ScrollPane_Boletos, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addContainerGap())
	            );
	            layout.setVerticalGroup(
	                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                    .addContainerGap()
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(Label_Titulo_Controle_Boleto))
	                    .addGap(18, 18, 18)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(layout.createSequentialGroup()
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                .addComponent(Label_descricao)
	                                .addComponent(Field_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGap(10, 10, 10)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                .addComponent(Label_Valor)
	                                .addComponent(Field_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGap(10, 10, 10)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                .addComponent(Label_Data_Vencimento)
	                                .addComponent(Field_Data_Vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGap(10, 10, 10)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(layout.createSequentialGroup()
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                        .addComponent(Label_Num_Parcelas)
	                                        .addComponent(Field_Num_Parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                    .addGap(22, 22, 22)
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                        .addComponent(Label_Titulo_Pago)
	                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                    .addComponent(Btn_Cancelar_Boleto)
	                                    .addComponent(Btn_Salvar_Boleto)))
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(Label_SubTitulo_Boleto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(Btn_Boleto_Pago)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                    .addComponent(Label_Boleto_Pago)
	                                    .addComponent(Label_total_Pagar)
	                                    .addComponent(Label_total_Editavel_Boletos)))
	                            .addGap(18, 18, 18)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(Btn_Boleto_Cancelado)
	                                .addComponent(Label_Boleto_Cancelado)))
	                        .addComponent(ScrollPane_Boletos, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(18, 18, 18)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(Label_Titulo_Vale))
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                        .addGroup(layout.createSequentialGroup()
	                            .addGap(26, 26, 26)
	                            .addComponent(Label_Inf_vale)
	                            .addGap(18, 18, 18)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                .addComponent(Label_Nome_vale)
	                                .addComponent(Combo_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGap(10, 10, 10)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                .addComponent(Label_Valor_Vale)
	                                .addComponent(Field_Vale_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGap(10, 10, 10)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                .addComponent(Label_Data_Vale)
	                                .addComponent(Field_Vale_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGap(30, 30, 30)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                .addComponent(Btn_Cancelar_Vale)
	                                .addComponent(Btn_Salvar_Vale)
	                                .addComponent(Btn_Zerar_Vale)))
	                        .addGroup(layout.createSequentialGroup()
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(ScrollPane_Vales, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
	                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            );
	            
	        Btn_Salvar_Boleto.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
						if(Verifica()){
						Cad_Boleto();
						}
					
			}
		});    
	        
	        Btn_Cancelar_Boleto.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Limpa_Campos();
					
				}
			});
	        
	        Btn_Cancelar_Vale.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Limpa_Campos_Vale();
					
				}
			});

	    }
	  
	  private boolean Verifica() {
		 
		  
		  if(Field_Descricao.getText().trim().isEmpty()){
				JOptionPane.showMessageDialog(this, "Por favor, preencha a Descrição do Boleto", "Campo vazio", JOptionPane.WARNING_MESSAGE);
				Field_Descricao.requestFocus();
				return false;
		  }
		  if(Field_Data_Vencimento.getText().trim().isEmpty()){
			  JOptionPane.showMessageDialog(this, "Por favor, preencha a Data de Vencimento ", "Campo vazio", JOptionPane.WARNING_MESSAGE);
			 Field_Data_Vencimento.requestFocus();
			 return false;
		  }
		  if(Field_Num_Parcelas.getText().trim().isEmpty()){
			  JOptionPane.showMessageDialog(this, "Por favor, preencha a Parcela", "Campo vazio", JOptionPane.WARNING_MESSAGE);
			  Field_Num_Parcelas.requestFocus();
			  return false;
		  }
		  if(Field_valor.getText().trim().isEmpty()){
			  JOptionPane.showMessageDialog(this, "Por favor, preencha o Valor", "Campo vazio", JOptionPane.WARNING_MESSAGE);
			  Field_valor.requestFocus();
			  return false;
		  }
		  
		  
		  return true;
	  }
	  
	  private void Cad_Boleto(){
		  
		  
		  
	  }
	  
	  private void Limpa_Campos_Vale() {
		  
		  Field_Vale_Valor.setText(null);
		  
	  }
	  
	  private void Limpa_Campos() {
		  
		  Field_Descricao.setText(null);
		  Field_Num_Parcelas.setText("1");
		  Field_valor.setText(null);
	  }
	  
	  public void data_mes() {
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
				data = data + "0" + String.valueOf(mes + 1) +  "/";
			} else {
				data = data +  String.valueOf(mes + 1) + "/";
			}	
				
			data = data + String.valueOf(atual_data.getYear());
			
			
			Field_Data_Vencimento.setText(data);
	  }
	
	  public void data_vale() {
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
			
			Field_Vale_Data.setText(data);
			data_Atual = data;
	  }
	
	 // Variables declaration - do not modify                     
	  private javax.swing.JButton Btn_Boleto_Cancelado;
	    private javax.swing.JButton Btn_Boleto_Pago;
	    private javax.swing.JButton Btn_Cancelar_Boleto;
	    private javax.swing.JButton Btn_Cancelar_Vale;
	    private javax.swing.JButton Btn_Salvar_Boleto;
	    private javax.swing.JButton Btn_Salvar_Vale;
	    private javax.swing.JButton Btn_Zerar_Vale;
	    private javax.swing.JComboBox<String> Combo_Nome;
	    private javax.swing.JFormattedTextField Field_Data_Vencimento;
	    private javax.swing.JFormattedTextField Field_Descricao;
	    private javax.swing.JFormattedTextField Field_Num_Parcelas;
	    private javax.swing.JFormattedTextField Field_Vale_Data;
	    private javax.swing.JFormattedTextField Field_Vale_Valor;
	    private javax.swing.JFormattedTextField Field_valor;
	    private javax.swing.JLabel Label_Boleto_Cancelado;
	    private javax.swing.JLabel Label_Boleto_Pago;
	    private javax.swing.JLabel Label_Data_Vale;
	    private javax.swing.JLabel Label_Data_Vencimento;
	    private javax.swing.JLabel Label_Inf_vale;
	    private javax.swing.JLabel Label_Nome_vale;
	    private javax.swing.JLabel Label_Num_Parcelas;
	    private javax.swing.JLabel Label_SubTitulo_Boleto;
	    private javax.swing.JLabel Label_Titulo_Controle_Boleto;
	    private javax.swing.JLabel Label_Titulo_Pago;
	    private javax.swing.JLabel Label_Titulo_Vale;
	    private javax.swing.JLabel Label_Valor;
	    private javax.swing.JLabel Label_Valor_Vale;
	    private javax.swing.JLabel Label_descricao;
	    private javax.swing.JLabel Label_total_Editavel_Boletos;
	    private javax.swing.JLabel Label_total_Pagar;
	    private javax.swing.JScrollPane ScrollPane_Boletos;
	    private javax.swing.JScrollPane ScrollPane_Vales;
	    private javax.swing.JTable Table_Boleto;
	    private javax.swing.JTable Table_Vales;
	    private javax.swing.JSeparator jSeparator1;
	    private javax.swing.JSeparator jSeparator2;
	    private javax.swing.JSeparator jSeparator3;
	    private String data_Atual;
    // End of variables declaration             
	
}
