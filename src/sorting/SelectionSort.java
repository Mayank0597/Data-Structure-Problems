package sorting;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int arr[],int n) {
		int temp;
		for(int i=0;i<=n-2;i++) {
			for(int j=i+1;j<=n-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		System.out.println("Sorted Array elements are ");
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
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
		selectionSort(arr,n);
		System.out.println("Sorted Array elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
