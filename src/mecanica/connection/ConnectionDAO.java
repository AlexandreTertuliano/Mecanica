package mecanica.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDAO {
	
	private static final String USER = "postgres";
	private static final String PASSWORD = "123456";
	
	public static Connection getConnection() throws SQLException {
		//PORTA LINUX 5433
		String url = "jdbc:postgresql://127.0.0.1:5432/Mecanica";
		
		Properties properties = new Properties();
		properties.setProperty("user", USER);
		properties.setProperty("password", PASSWORD);
		
		return DriverManager.getConnection(url, properties);
	}

	public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}


