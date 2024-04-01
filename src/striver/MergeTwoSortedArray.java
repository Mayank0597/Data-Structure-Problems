package striver;

public class MergeTwoSortedArray {
	
	public static void mergeTwoSortedArraysWithoutExtraSpace(int []a, int []b){
        // Write your code here.
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while(i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
         while(j<b.length){
            System.out.print(b[j]+" ");
            j++;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,6,9};
		int[] b= {2,3,6,8};
		mergeTwoSortedArraysWithoutExtraSpace(a, b);

	}

}
