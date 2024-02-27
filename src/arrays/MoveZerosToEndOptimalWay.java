package arrays;

import java.util.Scanner;

public class MoveZerosToEndOptimalWay {
	
	public static void zeroToEnd(int arr[]) {
		int j=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			
		}
		System.out.println("New Array elements are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
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
		zeroToEnd(arr);
	}

}
