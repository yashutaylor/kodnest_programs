package kodnest.DataStructures.prgms;

import java.util.Scanner;

public class Stack {
	private int stk[];
	private Scanner sc = new Scanner(System.in);
	private int size;
	private int top=-1;
	
	public Stack(int a) {
		stk=new int[a];
		size=a;
	}
	public void push() {
		if(top==size-1) {
			System.out.println("Stack is full push is not possible");
		}
		else {
			System.out.println("Enter the element");
			++top;
			stk[top]=sc.nextInt();
		}
	}
	public void pop() {
		if(top==-1)
			System.out.println("stack is empty ,pop is not possible");
		else {
			System.out.println("elememt poped is "+stk[top]);
			top--;
		}
	}
	public void display() {
		if(top==-1)
			System.out.println("stack is empty nothing to display");
		else {
			int i;
			for(i=top;i>=0;i--) {
				System.out.println(stk[i]);
			}
		}
	}
}
