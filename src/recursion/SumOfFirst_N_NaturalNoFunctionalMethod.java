package recursion;

import java.util.Scanner;

public class SumOfFirst_N_NaturalNoFunctionalMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		System.out.println(sum(n));
		sc.close();
	}
	public static int sum(int n) {
		if(n==0)
			return 0;
		return n+sum(n-1);
	}

}
