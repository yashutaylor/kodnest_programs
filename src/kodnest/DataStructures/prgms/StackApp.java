package kodnest.DataStructures.prgms;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of Stack");
		Stack obj=new Stack(sc.nextInt());
		while(true) {
			System.out.println("press 1-------> push");
			System.out.println("press 2------->pop");
			System.out.println("press 3------->display");
			System.out.println("press any other number to exit");
			
			switch(sc.nextInt()) {
				case 1: obj.push();break;
				case 2: obj.pop();break;
				case 3: obj.display();break;
				default:System.exit(69);
			}
	
		}
	}

}
