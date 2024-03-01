package arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
		int a=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) 
				a++;
			else
			System.out.println("Missing no is "+a);
			break;
		}

	}

}
