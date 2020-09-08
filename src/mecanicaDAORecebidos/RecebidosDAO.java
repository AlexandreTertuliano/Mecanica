package mecanicaDAORecebidos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mecanica.connection.ConnectionDAO;
import mecanicaDAO.Produto_Add;
import mecanicaDAO.Recebidos_Add;

public class RecebidosDAO {
	
	private Connection connection;

	public RecebidosDAO() throws SQLException {
		connection = ConnectionDAO.getConnection();
	}
	
	
	public void Insert(Recebidos_Add recebidos) {
		
		String sql = "INSERT INTO RECEBIDOS ( DATA_RECEBIDO, VALOR_RECEBIDO, CPF_RECEBIDO, PLACA_CARRO_RECEBIDO ) " +
				"VALUES (?,?,?,?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			int index = 1;
				statement.setDate(index++, recebidos.getData());
				statement.setDouble(index++, recebidos.getValor());
				statement.setString(index++, recebidos.getCpf());
				statement.setString(index++, recebidos.getPlaca());
				statement.execute();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
		
		
	}
}
