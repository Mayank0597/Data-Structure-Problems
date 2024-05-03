package striver;

import java.util.Scanner;

public class Fibonacci {
	
	public static void fibonacci(int[] arr, int n) {
		int i=2;
		if(n>2) {
		while(i<n) {
			if(arr[i]==arr[i-1]+arr[i-2]) {
				i++;
			}
			
		}
		System.out.println("It is fibonacci");
	}else
		System.out.println("Not a fibonacci");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++) {
			
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		fibonacci(arr,n);

	}

}
