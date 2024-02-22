package recursion;

import java.util.Scanner;

public class printLinearilyFrom1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		int count=1;
		printNo(count,n);
				
	}
	public static void printNo(int count, int n) {
		if(count<=n) {
			System.out.print(count+" ");
			count ++;
			printNo(count,n);
		}
		else return;
	}

}
