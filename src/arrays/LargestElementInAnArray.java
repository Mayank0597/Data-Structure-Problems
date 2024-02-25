package arrays;

import java.util.Scanner;

public class LargestElementInAnArray {
	
	public static int largestArrayElement(int arr[]) {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest)
				largest=arr[i];
		}
		return largest;
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
		int largest = largestArrayElement(arr);
		System.out.println("Largest array element is "+ largest);

	}

}
