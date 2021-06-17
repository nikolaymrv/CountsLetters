package LettersCount;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrFromFile implements ReadFromFile {


	@Override
	public List<Integer> getLineFromFile(String file) throws Exception {
		int vCounter = 0;
		int cCounter = 0;
		int countConsonants = 0;
		int countVowels = 0;
		
		Consonantsimpl consonants = new Consonantsimpl();
		Vowelsimpl vowels = new Vowelsimpl();
		
		List<Integer> paramList = new ArrayList<>();
		
		
		FileReader fr = new FileReader(file);
		Scanner scFr = new Scanner(fr);
		String s = null;
		int i = 1;
		
		while (scFr.hasNextLine()) {
			s = scFr.nextLine();
			System.out.println("Line" + " " + i + " " + ":" + s);
			
				countVowels = vowels.getNameLength(s);
			 	countConsonants = consonants.getNameLength(s);
		       
		        vCounter += countVowels;
		        cCounter += countConsonants;
		        
		        
		        
		        System.out.println("Vowels in array" + " " + countVowels);
		        System.out.println("Consonants in array" + " " + countConsonants);
		        	
			i++;
		}
		paramList.add(vCounter); //0
		        paramList.add(cCounter); //1
		
		return paramList;
	}
}
	//D:\Programs\Workspace\strings.txt
