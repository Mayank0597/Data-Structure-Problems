package arrays;

import java.util.Scanner;

public class LeftRotateArrayBy_D_Place {
	
	public static void leftRotateBy_D_Place(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter by how much place does the array rotate");
		int d = sc.nextInt();
		d=d%arr.length;// for rotation position is more than size of array
		int arr1[] = new int[d];
		for(int i=0;i<d;i++) {
			arr1[i]=arr[i];
		}
		for(int i=d;i<arr.length;i++) {
			arr[i-d]=arr[i];
		}
		for(int i=arr.length-d,j=0;i<arr.length;i++) {
			arr[i]=arr1[j];
			if(j<d) {j++;}
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
		leftRotateBy_D_Place(arr);
	}

}
