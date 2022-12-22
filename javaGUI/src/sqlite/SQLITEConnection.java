package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 
 * @author Joel
 *
 */
public class SQLITEConnection {
	public static Connection connect() {
		Connection conn = null;
		String dbname = "personal";
		try {

			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:" + dbname + ".sqlite");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			System.out.println("Connected successfully!!");
			//// DROP TABLE IF EXISTS
			String sql = "CREATE TABLE if not exists personalInfo " + "(  ID INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ " NAME           TEXT    NOT NULL, " + " LASTNAME           TEXT    NOT NULL,"
					+ " NATIONALITY           TEXT, " + " AGE            INT     NOT NULL," + " ADDRESS         TEXT, "
					+ " SCHOOL       TEXT)";
			stmt.executeUpdate(sql);
			System.out.println("table created successfully!!");
			stmt = conn.createStatement();
			String sqlinput = "INSERT INTO personalInfo (NAME,LASTNAME,NATIONALITY,AGE,ADDRESS,SCHOOL) "
					+ "VALUES ('Paul','Perez', 'American','32', 'California','University of Florida' );";

			stmt.executeUpdate(sqlinput);
			String sqlinput1 = "INSERT INTO personalInfo (NAME,LASTNAME,NATIONALITY,AGE,ADDRESS,SCHOOL) "
					+ "VALUES ('Paul','Perez', 'American','32', 'California','University of Florida' );";

			stmt.executeUpdate(sqlinput1);
			String sqlinput2 = "INSERT INTO personalInfo (NAME,LASTNAME,NATIONALITY,AGE,ADDRESS,SCHOOL) "
					+ "VALUES ('Paul','Perez', 'American','32', 'California','University of Florida' );";
			stmt.executeUpdate(sqlinput2);

			String sqlinput3 = "INSERT INTO personalInfo (NAME,LASTNAME,NATIONALITY,AGE,ADDRESS,SCHOOL) "
					+ "VALUES ('Joel','Rodriguez', 'American','35', 'Florida','Florida Atlantic University' );";
			stmt.executeUpdate(sqlinput3);

			stmt.close();
			conn.commit();
			conn.close();
			System.out.println("Data entered successfully!!");

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		return conn;

	}
}