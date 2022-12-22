package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author Joel
 *
 */
public class SQLITEConnection {
	public static Connection connect() {
		Connection conn = null;
		String dbname = "personalInfo";
		try {

			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:" + dbname + ".sqlite");
			System.out.println("Connected successfully!!");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return conn;

	}
}
