package recursion;

import java.util.Scanner;

public class FactorialOf_N_NaturalNoFunctionalMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}
	public static int factorial(int n) {
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}

}
