package basicMathsQuestions;

import java.util.Scanner;

public class PrintAllDivisorsUsingList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int n1=1;
		while(n1<=n) {
			if(n%n1==0) {
				System.out.print(n1+" ");
			}
			n1++;
		}
	}

}
