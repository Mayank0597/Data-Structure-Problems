package strings;

import java.util.Scanner;

public class StringClass {
	public static double shortestPath(String str) {
		int x=0,y=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='E')
				x++;
			else if(str.charAt(i)=='W')
				x--;
			else if(str.charAt(i)=='N')
				y++;
			else if(str.charAt(i)=='S')
				y--;
		}
		double result = Math.sqrt((x*x)+(y*y));
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter direction");
		String dir="WNEENESENNN";
		
		double res=shortestPath(dir);
		System.out.println("Shortest path is "+res);

	}

}
