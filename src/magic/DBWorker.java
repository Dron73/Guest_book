package magic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {

    private static final String URL = "jdbc:postgresql://localhost:5432/Guest_book";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "admin";

    private Connection connection;

    public DBWorker() {
	try {
	    Class.forName("org.postgresql.Driver");
	    connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
	} catch (SQLException | ClassNotFoundException e) {
	    e.printStackTrace();
	}
    }

    public Connection getConnection() {
	return connection;
    }
}
