package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverConnection {
	//트랜잭션처리를 할 경우에 사용하기 위해 static으로 선언함
	public static Connection connection = null;
	
	//connection객체에 mysql드라이버정보를 저장하여 연결할 메서드
	public Connection connectionInfo() {
		String className = "com.mysql.jdbc.Driver";
		String jdbcDriver = "jdbc:mysql://localhost:3306/sql_m2?useUnicode=true&characterEncoding=utf8";
		String dbUser = "root";
		String dbPass = "1234";
		
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			DriverConnection.connection = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return DriverConnection.connection;
	}
}
