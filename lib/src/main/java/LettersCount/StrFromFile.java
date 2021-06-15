package LettersCount;
import java.io.*;
import java.util.Scanner;

public class StrFromFile implements ReadFromFile {

	public String fileLine;

	@Override
	public int getLineFromFile(String s) throws Exception {
		int vCounter = 0;
		int cCounter = 0;
		int countConsonants = 0;
		int countVowels = 0;
		Consonantsimpl consonants = new Consonantsimpl();
		Vowelsimpl vowels = new Vowelsimpl();
		Scanner sc = new Scanner(System.in);
		
		String file = sc.nextLine();
		fileLine = null;
		
		FileReader fr = new FileReader(file);
		Scanner scFr = new Scanner(fr);
		int i = 1;
		
		while (scFr.hasNextLine()) {
			s = scFr.nextLine();
			System.out.println("Line" + " " + i + " " + ":" + s);
			
			
			 	countConsonants = consonants.getNameLength(s);
		        countVowels = vowels.getNameLength(s);
		        
		        vCounter += countVowels;
		        cCounter += countConsonants;
		        
		        System.out.println("Consonants in array" + " " + countConsonants);
		        System.out.println("Vowels in array" + " " + countVowels);	
			i++;
		}
		
		return vCounter;
	}
}
	//D:\Programs\Workspace\strings.txt
