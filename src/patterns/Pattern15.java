package patterns;

import java.util.Scanner;

public class Pattern15 {
	static void print15(int n) {
		int s=0;
			for(int i=0;i<n;i++) {
				//stars
				for(int j=1;j<=n-i;j++) {
					System.out.print("*");
				}
				//space
				for(int k=0;k<s;k++) {
					System.out.print(" ");
				}
				//stars
				for(int j=1;j<=n-i;j++) {
					System.out.print("*");
				}
				s+=2;
				System.out.println();
			}
			s=8;
			for(int i=1;i<=n;i++) {
				//stars
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				//space
				for(int k=0;k<s;k++) {
					System.out.print(" ");
				}
				//stars
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				s-=2;
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
			print15(n);
}
}
}
