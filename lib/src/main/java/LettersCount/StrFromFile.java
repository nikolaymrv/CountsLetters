package LettersCount;

import java.io.FileReader;
import java.util.Scanner;

public class StrFromFile implements ReadFromFile{

	public String fileLine;

	@Override
	public String getLineFromFile() throws Exception {
		System.out.println("Enter the name of file (with .txt or other .type");
		Scanner sc = new Scanner(System.in);
		
		String file = sc.nextLine();
		fileLine = null;
		
		FileReader fr = new FileReader(file);
		Scanner scFr = new Scanner(fr);
		int i = 1;
		
		while (scFr.hasNextLine()) {
			System.out.println("Number of line:"+ " " + i + "|" + "Line:" + " " + scFr.nextLine());
			fileLine = scFr.nextLine();
			i++;
		}
		
		return fileLine;
	}
	

}
