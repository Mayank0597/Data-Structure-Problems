package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
	
	public static void mergeSort(int arr[],int low,int high){
		if(low>=high)
			return;
		int mid=(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	
	public static void merge(int arr[],int low,int mid,int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid+1;
		while(left<=mid && right<=high) {
			if(arr[left]<arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
				right++;
			}
		}
		while(left<=mid) {
			
				temp.add(arr[left]);
				left++;
			
		}
		while(right<=high) {
			
				temp.add(arr[right]);
				right++;
			
		}
		for(int i=low;i<=high;i++) {
			arr[i]=temp.get(i-low);
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
		int low=0;
		int high=arr.length-1;
		MergeSort.mergeSort(arr,low,high);
		System.out.println("Sorted Array elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
