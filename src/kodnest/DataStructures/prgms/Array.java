package kodnest.DataStructures.prgms;

import java.util.Scanner;

public class Array {
	private int arr[];
	private Scanner sc = new Scanner(System.in);
	
	public Array(int a) {
		arr=new int[a];
	}
	
	public void insert() {
		System.out.print("enter index value from 0 to "+ (arr.length-1));
		int pos=sc.nextInt();
		System.out.print("enter value at index "+pos);
		arr[pos]=sc.nextInt();
	}
	
	
	public void delete() {
		System.out.print("enter index number to delete value");
		int pos=sc.nextInt();
		System.out.print("value deleted is "+arr[pos]);
		arr[pos]=0;
	}
	public void display() {
		for(int i=0;i<=arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	
}
