package patterns;

import java.util.Scanner;

public class Pattern8 {
	static void print8(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" " );
			}
			for(int k=(2*n)-((2*i)+1);k>0;k--) {
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
				print8(n);
	}


		}
}
