package recursion;

import java.util.Scanner;

public class printLinearilyFrom1toNusingBacktracking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		printNo(n);

	}
	public static void printNo(int n) {
		if(n<1)
			return;
		printNo(n-1);
		System.out.println(n);
	}

}
