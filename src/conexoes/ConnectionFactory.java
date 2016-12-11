package conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() throws SQLException{
		
		String nomeBanco ="";
		String usuario="";
		String senha="";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			throw new SQLException(e);
		}
		return DriverManager.getConnection("jdbc:mysql://localhost:3366/" + nomeBanco + usuario + senha);
		
	}

}
