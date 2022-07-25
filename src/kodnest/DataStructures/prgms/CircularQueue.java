package kodnest.DataStructures.prgms;

import java.util.Scanner;

public class CircularQueue {
	private int cq[];
	private int r=-1;
	private int count=0;
	private int f=0;
	private int size;
	private Scanner sc=new Scanner(System.in);
	
	public CircularQueue(int a) {
		cq=new int[a];
		size=cq.length;
		// TODO Auto-generated constructor stub
	}
	
	public void insert() {
		if(count==size)
			System.out.println("Circular queue is full can't insert");
		else {
			System.out.println("Enter the element");
			r=(r+1)%size;
			cq[r]=sc.nextInt();
			count++;
		}
	}
	
	public void delete() {
		if(count==0)
			System.out.println("CircularQueue is empty,can,t delete");
		else {
			System.out.println("Element deleted is "+cq[f]);
			f=(f+1)%size;
			count--;
		}
	}
	
	public void display() {
		if(count==0)
			System.out.println("Circular Queue is empty can,t display");
		else {
			int f1=f;
			for(int i=1;i<=count;i++) {
				System.out.print(cq[f1]+" ");
				f1=(f1+1)%size;
			}System.out.println();
		}
	}
}
