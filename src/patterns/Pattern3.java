package patterns;

import java.util.Scanner;

public class Pattern3 {
	
	static void print3(int n) {
		for (int j = 1; j <= n; j++) {
			for (int k = 1; k <= j; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("Enter another number");
			int n = sc.nextInt();
			print3(n);
		}
	}

}
