package mecanica.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Tela_Agendamento extends JPanel {
	
	public Tela_Agendamento() {
        initComponents();
    }
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Label_titulo_Agendamento = new javax.swing.JLabel("Agendamento");
        jSeparator1 = new javax.swing.JSeparator();
        Label_Placa = new javax.swing.JLabel("Placa do Veiculo");
        Field_Placa_Veiculo = new java.awt.TextField();
        Label_Nome = new javax.swing.JLabel("Nome ");
        Field_Nome_Pessoa = new java.awt.TextField();
        Label_Data = new javax.swing.JLabel("Data");
        Field_Data = new javax.swing.JFormattedTextField();
        Label_Data_Semana = new javax.swing.JLabel("Dia da Semana :");
        Radio_Segunda = new javax.swing.JRadioButton("Segunda");
        Radio_terça = new javax.swing.JRadioButton("Terça");
        Radio_Quarta = new javax.swing.JRadioButton("Quarta");
        Radio_quinta = new javax.swing.JRadioButton("Quinta");
        Radio_sexta = new javax.swing.JRadioButton("Sexta");
        Radio_sabado = new javax.swing.JRadioButton("Sabádo");
        Radio_domingo = new javax.swing.JRadioButton("Domingo");
        Btn_Cancelar = new javax.swing.JButton("Cancelar");
        Btn_Salvar = new javax.swing.JButton("Salvar");
        Scroll_Agendamento = new javax.swing.JScrollPane();
        Table_Agendamento = new javax.swing.JTable();
        Label_Seleciona_Linha = new javax.swing.JLabel("Selecione uma linha e clique no botao para ver as informações");
        Btn_informações = new javax.swing.JButton("Serviço");
        Label_Servico = new javax.swing.JLabel("Serviço");
        Field_servico = new java.awt.TextField();
        Label_Edita_serviço = new java.awt.Label("Troca de oleo, alinhamento, motor");
        Label_editavel_nome = new java.awt.Label("Vinicius");
        Label_data_editavel = new javax.swing.JLabel("Data : 01/08/2020");
        Label_Dia_editavel = new javax.swing.JLabel("Dia: Sábado");
        Btn_excluir = new javax.swing.JButton("Excluir");
        Label_informacoes = new javax.swing.JLabel("Informações");
        jSeparator2 = new javax.swing.JSeparator();

        Label_titulo_Agendamento.setFont(new java.awt.Font("Arial Black", 0, 11));
        Label_informacoes.setFont(new java.awt.Font("Arial Black", 0, 11));
        
        Btn_Cancelar.setBackground(Color.WHITE);
        Btn_Cancelar.setToolTipText("Cancelar");
        ImageIcon image_Cancel = new ImageIcon(getClass().getResource("/close.png"));
        Btn_Cancelar.setIcon(image_Cancel);
        
        Btn_Salvar.setBackground(Color.WHITE);
        Btn_Salvar.setToolTipText("Salvar");
        ImageIcon image_Salvar = new ImageIcon(getClass().getResource("/tick.png"));
        Btn_Salvar.setIcon(image_Salvar);
        
        Btn_excluir.setBackground(Color.WHITE);
        Btn_excluir.setToolTipText("Excluir");
        ImageIcon image_Excluir = new ImageIcon(getClass().getResource("/delete.png"));
        Btn_excluir.setIcon(image_Excluir);
        
        Btn_informações.setBackground(Color.WHITE);
        Btn_informações.setToolTipText("Mostrar Informações do Serviço");
        ImageIcon image_Informacoes= new ImageIcon(getClass().getResource("/project.png"));
        Btn_informações.setIcon(image_Informacoes);
        
        ButtonGroup Btn_Group = new ButtonGroup();
        Btn_Group.add(Radio_Segunda);
        Btn_Group.add(Radio_terça);
        Btn_Group.add(Radio_Quarta);
        Btn_Group.add(Radio_quinta);
        Btn_Group.add(Radio_sexta);
        Btn_Group.add(Radio_sabado);
        Btn_Group.add(Radio_domingo);
        
        try {
            Field_Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_Data_Semana)
                            .addComponent(Label_titulo_Agendamento)
                            .addComponent(Label_Placa)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Label_Data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Label_Nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Label_Servico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Dia_editavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_data_editavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_editavel_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_Edita_serviço, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_informacoes)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Field_servico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Radio_domingo)
                                        .addComponent(Radio_sabado)
                                        .addComponent(Radio_sexta)
                                        .addComponent(Field_Nome_Pessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                        .addComponent(Field_Placa_Veiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Radio_Segunda)
                                        .addComponent(Radio_terça)
                                        .addComponent(Radio_quinta)
                                        .addComponent(Radio_Quarta)
                                        .addComponent(Field_Data))
                                    .addGap(316, 316, 316)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Btn_Salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_excluir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Scroll_Agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Seleciona_Linha)
                            .addComponent(Btn_informações))
                        .addGap(99, 99, 99))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_titulo_Agendamento))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Placa)
                            .addComponent(Field_Placa_Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Nome)
                            .addComponent(Field_Nome_Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Data)
                            .addComponent(Field_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Data_Semana)
                            .addComponent(Radio_Segunda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Radio_terça)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Radio_Quarta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Radio_quinta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Radio_sexta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Radio_sabado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Radio_domingo)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Servico)
                            .addComponent(Field_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Cancelar)
                            .addComponent(Btn_Salvar)
                            .addComponent(Btn_excluir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Scroll_Agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_Seleciona_Linha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_informações)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_informacoes)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_editavel_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_data_editavel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Dia_editavel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Edita_serviço, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        
        Btn_Cancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Limpa_dados();
			}
		});
        
    }
	
	private void Limpa_dados() {
		Field_servico.setText(" ");
	}
	
	public void data() {
		
			LocalDate atual_data = LocalDate.now();
			 
		    String data;
			int mes = atual_data.getMonthValue();
			int dia = atual_data.getDayOfMonth();

			if(dia < 10){
				data = "0" + String.valueOf(dia + 1) + "/";
			} else {
				data = String.valueOf(dia + 1) + "/";
			}
			if(mes < 10) {
				data = data + "0" + String.valueOf(mes) +  "/";
			} else {
				data = data +  String.valueOf(mes) + "/";
			}
			
			data = data + String.valueOf(atual_data.getYear());
			
			Field_Data.setText(data);
		
	}

    // Variables declaration - do not modify                     
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Salvar;
    private javax.swing.JButton Btn_excluir;
    private javax.swing.JButton Btn_informações;
    private java.awt.TextField Field_Nome_Pessoa;
    private java.awt.TextField Field_Placa_Veiculo;
    private java.awt.TextField Field_servico;
    private javax.swing.JLabel Label_Data;
    private javax.swing.JLabel Label_Data_Semana;
    private javax.swing.JLabel Label_Dia_editavel;
    private java.awt.Label Label_Edita_serviço;
    private javax.swing.JLabel Label_Nome;
    private javax.swing.JLabel Label_Placa;
    private javax.swing.JLabel Label_Seleciona_Linha;
    private javax.swing.JLabel Label_Servico;
    private javax.swing.JLabel Label_data_editavel;
    private java.awt.Label Label_editavel_nome;
    private javax.swing.JLabel Label_informacoes;
    private javax.swing.JLabel Label_titulo_Agendamento;
    private javax.swing.JRadioButton Radio_Quarta;
    private javax.swing.JRadioButton Radio_Segunda;
    private javax.swing.JRadioButton Radio_domingo;
    private javax.swing.JRadioButton Radio_quinta;
    private javax.swing.JRadioButton Radio_sabado;
    private javax.swing.JRadioButton Radio_sexta;
    private javax.swing.JRadioButton Radio_terça;
    private javax.swing.JScrollPane Scroll_Agendamento;
    private javax.swing.JTable Table_Agendamento;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JFormattedTextField Field_Data;
    // End of variables declaration             

}
