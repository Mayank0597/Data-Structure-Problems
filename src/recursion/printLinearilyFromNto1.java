package recursion;

import java.util.Scanner;

public class printLinearilyFromNto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		int count=1;
		printNo(count,n);
				
	}
	public static void printNo(int count, int n) {
		if(count<=n) {
			System.out.print(n+" ");
			n--;
			printNo(count,n);
		}
		else return;
	}

}
