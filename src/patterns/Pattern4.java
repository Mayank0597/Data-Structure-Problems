package patterns;

import java.util.Scanner;

public class Pattern4 {
	static void print4(int n) {
		for (int j = 1; j <= n; j++) {
			for (int k = 1; k <= j; k++) {
				System.out.print(j + " ");
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
			print4(n);
}
}
}