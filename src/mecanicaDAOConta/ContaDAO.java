package mecanicaDAOConta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mecanica.connection.ConnectionDAO;
import mecanicaDAO.Conta_Add;
import mecanicaDAO.Fornecedor_add;

public class ContaDAO {
	private Connection connection;
	
	 public ContaDAO() throws SQLException {
		 
		 connection = ConnectionDAO.getConnection();
		 
	 }
	 
	 
		public void Insert(Conta_Add fornecedor) {
			
			String sql = "INSERT INTO FORNECEDOR ( RAZAO_SOCIAL, CNPJ, TELL, ESTADO, CIDADE, CEP, RUA," +
					"NUMERO)" +
					"VALUES (?,?,?,?,?,?,?,?)";
			
			try {
			PreparedStatement statement = connection.prepareStatement(sql);
			int index = 1;
				statement.setString(index++, fornecedor.getRazão_Social());
				statement.setString(index++, fornecedor.getCnpj());
				statement.setString(index++, fornecedor.getTell());
				statement.setString(index++, fornecedor.getEstado());
				statement.setString(index++, fornecedor.getCidade());
				statement.setString(index++, fornecedor.getCep());
				statement.setString(index++, fornecedor.getRua());
				statement.setString(index++, fornecedor.getNumero());
				statement.execute();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		public List<Conta_Add> getAll() {
			List<Conta_Add> contas = new ArrayList<Conta_Add>();
			
			String sql = "SELECT * FROM FORNECEDOR";
			
			try {
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(sql);
				
				while (result.next()){
					Conta_Add conta = new Conta_Add();
					conta.setRazão_Social(result.getString("RAZAO_SOCIAL"));
					conta.setCnpj(result.getString("CNPJ"));
					conta.setTell(result.getString("TELL"));
					conta.setEstado(result.getString("ESTADO"));
					conta.setCidade(result.getString("CIDADE"));
					conta.setCep(result.getString("CEP"));
					conta.setRua(result.getString("RUA"));
					conta.setNumero(result.getString("NUMERO"));
					contas.add(conta);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return contas;
		}
		
		
		public void update_Fornecedores(Fornecedor_add fornecedor) {
			
	    String sql = "UPDATE FORNECEDOR"
					+" SET CNPJ ='" + fornecedor.getCnpj()
					+"',RAZAO_SOCIAL ='" + fornecedor.getRazão_Social()
					+"',TELL ='" + fornecedor.getTell()
					+"',ESTADO ='" + fornecedor.getEstado()
					+"',CIDADE ='" + fornecedor.getCidade()
					+"',CEP ='" + fornecedor.getCep()
					+"',RUA ='" + fornecedor.getRua()
					+"',NUMERO ='" + fornecedor.getNumero()
					+"' WHERE CNPJ ='" + fornecedor.getCnpj() 
					+"'";
			
					try{
						PreparedStatement statement = connection.prepareStatement(sql);
						statement.execute();
					}catch (SQLException e) {
						e.printStackTrace();
					}
		}



}