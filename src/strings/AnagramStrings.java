package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramStrings {
	
	public static boolean anagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		char[] charArray1=s1.toCharArray();
		char[] charArray2=s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		for(int i=0;i<charArray1.length;i++) {
			if(charArray1[i]!=charArray2[i]) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		boolean result = anagram(str1, str2);
		System.out.println(result);

	}

}
