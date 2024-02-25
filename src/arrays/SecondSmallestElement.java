package arrays;

import java.util.Scanner;

public class SecondSmallestElement {
	
	public static int secondSmallest(int arr[]) {
		int smallest = arr[0];
		int ssmallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				ssmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]>smallest && arr[i]<ssmallest) {
				ssmallest=arr[i];
			}
		}
		return ssmallest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" element of array");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int ssmallest = secondSmallest(arr);
		System.out.println("Second smallest element is "+ssmallest);
	}

}
