package recursion;

import java.util.Scanner;

public class ReverseArrayUsingRecursion {
	
	public static void swap(int arr[], int l,int r) {
		int temp;
		temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
	}
	public static void f(int arr[],int l,int r) {
		if(l<=r) {
			swap(arr,l,r);
			f(arr,l+1,r-1);
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
		System.out.println();
		int l=0;
		int r=arr.length-1;
		f(arr,l,r);
		
		System.out.println("Reverse Array elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
