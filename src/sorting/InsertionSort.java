package sorting;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int arr[],int n) {
		for(int i=0;i<=n-1;i++) {
			int j=i;
			while(j>=0 && arr[j-1]>arr[j]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
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
		insertionSort(arr,n);
		System.out.println("Sorted Array elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	}


