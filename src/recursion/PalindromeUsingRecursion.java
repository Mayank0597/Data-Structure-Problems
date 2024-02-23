package recursion;

import java.util.Scanner;

public class PalindromeUsingRecursion {
	public static void palindrome(int n1,int newNo,int n2) {
		if(n1>0) {
			int lastDigit=n1%10;
			newNo=(newNo*10)+lastDigit;
			n1=n1/10;
			palindrome(n1,newNo,n2);
			if(newNo==n2) {
				System.out.println("It is Palindrome");
			}
			
		}
	} 

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = sc.nextInt();
		int n2=n1;
		int newNo=0;
		palindrome(n1,newNo,n2);	
			
	}

}
