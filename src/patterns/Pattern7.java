package patterns;

import java.util.Scanner;

public class Pattern7 {
	static void print7(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" " );
			}
			for(int k=0;k<(2*i)+1;k++) {
				System.out.print("*");
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
				print7(n);
	}


		}
}
