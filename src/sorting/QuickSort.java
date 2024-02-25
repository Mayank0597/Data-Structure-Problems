package sorting;

import java.util.Scanner;

public class QuickSort {
	
	public static int partition(int arr[],int low,int high) {
		int pivot = arr[low];
		int i=low;
		int j=high;
		while(i<j) {
			while(arr[i]<=pivot && i<=high-1) {
				i++;
			}
			while(arr[j]>pivot && j>=low+1) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}
	
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pIndex = partition(arr,low,high);
			quickSort(arr,low,pIndex-1);
			quickSort(arr,pIndex+1,high);
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
		int low = 0;
		int high = arr.length-1;
		quickSort(arr,low,high);
		System.out.println("Sorted Array elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
