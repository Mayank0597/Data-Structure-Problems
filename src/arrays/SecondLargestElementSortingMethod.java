package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementSortingMethod {
	
	public static int secondLargest(int arr[]) {
		Arrays.sort(arr);
		int secLargest=0;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<arr[arr.length-1]) {
				secLargest=arr[i];
				break;
			}
		}
		return secLargest;
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
		int slargest = secondLargest(arr);
		System.out.println("Second largest element is "+slargest);
	}

}
