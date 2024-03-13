package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
	public static void main(String []argh){
		Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	         scanner.nextLine();
	        Map<String, String> phoneBook = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	            String name = scanner.nextLine();
	            String phoneNumber = scanner.nextLine();
	            phoneBook.put(name, phoneNumber);
	        }
	        while (scanner.hasNext()) {
	            String query = scanner.nextLine();
	            String phoneNumber = phoneBook.getOrDefault(query, "Not found");
	            System.out.println(phoneNumber.equals("Not found") ? phoneNumber : query + "=" + phoneNumber);
	        }

	        scanner.close();
		}
}
