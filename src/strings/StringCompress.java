package strings;

import java.util.Scanner;

public class StringCompress {
	
	public static StringBuilder compress(String str) {
		
		StringBuilder newStr = new StringBuilder("");
		for(int i=0;i<str.length();i++) {
			int count=1;
			while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			newStr.append(str.charAt(i));
			if(count>1) {
				newStr.append(count);
			}
			
		}
		return newStr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		StringBuilder result = compress(str);
		System.out.println(result);

	}

}
