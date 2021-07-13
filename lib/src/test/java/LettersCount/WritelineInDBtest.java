package LettersCount;

import static org.mockito.Mockito.doNothing;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

public class WritelineInDBtest {

	private WriteLineInBD writelineInDBtest;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws SQLException, IOException, ClassNotFoundException {
		WriteLineInBD writelineInDBtest = Mockito.mock(WriteLineInBD.class);
		doNothing().when(writelineInDBtest).writeLineInDB(ArgumentMatchers.any(String.class));
		writelineInDBtest.writeLineInDB("any");
	}

}
