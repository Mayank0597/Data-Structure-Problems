package arrays;

import java.util.Scanner;

public class IsArraySorted {
	public static boolean isSorted(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>=arr[i-1]) {
				
			}
				
			else
				return false;
		}
		return true;
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
		boolean var = isSorted(arr);
		if(var==true) {
			System.out.println("Array is Sorted");
		}
		else
			System.out.println("Not Sorted");

	}

}
