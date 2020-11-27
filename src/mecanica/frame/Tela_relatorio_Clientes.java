package mecanica.frame;

import javax.swing.JPanel;

public class Tela_relatorio_Clientes extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public Tela_relatorio_Clientes() {
	        initComponents();
	    }
	 
	 
	  private void initComponents() {

		    Label_titulo = new javax.swing.JLabel();
	        Label_Entrada_Clientes = new javax.swing.JLabel();
	        Label_Seleciona = new javax.swing.JLabel();
	        Combo_Seleciona_Cliente = new javax.swing.JComboBox<>();
	        Radio_periodo = new javax.swing.JRadioButton();
	        Btn_Gerar = new javax.swing.JButton();
	        Field_Data_Inicio = new javax.swing.JFormattedTextField();
	        Label_ate = new javax.swing.JLabel();
	        Field_Data_Final = new javax.swing.JFormattedTextField();

	        Label_titulo.setText("jLabel1");

	        Label_Entrada_Clientes.setText("jLabel1");

	        Label_Seleciona.setText("jLabel1");

	        Radio_periodo.setText("jRadioButton1");

	        Btn_Gerar.setText("jButton1");

	        try {
	            Field_Data_Inicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
	        } catch (java.text.ParseException ex) {
	            ex.printStackTrace();
	        }

	        Label_ate.setText("jLabel1");

	        try {
	            Field_Data_Final.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
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
	                    .addComponent(Radio_periodo)
	                    .addComponent(Label_titulo)
	                    .addComponent(Label_Entrada_Clientes)
	                    .addComponent(Label_Seleciona)
	                    .addComponent(Combo_Seleciona_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Btn_Gerar)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(Field_Data_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(Label_ate)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(Field_Data_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(694, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(Label_titulo)
	                .addGap(30, 30, 30)
	                .addComponent(Label_Entrada_Clientes)
	                .addGap(18, 18, 18)
	                .addComponent(Label_Seleciona)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(Combo_Seleciona_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(Radio_periodo)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(Field_Data_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Label_ate)
	                    .addComponent(Field_Data_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(11, 11, 11)
	                .addComponent(Btn_Gerar)
	                .addContainerGap(274, Short.MAX_VALUE))
	        );
	    }  
	  
	  
	  // Variables declaration - do not modify                     
	    private javax.swing.JButton Btn_Gerar;
	    private javax.swing.JComboBox<String> Combo_Seleciona_Cliente;
	    private javax.swing.JFormattedTextField Field_Data_Final;
	    private javax.swing.JFormattedTextField Field_Data_Inicio;
	    private javax.swing.JLabel Label_Entrada_Clientes;
	    private javax.swing.JLabel Label_Seleciona;
	    private javax.swing.JLabel Label_ate;
	    private javax.swing.JLabel Label_titulo;
	    private javax.swing.JRadioButton Radio_periodo;
	    // End of variables declaration              
	
}
