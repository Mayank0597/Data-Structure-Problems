package regex;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String s = scanner.nextLine().trim(); 
	        if (s.isEmpty()) {
	            System.out.println(0);
	            scanner.close();
	            return;
	        }
	        String[] tokens = s.split("[ !,?._'@]+");
	        System.out.println(tokens.length);
	        for (String token : tokens) {
	            System.out.println(token);
	        }
	        scanner.close();

	}

}
