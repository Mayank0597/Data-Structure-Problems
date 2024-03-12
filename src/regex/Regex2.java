package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt(); 
	        scanner.nextLine(); 
	        for (int i = 0; i < t; i++) {
	            String pattern = scanner.nextLine().trim(); 
	            if (isValidRegex(pattern)) {
	                System.out.println("Valid");
	            } else {
	                System.out.println("Invalid");
	            }
	        }
	        scanner.close();
	    }
	    private static boolean isValidRegex(String pattern) {
	        try {
	            Pattern.compile(pattern);
	            return true; 
	        } catch (PatternSyntaxException e) {
	            return false; 
	        }
	    }

	}

}
