package patterns;

import java.util.Scanner;

public class Pattern13 {
	static void print13(int n) {
		int k=1;
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=i;j++) {
			
			System.out.print(k+" ");
			k=k+1;
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
			print13(n);
}
}
}
