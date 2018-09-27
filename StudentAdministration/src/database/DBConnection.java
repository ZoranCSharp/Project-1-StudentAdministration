package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	// Create a variable for the connection string.
	private String connectionUrl = "jdbc:sqlserver://localhost:1433;"
			+ "databaseName=StudentAdministration;integratedSecurity=true;";

	// Declare the JDBC objects.
	private Connection connection = null;

	public Connection getConnection() {

		try {

			connection = DriverManager.getConnection(connectionUrl);

		}
		// Handle any errors that may have occurred.
		catch (SQLException e) {

			e.printStackTrace();
		}

		return connection;

	}

}
