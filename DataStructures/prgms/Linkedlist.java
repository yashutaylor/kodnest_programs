package kodnest.DataStructures.prgms;

import java.util.Scanner;

public class Linkedlist {
	
	class Node{
		int data;
		Node link;
	}
	private Scanner sc=new Scanner(System.in);
	private Node first;
	
	public void insertRear() {
		Node temp;
		Node newnNode=new Node();
		System.out.println("Enter the element");
		newnNode.data=sc.nextInt();
		newnNode.link=null;
		if(first==null)
			first=newnNode;
		else {
			temp=first;
			while(temp.link!=null) {
				temp=temp.link;
			}
			temp.link=newnNode;
		}
	}
	public void deleteRear() {
		Node temp;
		if(first==null)
			System.out.println("List is empty,can't delete");
		else if (first.link==null) {
			System.out.println("Deleted element is "+first.data);
			first=null;
		}
		else {
			temp=first;
			while(temp.link.link!=null) {
				temp=temp.link;
			}
			System.out.println("Deleted element is "+temp.link.data);
			temp.link=null;
		}
	}
	public void insertFront() {
		System.out.println("Enter the element");
		Node temp;
		Node newnNode=new Node();
		newnNode.data=sc.nextInt();
		newnNode.link=null;
		if(first==null)
			first=newnNode;
		else {
			newnNode.link=first;
			first=newnNode;
		}
	}
	public void deleteFront() {
		if(first==null)
			System.out.println("List is empty , can't delete");
		else if (first.link==null) {
			first=null;
		}
		else {
			System.out.println("Element deleted is "+first.data);
			first=first.link;
		}
	}
	public void display() {
		if(first==null)
			System.out.println("List is empty , nothing to display");
		else if(first.link==null){
			System.out.println(first.data);
		}
		else {
			Node temp;
			temp=first;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
			System.out.println();
		}
	}
}






















