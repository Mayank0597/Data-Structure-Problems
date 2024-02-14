package patterns;

import java.util.Scanner;

public class Pattern11 {
	static void print11(int n) {
		int start=1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				start=1;
			}
			else {
				start=0;
			}
			for(int j=0;j<=i;j++) {
				System.out.print(start);
				start=1-start;
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
			print11(n);
}


	}
}
