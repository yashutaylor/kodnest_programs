package kodnest.DataStructures.prgms;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of Queue");
		Queue obj=new Queue(sc.nextInt());
		while(true) {
			System.out.println("press 1-------> insert");
			System.out.println("press 2------->delete");
			System.out.println("press 3------->display");
			System.out.println("press any other number to exit");
			
			switch(sc.nextInt()) {
				case 1: obj.insert();break;
				case 2: obj.delete();break;
				case 3: obj.display();break;
				default:System.exit(69);
			}
	
		}
	}

}
