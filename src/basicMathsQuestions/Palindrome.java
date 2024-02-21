package basicMathsQuestions;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n1 = sc.nextInt();
	int n2=n1;
	int newNo=0;
	while(n1>0) {
		int lastDigit=n1%10;
		newNo=(newNo*10)+lastDigit;
		n1=n1/10;
	}
	if(newNo==n2) {
		System.out.println("It is Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
}
}
