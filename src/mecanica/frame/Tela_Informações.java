package mecanica.frame;

import javax.swing.JPanel;

public class Tela_Informa��es extends JPanel {
	
	 public Tela_Informa��es() {
	        initComponents();
	    }
	 
	 
	 
	 @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        Label_Titulos = new javax.swing.JLabel();
	        jSeparator1 = new javax.swing.JSeparator();
	        Label_Qtd_Clientes = new javax.swing.JLabel();
	        Label_Edt_Qtd_Clientes = new javax.swing.JLabel();
	        Label_sem_movimentacao = new javax.swing.JLabel();
	        Label_Edt_Qtd_sem_movimento = new javax.swing.JLabel();
	        Label_Titulo_2 = new javax.swing.JLabel();
	        jSeparator2 = new javax.swing.JSeparator();
	        Label_qtd_prod = new javax.swing.JLabel();
	        Label_qtd_edt_prd = new javax.swing.JLabel();
	        Label_titulos_3 = new javax.swing.JLabel();
	        jSeparator3 = new javax.swing.JSeparator();

	        Label_Titulos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
	        Label_Titulos.setText("jLabel1");

	        Label_Qtd_Clientes.setText("Quantidade de clientes Cadastrados : ");

	        Label_Edt_Qtd_Clientes.setText("jLabel1");

	        Label_sem_movimentacao.setText("Clientes sem movimenta��o durante 1 m�s :  ");

	        Label_Edt_Qtd_sem_movimento.setText("jLabel1");

	        Label_Titulo_2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
	        Label_Titulo_2.setText("jLabel1");

	        Label_qtd_prod.setText("Quantidades de Produtos : ");

	        Label_qtd_edt_prd.setText("jLabel1");

	        Label_titulos_3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
	        Label_titulos_3.setText("jLabel1");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(Label_Titulos)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jSeparator1))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(Label_Titulo_2)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jSeparator2))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(Label_Qtd_Clientes)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(Label_Edt_Qtd_Clientes))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(Label_sem_movimentacao)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(Label_Edt_Qtd_sem_movimento))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(Label_qtd_prod)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(Label_qtd_edt_prd)))
	                        .addGap(0, 533, Short.MAX_VALUE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(Label_titulos_3)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jSeparator3)))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Label_Titulos))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(Label_Qtd_Clientes)
	                    .addComponent(Label_Edt_Qtd_Clientes))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(Label_sem_movimentacao)
	                    .addComponent(Label_Edt_Qtd_sem_movimento))
	                .addGap(51, 51, 51)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(Label_Titulo_2)
	                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(Label_qtd_prod)
	                    .addComponent(Label_qtd_edt_prd))
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(41, 41, 41)
	                        .addComponent(Label_titulos_3))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addGap(52, 52, 52)
	                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(213, Short.MAX_VALUE))
	        );
	    }                 


	    // Variables declaration - do not modify                     
	    private javax.swing.JLabel Label_Edt_Qtd_Clientes;
	    private javax.swing.JLabel Label_Edt_Qtd_sem_movimento;
	    private javax.swing.JLabel Label_Qtd_Clientes;
	    private javax.swing.JLabel Label_Titulo_2;
	    private javax.swing.JLabel Label_Titulos;
	    private javax.swing.JLabel Label_qtd_edt_prd;
	    private javax.swing.JLabel Label_qtd_prod;
	    private javax.swing.JLabel Label_sem_movimentacao;
	    private javax.swing.JLabel Label_titulos_3;
	    private javax.swing.JSeparator jSeparator1;
	    private javax.swing.JSeparator jSeparator2;
	    private javax.swing.JSeparator jSeparator3;
	    // End of variables declaration               

}
