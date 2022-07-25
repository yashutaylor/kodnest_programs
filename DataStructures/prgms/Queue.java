package kodnest.DataStructures.prgms;

import java.util.Scanner;

public class Queue {
	private int que[];
	private int f=0;
	private int r=-1;
	private Scanner sc=new Scanner(System.in);
	public Queue(int a) {
		que=new int[a];
		
	}
	public void insert() {
		if(r==que.length-1)
			System.out.println("Queue is full, can't insert");
		else {
			System.out.println("enter the element");
			r++;
			que[r]=sc.nextInt();
		}
	}
	public void delete() {
		if(r==-1||f>r)
			System.out.println("Queue is empty, can't delete");
		else {
			System.out.println("deleted element is "+que[f]);
			f++;
		}
	}
	public void display() {
		if(r==-1||f>r)
			System.out.println("Queue is empty, can't display");
		else {
			for(int i=f;i<=r;i++)
				System.out.print(que[i]+ " ");
			System.out.println();
		}
	}
}
