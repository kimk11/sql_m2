package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Close {
	
	//Dao에서 connection, preparedStatement, resultSet을 사용했을경우 (select)
	public void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
		if(null != connection) {
			try {connection.close();} catch (SQLException e) {e.printStackTrace();}
		}
		if(null != preparedStatement) {
			try {preparedStatement.close();} catch (SQLException e) {e.printStackTrace();}
		}
		if(null != resultSet) {
			try {resultSet.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
		
	}
	
	//Dao에서 connection, preparedStatement 만 사용했을경우 (insert, delete, update)
	public void close(Connection connection, PreparedStatement preparedStatement) {
		if(null != connection) {
			try {connection.close();} catch (SQLException e) {e.printStackTrace();}
		}
		if(null != preparedStatement) {
			try {preparedStatement.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
}
