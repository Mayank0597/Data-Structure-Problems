package linkedList;

import java.util.Scanner;

public class LL {
	 Node head;
	   private int size;


	   LL () {
	       size = 0;
	   }


	   public class Node {
	       int data;
	       Node next;


	       Node(int data) {
	           this.data = data;
	           this.next = null;
	           size++;
	       }
	   }


	   public void addFirst(int data) {
	       Node newNode = new Node(data);
	       newNode.next = head;
	       head = newNode;
	   }


	   public void addLast(int data) {
	       Node newNode = new Node(data);


	       if(head == null) {
	           head = newNode;
	           return;
	       }


	       Node lastNode = head;
	       while(lastNode.next != null) {
	           lastNode = lastNode.next;
	       }


	       lastNode.next = newNode;
	   }


	   public void printList() {
	       Node currNode = head;


	       while(currNode != null) {
	           System.out.print(currNode.data+" -> ");
	           currNode = currNode.next;
	       }


	       System.out.println("null");
	   }


	   public void removeFirst() {
	       if(head == null) {
	           System.out.println("Empty List, nothing to delete");
	           return;
	       }


	       head = this.head.next;
	       size--;
	   }


	   public void removeLast() {
	       if(head == null) {
	           System.out.println("Empty List, nothing to delete");
	           return;
	       }


	       size--;
	       if(head.next == null) {
	           head = null;
	           return;
	       }


	       Node currNode = head;
	       Node lastNode = head.next;
	       while(lastNode.next != null) {
	           currNode = currNode.next;
	           lastNode = lastNode.next;
	       }


	       currNode.next = null;
	   }


	   public int getSize() {
	       return size;
	   }
	   
	   public void reverse() {
		   if(head==null || head.next==null) {
			   return;
		   }
		   Node prevNode=head;
		   Node currNode=head.next;
		   while(currNode!=null) {
			   Node nextNode=currNode.next;
			   currNode.next=prevNode;
			   prevNode=currNode;
			   currNode=nextNode;
		   }
		   head.next=null;
		   head=prevNode;
	   }
	   
	   public Node removeNthNodeFromLast(int n) {
		   if(head==null && head.next==null) {
			   return null;
		   }
		   int size=getSize();
		   int i=0;
		   Node temp=head;
		   while(i<(size-n)) {
			   temp=temp.next;
			   i++;
		   }
		   temp.next=temp.next.next;
		   return temp;
	   }

	   public static void main(String args[]) {
		   Scanner sc = new Scanner(System.in);
	       LL list = new LL();
	       list.addLast(4);
	       list.addLast(5);
	       list.addLast(6);
	       //list.printList();
	       list.addFirst(3);
	       list.printList();
	       System.out.println("Size of LinkedList is "+list.getSize());
	 
	       list.removeFirst();
	       list.printList();


	       list.removeLast();
	       list.printList();
	       
	       list.addFirst(3);
	       list.addFirst(2);
	       list.addFirst(1);
	       list.printList();
	       
	       list.reverse();
	       System.out.println("Reversed LinkedList is");
	       list.printList();
	       
	       System.out.println("Enter nth node from last which is to be removed");
	       Node n = list.removeNthNodeFromLast(sc.nextInt());
	       System.out.println("Removed element is "+n.data);
	   }
	}

	 

