package patterns;

import java.util.Scanner;

public class Pattern14 {
	static void print14(int n) {
	for(int i=1;i<=n;i++) {
		for(char ch='A';ch<'A'+i;ch++) {
			System.out.print(ch+" ");
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
			print14(n);
}
}
}
