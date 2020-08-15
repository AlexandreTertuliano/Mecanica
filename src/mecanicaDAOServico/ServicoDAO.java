package mecanicaDAOServico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mecanica.connection.ConnectionDAO;
import mecanicaDAO.Funcionario_add;
import mecanicaDAO.Servico_Add;

public class ServicoDAO {
	
	private Connection connection;
	
	public ServicoDAO() throws SQLException {
		connection = ConnectionDAO.getConnection();
	}
	
	public void Insert(Servico_Add servico) {
		
		String sql = 
		"INSERT INTO ordem_servico (Cod_Serv, Cliente, Placa_Carro, Funcionario, Produto, Valor_Produto, Qtd_Prod, servico, Valor_servico, Valor_Total)"
		+ " VALUES (?,?,?,?,?,?,?,?,?,?) ";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			int index = 1;
				statement.setString(index++, servico.getCod_Serv());
				statement.setString(index++, servico.getCliente());
				statement.setString(index++, servico.getPlaca_Carro());
				statement.setString(index++, servico.getFuncionario());
				statement.setString(index++, servico.getProduto());
				statement.setString(index++, servico.getValor_Produto());
				statement.setString(index++, servico.getQtd_Produto());
				statement.setString(index++, servico.getServico());
				statement.setString(index++, servico.getValor_servico());
				statement.setDouble(index++, servico.getValor_Total());
				statement.execute();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
	public List<Servico_Add> getAll() {
		List<Servico_Add> servicos = new ArrayList<Servico_Add>();
		
		String sql = "SELECT * FROM ORDEM_SERVICO";
		
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()){
				Servico_Add servico = new Servico_Add();
				servico.setCod_Serv(result.getString("COD_SERV"));
				servico.setCliente(result.getString("CLIENTE"));
				servico.setPlaca_Carro(result.getString("PLACA_CARRO"));
				servico.setFuncionario(result.getString("FUNCIONARIO"));
				servico.setProduto(result.getString("PRODUTO"));
				servico.setValor_Produto(result.getString("VALOR_PRODUTO"));
				servico.setQtd_Produto(result.getString("QTD_PROD"));
				servico.setServico(result.getString("SERVICO"));
				servico.setValor_servico(result.getString("VALOR_SERVICO"));
				servico.setValor_Total(result.getDouble("VALOR_TOTAL"));
				servicos.add(servico);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return servicos;
	}
	
}
