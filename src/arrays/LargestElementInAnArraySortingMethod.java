package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInAnArraySortingMethod {
	
	public static int largestArrayElement(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length-1];
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
