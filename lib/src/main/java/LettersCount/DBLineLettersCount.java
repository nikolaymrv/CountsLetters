package LettersCount;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBLineLettersCount {
	public List<Integer> writeResultSet(ResultSet resultSet) throws SQLException {
		return dbLineLettersCount(resultSet);
	}

	public List<Integer> dbLineLettersCount(ResultSet resultSet) throws SQLException {
		int vCounter = 0;
		int cCounter = 0;
		int countConsonants = 0;
		int countVowels = 0;

		List<Integer> lettersCount = new ArrayList<>();

		int iterator = 0;
		int listIterator = 0;
		while (resultSet.next()) {
			String line = resultSet.getString("LineOne");
			List<String> linesFromSQL = new ArrayList<>();
			linesFromSQL.add(line);
			System.out.println("Line from list" + ++iterator + ": " + linesFromSQL.get(listIterator));

			ConsonantsCounter consonantsCounter = new ConsonantsCounter();
			VowelsCounter vowelsCounter = new VowelsCounter();

			countVowels = vowelsCounter.getLettersCount(linesFromSQL.get(listIterator));
			countConsonants = consonantsCounter.getLettersCount(linesFromSQL.get(listIterator));

			vCounter += countVowels;
			cCounter += countConsonants;

			System.out.println("Vowels in array" + " " + countVowels);
			System.out.println("Consonants in array" + " " + countConsonants);
		}

		lettersCount.add(vCounter); // 0
		lettersCount.add(cCounter); // 1

		return lettersCount;
	}
}