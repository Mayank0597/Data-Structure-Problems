package patterns;

import java.util.Scanner;

public class Pattern6 {
	static void print6(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" " );
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
				print6(n);
	}


		}
}
