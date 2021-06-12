package LettersCount;

import java.util.Scanner;

public class StrFromConsole implements ReadFromConsole{

	public String consoleLine;

	@Override
	public String getLineFromConsole() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			consoleLine = sc.nextLine(); 
			
			return consoleLine;
	}

		
}
