package arrays;

import java.util.Scanner;

public class FindElementGivenRowAndColumnPascalTriangle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter row and column of pascal triangle");
		int row= sc.nextInt();
		int column = sc.nextInt();
		int r=row-1;
		int c=column-1;
		int prod1=1;
		for(int i=r;i>c;i--) {
			prod1=prod1*i;
		}
		int prod2=1;
		for(int i=r-c;i>=1;i--) {
			prod2=prod2*i;
		}
//		int prod3=1;
//		for(int i=c;i>=1;i--) {
//			prod3=prod3*i;
//		}
//		int result=prod1/(prod2*prod3);
		int result=prod1/prod2;
		System.out.println("Element of Pascal Triangle is "+result);

	}

}
