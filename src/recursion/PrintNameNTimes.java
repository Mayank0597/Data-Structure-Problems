package recursion;

import java.util.Scanner;

public class PrintNameNTimes {
	public static void printName(int n1,int count1, String name1) {
		if(count1<n1) {
			System.out.println(name1);
			count1++;
			printName(n1,count1,name1);
		}
		else {
			return;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter number of times name to be displayed");
		int n = sc.nextInt();
		int count=0;
		printName(n,count,name);

	}
	
}
