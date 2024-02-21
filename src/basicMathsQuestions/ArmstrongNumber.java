package basicMathsQuestions;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1=sc.nextInt();
		int n2=n1;
		int newNo=0;
		int cube;
		while(n1>0) {
			int lastDigit=n1%10;
			cube = lastDigit*lastDigit*lastDigit;
			newNo=newNo+cube;
			n1=n1/10;
		}
		if(newNo==n2) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not a Armstrong");
		}
	}

}
