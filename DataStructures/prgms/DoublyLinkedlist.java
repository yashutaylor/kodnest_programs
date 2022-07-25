package kodnest.DataStructures.prgms;

import java.util.Scanner;

public class DoublyLinkedlist {
	class Node {
		int data;
		Node prvlink;
		Node nxtlink;
	}
	private Node first;
	private Scanner sc= new Scanner(System.in);
	
	public void insertFront() {
		System.out.println("Enter element");
		Node newnode = new Node();
		newnode.data=sc.nextInt();
		newnode.prvlink=null;
		newnode.nxtlink=null;
		
		if(first==null)
			first=newnode;
		else {
			first.prvlink=newnode;
			first=newnode;
		}
	}
	public void deleteFront() {
		if(first==null)
			System.out.println("List is empty nothing to delete");
		else if (first.nxtlink==null) {
				System.out.println("Element deleted is "+first.data);
				first=null;
		}
		else {
			System.out.println("Element deleted is "+first.data);
			first=first.nxtlink;
			first.prvlink=null;
		}
	}
	public void insertRear() {
		Node temp;
		System.out.println("Enter element");
		Node newnode = new Node();
		newnode.data=sc.nextInt();
		newnode.prvlink=null;
		newnode.nxtlink=null;
		
		if(first==null)
			first=newnode;
		else {
			 temp=first;
			while(temp.nxtlink!=null) {
				temp=temp.nxtlink;
			}
			temp.nxtlink=newnode;
			newnode.prvlink=temp;
		}
	}
	public void deleteRear() {
		Node temp;
		if(first==null)
			System.out.println("List is empty nothing to delete");
		else if (first.nxtlink==null) {
				System.out.println("Element deleted is "+first.data);
				first=null;
		}
		else {
			 temp=first;
			while(temp.nxtlink.nxtlink!=null) {
				temp=temp.nxtlink;
			}
			System.out.println("Element deleted is "+temp.nxtlink.data);
			temp.nxtlink=null;
		}
	}
	public void displayForward() {
		Node temp;
		if(first==null)
			System.out.println("List is empty ,nothing to dispaly");
		else if (first.nxtlink==null) {
				System.out.println(first.data);
		}
		else {
			 temp=first;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.nxtlink;
			}
			System.out.println();
		}
	}
	public void displayReverse() {
		Node temp;
		if(first==null)
			System.out.println("List is empty nothing to display");
		else if (first.nxtlink==null) {
				System.out.println(first.data);
		}
		else {
			 temp=first;
			while(temp.nxtlink!=null) {
				temp=temp.nxtlink;
			}
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.prvlink;
			}
			System.out.println();
		}
	}
}
























































