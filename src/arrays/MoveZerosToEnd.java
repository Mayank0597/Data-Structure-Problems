package arrays;

import java.util.Scanner;

public class MoveZerosToEnd {
	
	public static void zeroToEnd(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		int arr1[]=new int[arr.length-count];
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length-count;i++) {
			arr[i]=arr1[i];
		}
		for(int i=arr.length-count;i<arr.length;i++) {
			arr[i]=0;
		}
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
		System.out.println();
		zeroToEnd(arr);
	}

}
