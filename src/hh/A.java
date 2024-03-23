package hh;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
