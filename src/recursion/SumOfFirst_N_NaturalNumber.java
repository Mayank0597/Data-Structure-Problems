package recursion;

import java.util.Scanner;

public class SumOfFirst_N_NaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int max = sc.nextInt();
		int n=1;
		int newNo=0;
		sum(n,max,newNo);
		
	}
	public static void sum(int n,int max,int newNo) {
		if(n<=max) {
			newNo=newNo+n;
			System.out.println("Sum of first "+n+" natural no "+newNo);
			n++;
			sum(n,max,newNo);
			
		}
		
	}

}
