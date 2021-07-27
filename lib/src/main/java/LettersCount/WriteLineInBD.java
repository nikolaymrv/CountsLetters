package LettersCount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteLineInBD implements DBLineProcessor {

	@Override
	public void writeLineInDB(String input) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/count_letters_database?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";		String userName = "root";
		String pass = "vfkfcdjkjx";
		
		Statement statement = null;
		
			try (Connection connection = DriverManager.getConnection(url, userName, pass)) {
				System.out.println("Connection Succesful");
				// Statements allow to issue SQL queries to the database
				statement = connection.createStatement();
				// Result set get the result of the SQL query
				int result = statement.executeUpdate("INSERT INTO lines_for_analysis VALUES ('"+input+"')");
				System.out.println("Added"+" " + result + " " + "rows");
			}
		
		
	}

}
