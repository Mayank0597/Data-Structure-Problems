package linkedList;

import java.util.LinkedList;

public class LLCollection {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.addFirst(0);
		ll.addLast(3);
		ll.remove();
		
		for(int i:ll) {
			System.out.print(i+" -> ");
		}
		System.out.print("Null");
		System.out.println();
		System.out.println("Size of LinkedList is "+ll.size());
		

	}

}
