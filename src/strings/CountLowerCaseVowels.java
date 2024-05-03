package strings;

import java.util.Scanner;

public class CountLowerCaseVowels {
	
	public static int countlowerCaseVowel(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int result = countlowerCaseVowel(str);
		System.out.println(result);
	}

}
