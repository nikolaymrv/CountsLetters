package LettersCount;

import java.sql.SQLException;

public interface DBLineProcessor {

	void writeLineInDB(String input) throws ClassNotFoundException, SQLException;
}
