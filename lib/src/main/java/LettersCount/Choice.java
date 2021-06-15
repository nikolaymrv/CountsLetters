package LettersCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Choice {

	public int choice(Scanner sc) {
		boolean flag = true;
		int variant = 0;
		while (flag) {
		System.out.println("Enter the varianf of type of input");
		System.out.println("1 = Console");
		System.out.println("2 = From file");
		try {
			List<Integer> paramList = new ArrayList<>();
			String input = sc.next();
			variant = Integer.parseInt(input);
			
			
			flag = false;
			paramList.add(variant);
			break;
			
			} catch (NumberFormatException e) {
				System.out.println("Please, enter again (incorrect data entered)");
			System.out.println("Catch Exception:" + e.getMessage() + " " + e.toString());
//			choice(sc);
		}
		
}
		return variant;
	}
	
}
