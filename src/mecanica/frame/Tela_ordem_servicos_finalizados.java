package mecanica.frame;

import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sun.swing.internal.plaf.basic.resources.basic_ja;

import mecanicaDAO.Servico_Add;
import mecanicaDAOServico.ServicoDAO;


public class Tela_ordem_servicos_finalizados extends JPanel {
	
	public Tela_ordem_servicos_finalizados () throws SQLException {
        initComponents();
        servicoDAO = new ServicoDAO();
    }
	
	private void initComponents() {
		
		Pane_finalizados = new javax.swing.JScrollPane();
        Table_finalizados = new javax.swing.JTable();
        Label_titulo = new javax.swing.JLabel("Serviços Finalizados");
        
        Label_titulo.setFont(new java.awt.Font("Arial Black", 0, 14)); 

      //Coloca as especificações nos campos da tabela
     	Vector<String> columnOrdemFinalizado = new Vector<String>();
     	columnOrdemFinalizado.add("Codigo");
     	columnOrdemFinalizado.add("Cliente");
     	columnOrdemFinalizado.add("Valor Total");
		Vector<? extends Vector> vector = new Vector();
		Table_finalizados= new JTable(vector,columnOrdemFinalizado);
		Pane_finalizados = new JScrollPane(Table_finalizados);
	        
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pane_finalizados, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_titulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(Label_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pane_finalizados, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
	}
	
	
	public void Gerar_Ordens(){
		
		DefaultTableModel tablemodel_Cadastrados = (DefaultTableModel) Table_finalizados.getModel();
    	tablemodel_Cadastrados.setRowCount(0);
    	//int i = 1;
    	//String cad = (String) Table_add_Prod_Serv.getModel().getValueAt(i, 0);
    
        	for(Servico_Add servico : servicoDAO.getGroup_Tela_finalizados()){
            	
            		Object[] data = {
            				servico.getCod_Serv(),
            				servico.getCliente(),
            				servico.getValor_Total(),
            				
            		};
            			tablemodel_Cadastrados.addRow(data);
            
            	}   
        	
		
	}
	
	 // Variables declaration - do not modify                     
    private javax.swing.JLabel Label_titulo;
    private javax.swing.JScrollPane Pane_finalizados;
    private javax.swing.JTable Table_finalizados;
    private ServicoDAO servicoDAO;
    // End of variables declaration   

}
