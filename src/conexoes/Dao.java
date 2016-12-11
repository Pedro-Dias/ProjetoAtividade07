package conexoes;

import java.sql.Connection;
import java.sql.SQLException;

import classesBasicas.Fatura;

public class Dao {
	
	private Connection connection;
	
	public Dao(){
		
		try{
			this.connection =  new ConnectionFactory().getConnection();
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}

	public void alteracaoFatura(Fatura fatura) {
		
		
	}

}
