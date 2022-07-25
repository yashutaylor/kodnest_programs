package kodnest.DataStructures.prgms;

import java.util.Scanner;

public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Linkedlist obj=new Linkedlist();
		while(true) {
			System.out.println("press 1-------> insertRear");
			System.out.println("press 2------->deleteRear");
			System.out.println("press 3------->insertFront");
			System.out.println("press 4------->DeleteFront");
			System.out.println("press 5------->display");
			System.out.println("press any other number to exit");
			
			switch(sc.nextInt()) {
				case 1: obj.insertRear();break;
				case 2: obj.deleteRear();break;
				case 3: obj.insertFront();break;
				case 4: obj.deleteFront();break;
				case 5: obj.display();break;
				default:
					System.out.print("program exited");
					
					
					System.exit(69);
			}
	
		}
	}

}
