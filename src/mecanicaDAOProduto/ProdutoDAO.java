package mecanicaDAOProduto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mecanica.connection.ConnectionDAO;
import mecanicaDAO.Cliente_add;
import mecanicaDAO.Produto_Add;

public class ProdutoDAO {
	
private Connection connection;
	
	public ProdutoDAO() throws SQLException {
		connection = ConnectionDAO.getConnection();
	}
	
	public void Insert(Produto_Add produto) {
	
		String sql = "INSERT INTO PRODUTOS ( COD_BARRAS, COD_SISTEMA, DESCRICAO, DATA_INCLUSAO," +
				"FORNECEDOR,QUANTIDADE, PRECO_CUSTO, PRECO_VENDA, PROD_MINUMO)" +
				"VALUES (?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			int index = 1;
				statement.setString(index++, produto.getCod_Barras());
				statement.setString(index++, produto.getCod_Sistema());
				statement.setString(index++, produto.getDescricao());
				statement.setString(index++, produto.getData());
				statement.setString(index++, produto.getFornecedor());
				statement.setString(index++, produto.getQuantidade());
				statement.setString(index++, produto.getPreco_custo());
				statement.setString(index++, produto.getPreco_Venda());
				statement.setDouble(index++, Double.valueOf(produto.getQtd_minima()));
				statement.execute();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}
	public void Insert_Entrada(Produto_Add produto) {
		
		String sql = "INSERT INTO ENTRADA_PRODUTO ( COD_BARRAS, COD_SISTEMA, DATA_INCLUSAO," +
				" QUANTIDADE)" +
				"VALUES (?,?,?,?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			int index = 1;
				statement.setString(index++, produto.getCod_Barras());
				statement.setString(index++, produto.getCod_Sistema());
				statement.setDate(index++, (Date) produto.getData_entrada());
				statement.setString(index++, produto.getQuantidade());
				statement.execute();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}

	
	public List<Produto_Add> getAll() {
		List<Produto_Add> produtos = new ArrayList<Produto_Add>();
		
		String sql = "SELECT * FROM PRODUTOS ORDER BY DESCRICAO";
		
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()){
				Produto_Add produto = new Produto_Add();
				produto.setCod_Sistema(result.getString("COD_SISTEMA"));
				produto.setCod_Barras(result.getString("COD_BARRAS"));
				produto.setData(result.getString("DATA_INCLUSAO"));
				produto.setDescricao(result.getString("DESCRICAO"));
				produto.setPreco_custo(result.getString("PRECO_CUSTO"));
				produto.setPreco_Venda(result.getString("PRECO_VENDA"));
				produto.setQuantidade(result.getString("QUANTIDADE"));
				produto.setFornecedor(result.getString("FORNECEDOR"));
				produto.setQtd_minima(result.getString("PROD_MINUMO"));
				produtos.add(produto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produtos;
	}
	
public void update_produto(Produto_Add produto) {
		
	String sql = "UPDATE PRODUTOS"
			+" SET "
			+"COD_BARRAS ='" + produto.getCod_Barras()
			+"',DATA_INCLUSAO ='" + produto.getData()
			+"',DESCRICAO ='" + produto.getDescricao()
			+"',FORNECEDOR ='" + produto.getFornecedor()
			+"',QUANTIDADE ='" + produto.getQuantidade()
			+"',PROD_MINUMO ='" + produto.getQtd_minima()
			+"',PRECO_CUSTO ='" + produto.getPreco_custo()
			+"',PRECO_VENDA ='" + produto.getPreco_Venda()
			+"' WHERE COD_SISTEMA = '"+ produto.getCod_Sistema()
			+"'";
		
				try{
					PreparedStatement statement = connection.prepareStatement(sql);
					statement.execute();
				}catch (SQLException e) {
					e.printStackTrace();
				}
	}

	
	
}
