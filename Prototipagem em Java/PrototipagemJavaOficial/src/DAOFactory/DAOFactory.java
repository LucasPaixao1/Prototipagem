package DAOFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOFactory {
	
	public static Connection conexao() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/Modelo_Fisico_Empresa";
		String user = "root";
		String password = "";

		return DriverManager.getConnection(url , user, password);
	}

}
