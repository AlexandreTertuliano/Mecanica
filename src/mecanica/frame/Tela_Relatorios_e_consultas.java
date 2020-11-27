package mecanica.frame;


import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import mecanica.connection.ConnectionDAO;

public class Tela_Relatorios_e_consultas extends JPanel{

	private static final long serialVersionUID = 1L;
	private Connection connection;	
	
	public Tela_Relatorios_e_consultas() throws SQLException {
        initComponents();
        connection = ConnectionDAO.getConnection();
    }  
	
	
	private void initComponents() {
		
		jTabbedPane2 = new javax.swing.JTabbedPane();
        Panel_Cliente = new javax.swing.JPanel();
        Label_titulo = new javax.swing.JLabel();
        Titulo_entrada = new javax.swing.JLabel();
        sub_data = new javax.swing.JLabel();
        Field_data_inicio = new javax.swing.JFormattedTextField();
        Field_data_final = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        Btn_gerar_relatorio_entrada_no_periodo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Label_titulo_Vendas_cliente = new javax.swing.JLabel();
        Label_Informa_cliente = new javax.swing.JLabel();
        Combo_Cliente = new javax.swing.JComboBox<>();
        Field_cliente_Cpf = new javax.swing.JFormattedTextField();
        Btn_gerar_relatorio_vendas_cliente = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        Panel_Relatorios_Produtos = new javax.swing.JPanel();
        Label_titulo1 = new javax.swing.JLabel();
        Titulo_entrada1 = new javax.swing.JLabel();
        sub_data1 = new javax.swing.JLabel();
        Field_data_inicio_Produto = new javax.swing.JFormattedTextField();
        Field_data_final_Produto = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        Btn_gerar_relatorio_entrada_no_periodo_produto = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Label_titulo_gastos1 = new javax.swing.JLabel();
        Label_Informa_cliente1 = new javax.swing.JLabel();
        Combo_Produtos = new javax.swing.JComboBox<>();
        Btn_relatorios_vendas_por_produto = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        Field_Cod_Barras = new javax.swing.JTextField();
        Panel_relatorios_servicos = new javax.swing.JPanel();
        Label_titulo2 = new javax.swing.JLabel();
        Titulo_entrada2 = new javax.swing.JLabel();
        Btn_gerar_relatorio_servicos_por_cliente = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        Combo_cliente_serviço = new javax.swing.JComboBox<>();
        Field_Cliente_Servico = new javax.swing.JFormattedTextField();
        
        //INFORMAÇÔES DE ESTILO NÂO MUDAR ---- INICIO
        Btn_gerar_relatorio_entrada_no_periodo.setBackground(Color.WHITE);
        Btn_gerar_relatorio_entrada_no_periodo.setToolTipText("Gerar");
        ImageIcon image_Gerar = new ImageIcon(getClass().getResource("/tax.png"));
        Btn_gerar_relatorio_entrada_no_periodo.setIcon(image_Gerar);
        
        Btn_gerar_relatorio_entrada_no_periodo_produto.setBackground(Color.WHITE);
        Btn_gerar_relatorio_entrada_no_periodo_produto.setToolTipText("Gerar");
        Btn_gerar_relatorio_entrada_no_periodo_produto.setIcon(image_Gerar);
        
        Btn_gerar_relatorio_servicos_por_cliente.setBackground(Color.WHITE);
        Btn_gerar_relatorio_servicos_por_cliente.setToolTipText("Gerar");
        Btn_gerar_relatorio_servicos_por_cliente.setIcon(image_Gerar);
        
        Btn_gerar_relatorio_vendas_cliente.setBackground(Color.WHITE);
        Btn_gerar_relatorio_vendas_cliente.setToolTipText("Gerar");
        Btn_gerar_relatorio_vendas_cliente.setIcon(image_Gerar);
        
        Btn_relatorios_vendas_por_produto.setBackground(Color.WHITE);
        Btn_relatorios_vendas_por_produto.setToolTipText("Gerar");
        Btn_relatorios_vendas_por_produto.setIcon(image_Gerar);
        
        //INFORMAÇÔES DE ESTILO NÂO MUDAR ---- FIM

        Label_titulo.setText("CLIENTES");

        Titulo_entrada.setText("Entrada de clientes no periodo");

        sub_data.setText("Informe a data :");

        try {
            Field_data_inicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Field_data_final.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Até");

        Btn_gerar_relatorio_entrada_no_periodo.setText("Gerar");

        Label_titulo_Vendas_cliente.setText("Vendas Por Cliente");

        Label_Informa_cliente.setText("Informe o cliente ou digite o cpf : ");

        try {
            Field_cliente_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Btn_gerar_relatorio_vendas_cliente.setText("Gerar");

        javax.swing.GroupLayout Panel_ClienteLayout = new javax.swing.GroupLayout(Panel_Cliente);
        Panel_Cliente.setLayout(Panel_ClienteLayout);
        Panel_ClienteLayout.setHorizontalGroup(
            Panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ClienteLayout.createSequentialGroup()
                        .addGroup(Panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_ClienteLayout.createSequentialGroup()
                                .addGroup(Panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Field_data_inicio)
                                    .addComponent(sub_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(Field_data_final, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulo_entrada)
                            .addComponent(Btn_gerar_relatorio_entrada_no_periodo)
                            .addComponent(Label_titulo_Vendas_cliente)
                            .addComponent(Label_Informa_cliente)
                            .addComponent(Combo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(630, Short.MAX_VALUE))
                    .addGroup(Panel_ClienteLayout.createSequentialGroup()
                        .addGroup(Panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_gerar_relatorio_vendas_cliente)
                            .addComponent(Field_cliente_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(Panel_ClienteLayout.createSequentialGroup()
                .addGroup(Panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(Panel_ClienteLayout.createSequentialGroup()
                        .addGroup(Panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(jSeparator3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_ClienteLayout.setVerticalGroup(
            Panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_titulo)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo_entrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_data_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field_data_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(Btn_gerar_relatorio_entrada_no_periodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_titulo_Vendas_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Informa_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Combo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Field_cliente_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_gerar_relatorio_vendas_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Clientes", Panel_Cliente);

        Label_titulo1.setText("PRODUTOS");

        Titulo_entrada1.setText("Entrada de Produtos no periodo");

        sub_data1.setText("Informe a data :");

        try {
            Field_data_inicio_Produto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Field_data_final_Produto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Até");

        Btn_gerar_relatorio_entrada_no_periodo_produto.setText("Gerar");

        Label_titulo_gastos1.setText("Vendas por produto");

        Label_Informa_cliente1.setText("Informe o produto ou Digite o Codigo de Barras");

        Btn_relatorios_vendas_por_produto.setText("Gerar");

        javax.swing.GroupLayout Panel_Relatorios_ProdutosLayout = new javax.swing.GroupLayout(Panel_Relatorios_Produtos);
        Panel_Relatorios_Produtos.setLayout(Panel_Relatorios_ProdutosLayout);
        Panel_Relatorios_ProdutosLayout.setHorizontalGroup(
            Panel_Relatorios_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Relatorios_ProdutosLayout.createSequentialGroup()
                .addGroup(Panel_Relatorios_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(Panel_Relatorios_ProdutosLayout.createSequentialGroup()
                        .addGroup(Panel_Relatorios_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(jSeparator6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Panel_Relatorios_ProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_Relatorios_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Relatorios_ProdutosLayout.createSequentialGroup()
                        .addComponent(Btn_relatorios_vendas_por_produto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Panel_Relatorios_ProdutosLayout.createSequentialGroup()
                        .addGroup(Panel_Relatorios_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Field_Cod_Barras)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_Relatorios_ProdutosLayout.createSequentialGroup()
                                .addGroup(Panel_Relatorios_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Field_data_inicio_Produto)
                                    .addComponent(sub_data1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(Field_data_final_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label_titulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulo_entrada1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_gerar_relatorio_entrada_no_periodo_produto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_titulo_gastos1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Informa_cliente1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Combo_Produtos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(629, Short.MAX_VALUE))))
        );
        Panel_Relatorios_ProdutosLayout.setVerticalGroup(
            Panel_Relatorios_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Relatorios_ProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_titulo1)
                .addGap(3, 3, 3)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo_entrada1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_data1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Relatorios_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_data_inicio_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field_data_final_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(Btn_gerar_relatorio_entrada_no_periodo_produto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_titulo_gastos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Informa_cliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Combo_Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field_Cod_Barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Btn_relatorios_vendas_por_produto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Produtos", Panel_Relatorios_Produtos);

        Label_titulo2.setText("SERVIÇOS");

        Titulo_entrada2.setText("Serviços por cliente : ");

        Btn_gerar_relatorio_servicos_por_cliente.setText("Gerar");

        try {
            Field_Cliente_Servico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout Panel_relatorios_servicosLayout = new javax.swing.GroupLayout(Panel_relatorios_servicos);
        Panel_relatorios_servicos.setLayout(Panel_relatorios_servicosLayout);
        Panel_relatorios_servicosLayout.setHorizontalGroup(
            Panel_relatorios_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_relatorios_servicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_relatorios_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_titulo2)
                    .addComponent(Titulo_entrada2)
                    .addComponent(Btn_gerar_relatorio_servicos_por_cliente)
                    .addComponent(Field_Cliente_Servico, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(Combo_cliente_serviço, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Panel_relatorios_servicosLayout.createSequentialGroup()
                .addGroup(Panel_relatorios_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addGroup(Panel_relatorios_servicosLayout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 539, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_relatorios_servicosLayout.setVerticalGroup(
            Panel_relatorios_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_relatorios_servicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo_entrada2)
                .addGap(4, 4, 4)
                .addComponent(Combo_cliente_serviço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Field_Cliente_Servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_gerar_relatorio_servicos_por_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Serviços", Panel_relatorios_servicos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
    }
	
	public void Gerar_clientes(){
		Combo_Cliente.removeAllItems();
		Combo_Cliente.addItem("Seleciona");
		Combo_cliente_serviço.removeAllItems();
		Combo_cliente_serviço.addItem("Seleciona");
	 	
		 String sql = "SELECT * FROM clientes order by nome";
		 		
	    	try {
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(sql);
				while(result.next()){
				Combo_Cliente.addItem(result.getString("NOME"));
				Combo_cliente_serviço.addItem(result.getString("NOME"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void Gerar_produtos(){
		Combo_Produtos.removeAllItems();
		Combo_Produtos.addItem("Seleciona");
	
	 	
		 String sql = "SELECT * FROM produtos order by descricao";
		 		
	    	try {
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(sql);
				while(result.next()){
				Combo_Produtos.addItem(result.getString("descricao"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	// Variables declaration - do not modify                     
    private javax.swing.JButton Btn_gerar_relatorio_entrada_no_periodo;
    private javax.swing.JButton Btn_gerar_relatorio_entrada_no_periodo_produto;
    private javax.swing.JButton Btn_gerar_relatorio_servicos_por_cliente;
    private javax.swing.JButton Btn_gerar_relatorio_vendas_cliente;
    private javax.swing.JButton Btn_relatorios_vendas_por_produto;
    private javax.swing.JComboBox<String> Combo_Cliente;
    private javax.swing.JComboBox<String> Combo_Produtos;
    private javax.swing.JComboBox<String> Combo_cliente_serviço;
    private javax.swing.JFormattedTextField Field_Cliente_Servico;
    private javax.swing.JTextField Field_Cod_Barras;
    private javax.swing.JFormattedTextField Field_cliente_Cpf;
    private javax.swing.JFormattedTextField Field_data_final;
    private javax.swing.JFormattedTextField Field_data_final_Produto;
    private javax.swing.JFormattedTextField Field_data_inicio;
    private javax.swing.JFormattedTextField Field_data_inicio_Produto;
    private javax.swing.JLabel Label_Informa_cliente;
    private javax.swing.JLabel Label_Informa_cliente1;
    private javax.swing.JLabel Label_titulo;
    private javax.swing.JLabel Label_titulo1;
    private javax.swing.JLabel Label_titulo2;
    private javax.swing.JLabel Label_titulo_Vendas_cliente;
    private javax.swing.JLabel Label_titulo_gastos1;
    private javax.swing.JPanel Panel_Cliente;
    private javax.swing.JPanel Panel_Relatorios_Produtos;
    private javax.swing.JPanel Panel_relatorios_servicos;
    private javax.swing.JLabel Titulo_entrada;
    private javax.swing.JLabel Titulo_entrada1;
    private javax.swing.JLabel Titulo_entrada2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel sub_data;
    private javax.swing.JLabel sub_data1;
    // End of variables declaration  
}