package LettersCount;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {
	public static void main(String args[]) {
//		Put properties file into resources directory
		try (FileOutputStream out = new FileOutputStream("D:\\Programs\\Programming\\Workspace\\NameLength\\lib\\src\\main\\resources\\my.properties")){
			Properties prop = new Properties();
			
		prop.setProperty("url", "mongodb://localhost:27017");
		prop.setProperty("database", "lines_analysis");
		prop.setProperty("collection", "line_parameters");
		prop.store(out, null);
	
		} catch (IOException io) {
			io.printStackTrace();
		}
		
		try (FileInputStream input = new FileInputStream("D:\\\\Programs\\\\Programming\\\\Workspace\\\\NameLength\\\\lib\\\\src\\\\main\\\\resources\\\\my.properties")) {

            Properties prop = new Properties();
		
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("database"));
            System.out.println(prop.getProperty("collection"));
            
	} catch (IOException ex) {
		ex.printStackTrace();
	}
}
}