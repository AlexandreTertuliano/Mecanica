package mecanicaDAOVenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mecanica.connection.ConnectionDAO;
import mecanicaDAO.Boleto_Add;
import mecanicaDAO.Venda_add;

public class VendaDAO {
	
	private Connection connection;
	
	public VendaDAO() throws SQLException{
		connection = ConnectionDAO.getConnection();
	}

	
	public void Insert(Venda_add venda){
		
		
		String sql = " insert into vendas ( cod_venda, cliente_venda, cpf_venda, cod_barras, valor_venda, placa, data_venda, num_os, quant, produto, valor_total)"  
			+	"values (?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			int index = 1;
				statement.setString(index++, venda.getCod_venda());
				statement.setString(index++, venda.getCliente_venda());
				statement.setString(index++, venda.getCpf_venda());
				statement.setString(index++, venda.getCod_barras());
				statement.setString(index++, venda.getValor_venda());
				statement.setString(index++, venda.getQuant());
				statement.setString(index++, venda.getPlaca());
				statement.setDate(index++, venda.getData_venda());
				statement.setString(index++, venda.getNum_os());
				statement.setDate(index++, venda.getData_venda());
				statement.setString(index++, venda.getNum_os());
				statement.setString(index++, venda.getQuant());
				statement.setDouble(index++, venda.getValor_Total());
				
				statement.execute();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
	public List<Venda_add> getAll() {
		List<Venda_add> vendas = new ArrayList<Venda_add>();
		
		String sql = "SELECT * FROM VENDAS ORDER BY DATA_VENDA ";
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()){
				Venda_add venda = new Venda_add();
				venda.setCod_venda(result.getString("COD_VENDA"));
				venda.setCliente_venda(result.getString("CLIENTE_VENDA"));
				venda.setCpf_venda(result.getString("CPF_VENDA"));
				venda.setCod_barras(result.getString("COD_BARRAS"));
				venda.setValor_venda(result.getString("VALOR_VENDA"));
				venda.setQuant(result.getString("QUANT_PROD"));
				venda.setPlaca(result.getString("PLACA"));
				venda.setData_venda(result.getDate("DATA_VENDA"));
				venda.setNum_os(result.getString("NUM_OS"));
				venda.setProduto(result.getString("PRODUTO"));
				venda.setValor_Total(result.getDouble("VALOR_TOTAL"));
				
				vendas.add(venda);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return vendas;
	}
	
	
}
