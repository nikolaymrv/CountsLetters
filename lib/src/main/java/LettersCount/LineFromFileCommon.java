package LettersCount;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineFromFileCommon implements LineProcessor {

	@Override
	public List<Integer> processLineFrom(String input) throws Exception {
		int vCounter = 0;
		int cCounter = 0;
		int countConsonants = 0;
		int countVowels = 0;
		
		ConsonantsCounter consonantsCounter = new ConsonantsCounter();
		VowelsCounter vowelsCounter = new VowelsCounter();
		
		List<Integer> letterCount = new ArrayList<>();		
		
		FileReader fileReader = new FileReader(input);
		Scanner scannerFileReader = new Scanner(fileReader);
		String lineFromFile = null;
		int i = 1;
		
		while (scannerFileReader.hasNextLine()) {
			lineFromFile = scannerFileReader.nextLine();
			System.out.println("Line" + " " + i + " " + ":" + lineFromFile);
			
				countVowels = vowelsCounter.getLettersCount(lineFromFile);
			 	countConsonants = consonantsCounter.getLettersCount(lineFromFile);
		       
		        vCounter += countVowels;
		        cCounter += countConsonants;
		        	        
		        System.out.println("Vowels in array" + " " + countVowels);
		        System.out.println("Consonants in array" + " " + countConsonants);
		        	
			i++;
		}
		
		letterCount.add(vCounter); //0
		letterCount.add(cCounter); //1
		
		return letterCount;
	}
}
	//D:\Programs\Workspace\strings.txt
