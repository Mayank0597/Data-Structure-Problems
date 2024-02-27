package arrays;

import java.util.Scanner;

public class LeftRotateArrayByOnePlace {
	
	public static void leftRotateByOnePlace(int arr[]) {
		int temp=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		System.out.println();
		System.out.println("New Array elements are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
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
		leftRotateByOnePlace(arr);
		sc.close();
	}

}
