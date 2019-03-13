package libs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionWithSql {
	
	public static Connection getConnect() {
		String url = "jdbc:sqlserver://DESKTOP-B987MJK\\QUYNHLINH:1433;databaseName=Delivery";
		String userName = "sa";
		String password = "123";
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connect Fails!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Connect Fails!");
		}
		return connection;
	}
}	


