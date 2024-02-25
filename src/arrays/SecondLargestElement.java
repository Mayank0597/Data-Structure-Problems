package arrays;

import java.util.Scanner;

public class SecondLargestElement {
	
	public static int secondLargest(int arr[]) {
		int largest = arr[0];
		int slargest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				slargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest && arr[i]>slargest) {
				slargest=arr[i];
			}
		}
		return slargest;
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
