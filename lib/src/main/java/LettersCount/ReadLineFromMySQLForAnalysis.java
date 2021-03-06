package LettersCount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadLineFromMySQLForAnalysis implements LineProcessor {

	@Override
	public List<Integer> processLineFrom(String input) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/count_letters_database?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
		String userName = "root";
		String pass = "vfkfcdjkjx";

		List<Integer> counterList = new ArrayList<>();

		Statement statement = null;
		ResultSet resultSet = null;

		DBLineLettersCount writeResultSet = new DBLineLettersCount();

		try (Connection connection = DriverManager.getConnection(url, userName, pass)) {
			System.out.println("Connection Succesful");
			// Statements allow to issue SQL queries to the database
			statement = connection.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from count_letters_database.lines_for_analysis");
			counterList = writeResultSet.dbLineLettersCount(resultSet);
		}
		return counterList;

	}

}
