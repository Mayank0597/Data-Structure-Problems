package sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int arr[],int n) {
		int temp;
		for(int i=n-1;i>=1;i--) {
			int didSwap=0;
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					didSwap=1;
				}
			}
			if(didSwap==0) {
				break;
			}
			System.out.println("runs");
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
		bubbleSort(arr,n);
		System.out.println("Sorted Array elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
